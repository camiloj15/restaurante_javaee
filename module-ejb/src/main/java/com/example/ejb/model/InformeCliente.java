/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.model;

/**
 *
 * @author camilopc
 */
public class InformeCliente extends Informe {
    
    private String documento;

    public InformeCliente(String nombre, String apellido1, String apellido2, String documento,  String monto) {
        super(nombre, apellido1, apellido2, monto);
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
}
