/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans.impl;

import com.example.ejb.sessionbeans.CamareroFacadeLocal;
import com.example.ejb.entitiy.Camarero;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camilopc
 */
@Stateless
public class CamareroFacade implements CamareroFacadeLocal {

    @PersistenceContext(unitName = "restaurantePU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CamareroFacade() {
    }

    public void create(Camarero entity) {
        try {
            Camarero camarero = new Camarero();
            camarero.setApellido1(entity.getApellido1());
            camarero.setApellido2(entity.getApellido2());
            camarero.setNombre(camarero.getNombre());
            getEntityManager().persist(camarero);
        } catch (Exception e) {
            throw e;
        }
    }

  public void edit(Camarero entity) {
        getEntityManager().merge(entity);
    }

    public void remove(Camarero entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public Camarero find(Object id) {
        return getEntityManager().find(Camarero.class, id);
    }

    public List<Camarero> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(Camarero.class));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<Camarero> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(Camarero.class));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Camarero> rt = cq.from(Camarero.class);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
