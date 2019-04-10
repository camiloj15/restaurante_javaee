/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans.impl;

import com.example.ejb.sessionbeans.DetalleFacturaFacadeLocal;
import com.example.ejb.sessionbeans.AbstractFacade;
import com.example.ejb.entitiy.DetalleFactura;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author camilopc
 */
@Stateless
public class DetalleFacturaFacade extends AbstractFacade<DetalleFactura> implements DetalleFacturaFacadeLocal {

    @PersistenceContext(unitName = "restaurantePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleFacturaFacade() {
        super(DetalleFactura.class);
    }
    
}
