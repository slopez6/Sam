/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Managebeans;

import Entity.Contribuyente;
import Mantenimiento.Mante;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;



/**
 *
 * @author Sam
 */

@ManagedBean
@RequestScoped

public class BeanCont{
    private String noNit;
    private String nombreContribuyente;
    private String razonSocial;
    private String representanteLegal;
    private double rentaAnual;
    private String fechaRegistro;
    private String estado;
    
    public BeanCont() {
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombreContribuyente() {
        return nombreContribuyente;
    }

    public void setNombreContribuyente(String nombreContribuyente) {
        this.nombreContribuyente = nombreContribuyente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public double getRentaAnual() {
        return rentaAnual;
    }

    public void setRentaAnual(double rentaAnual) {
        this.rentaAnual = rentaAnual;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public void guardar(){
        Mante m = new Mante();
        Contribuyente c = new Contribuyente();
        
        c.setNoNit(this.noNit);
        c.setNombreContribuyente(this.nombreContribuyente);
        c.setRazonSocial(this.razonSocial);
        c.setRepresentanteLegal(this.representanteLegal);
        c.setRentaAnual(this.rentaAnual);
        
        m.guardar(c);
        
        
    FacesMessage msg = new FacesMessage("Guardando datos...");
    msg.setSeverity(FacesMessage.SEVERITY_INFO);
    FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void limpiar(){
        this.noNit="";
        this.nombreContribuyente="";
        this.razonSocial="";
        this.representanteLegal="";
        this.rentaAnual=0;
        this.fechaRegistro="";
        this.estado="";
    }
    
}
