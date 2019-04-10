/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans.impl;

import com.example.ejb.sessionbeans.CocineroFacadeLocal;
import com.example.ejb.sessionbeans.AbstractFacade;
import com.example.ejb.entitiy.Cocinero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camilopc
 */
@Stateless
public class CocineroFacade extends AbstractFacade<Cocinero> implements CocineroFacadeLocal {

    @PersistenceContext(unitName = "restaurantePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CocineroFacade() {
        super(Cocinero.class);
    }
    
}
