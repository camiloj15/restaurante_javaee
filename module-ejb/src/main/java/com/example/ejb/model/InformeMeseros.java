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
public class InformeMeseros extends Informe {

    private String periodo;

    public InformeMeseros(String periodo, String nombre, String apellido1, String apellido2, String monto) {
        super(nombre, apellido1, apellido2, monto);
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
