/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.beans;

import com.example.ejb.sessionbeans.FacturaFacadeLocal;
import com.example.ejb.entitiy.Camarero;
import com.example.ejb.entitiy.Cliente;
import com.example.ejb.entitiy.DetalleFactura;
import com.example.ejb.entitiy.Factura;
import com.example.ejb.entitiy.Mesa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author camilopc
 */
@Named(value = "facturaController123")
@SessionScoped
public class FacturaController123 implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idFactura;
    private Date fechaFactura;
    private Camarero idCamarero;
    private Cliente idCliente;
    private Mesa idMesa;
    private Collection<DetalleFactura> detalleFacturaCollection;

    @EJB
    private FacturaFacadeLocal facturaFacadeLocal;
    

    public List<Factura> getAlumnos() {
        return facturaFacadeLocal.findAll();
    }

    public FacturaController123() {
    }

    public FacturaController123(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public FacturaController123(Integer idFactura, Date fechaFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Camarero getIdCamarero() {
        return idCamarero;
    }

    public void setIdCamarero(Camarero idCamarero) {
        this.idCamarero = idCamarero;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Mesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
    }

    public Collection<DetalleFactura> getDetalleFacturaCollection() {
        return detalleFacturaCollection;
    }

    public void setDetalleFacturaCollection(Collection<DetalleFactura> detalleFacturaCollection) {
        this.detalleFacturaCollection = detalleFacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Factura[ idFactura=" + idFactura + " ]";
    }

}
