/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.beans;

import com.example.ejb.sessionbeans.ClienteFacadeLocal;
import com.example.ejb.sessionbeans.InformeClienteFacadeLocal;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

/**
 *
 * @author camilopc
 */
@Named("informeClienteController")
@RequestScoped
public class InformeClienteManagedBean {

    @EJB
    private InformeClienteFacadeLocal ejbFacade;
    private DataModel items = null;

    /**
     * Creates a new instance of InformeClienteManagedBean
     */
    public InformeClienteManagedBean() {
    }

    private InformeClienteFacadeLocal getFacade() {
        return ejbFacade;
    }

    public DataModel getItems() {
        if (items == null) {
            items = new ListDataModel(getFacade().obtenerClientesQueGastaronMasDeCienMil());
        }
        return items;
    }
}
