/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans.impl;

import com.example.ejb.model.InformeCliente;
import com.example.ejb.model.InformeMeseros;
import com.example.ejb.queries.InformeStaticQuery;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.example.ejb.sessionbeans.InformeClienteFacadeLocal;
import com.example.ejb.sessionbeans.InformeMeserosFacadeLocal;
import java.time.LocalDate;
import java.util.Locale;
import javax.ejb.Stateless;

/**
 *
 * @author camilopc
 */
@Stateless
public class InformeMeseroFacade implements InformeMeserosFacadeLocal {

    @PersistenceContext(unitName = "restaurantePU")
    private EntityManager em;

    @Override
    public List<InformeMeseros> obtenerVentasDeClientes() {
        Query query = em.createNativeQuery(InformeStaticQuery.OBTENER_VENTAS_MESERO_POR_MES_ANO);
        List<Object[]> listado = query.getResultList();
        List<InformeMeseros> resultado =  listado.stream().map(t ->{
            int index = -1;
            String nombreCliente = t[++index].toString();
            String apellido1 = t[++index].toString();
            String apellido2 = t[++index].toString();
            String montoGastado = t[++index].toString();
            Integer mes = Integer.valueOf(t[++index].toString());
            Integer ano = Integer.valueOf(t[++index].toString());
            StringBuilder periodo = new StringBuilder();
            periodo.append(LocalDate.of(ano, mes, 01).getMonth().getDisplayName(java.time.format.TextStyle.FULL, Locale.US));
            periodo.append(", "+ano);
            InformeMeseros informe = new InformeMeseros(periodo.toString(), nombreCliente, apellido1, apellido2, montoGastado);
           return informe; 
        }).collect(Collectors.toList());;
        return resultado;
    }

}
