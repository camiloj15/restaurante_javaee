/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.beans;

import com.example.ejb.sessionbeans.InformeClienteFacadeLocal;
import com.example.ejb.sessionbeans.InformeMeserosFacadeLocal;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

/**
 *
 * @author camilopc
 */
@Named("informeVentaMeseroController")
@RequestScoped
public class InformeVentaMeseros {

    /**
     * Creates a new instance of InformeVentaMeseros
     */
    public InformeVentaMeseros() {
    }
    @EJB
    private InformeMeserosFacadeLocal ejbFacade;
    private DataModel items = null;

    private InformeMeserosFacadeLocal getFacade() {
        return ejbFacade;
    }

    public DataModel getItems() {
        if (items == null) {
            items = new ListDataModel(getFacade().obtenerVentasDeClientes());
        }
        return items;
    }
}
