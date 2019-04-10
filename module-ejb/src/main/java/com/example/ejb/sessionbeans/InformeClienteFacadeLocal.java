/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.sessionbeans;

import com.example.ejb.model.InformeCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author camilopc
 */
@Local
public interface InformeClienteFacadeLocal {
    
    public List<InformeCliente> obtenerClientesQueGastaronMasDeCienMil();
    
}
