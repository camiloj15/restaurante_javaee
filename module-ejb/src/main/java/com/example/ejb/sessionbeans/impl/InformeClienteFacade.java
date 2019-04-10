/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans.impl;

import com.example.ejb.model.InformeCliente;
import com.example.ejb.queries.InformeStaticQuery;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.example.ejb.sessionbeans.InformeClienteFacadeLocal;
import javax.ejb.Stateless;

/**
 *
 * @author camilopc
 */
@Stateless
public class InformeClienteFacade implements InformeClienteFacadeLocal {

    @PersistenceContext(unitName = "restaurantePU")
    private EntityManager em;

    @Override
    public List<InformeCliente> obtenerClientesQueGastaronMasDeCienMil() {
        Query query = em.createNativeQuery(InformeStaticQuery.OBTENER_CLIENTES_CON_GASTO_MAYOR_A_CIEN_MIL);
        List<Object[]> listado = query.getResultList();
        List<InformeCliente> resultado =  listado.stream().map(t ->{
            int index = -1;
            String nombreCliente = t[++index].toString();
            String apellido1 = t[++index].toString();
            String apellido2 = t[++index].toString();
            String documento = t[++index].toString();
            String montoGastado = t[++index].toString();
            InformeCliente informe = new InformeCliente(nombreCliente, apellido1, apellido2, documento, montoGastado);
           return informe; 
        }).collect(Collectors.toList());;
        return resultado;
    }

}
