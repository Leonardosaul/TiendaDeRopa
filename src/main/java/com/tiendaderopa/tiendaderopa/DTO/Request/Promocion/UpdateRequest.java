package com.tiendaderopa.tiendaderopa.DTO.Request.Promocion;

import java.util.Date;

public class UpdateRequest {
    
    private String noPromocion;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private double valorDescuento;
    private boolean estado;
    private Date fechaCreacion;
    private String urlBanner;

    public UpdateRequest() {
        
    }

    public String getNoPromocion() {
        return this.noPromocion;
    }

    public void setNoPromocion(String noPromocion) {
        this.noPromocion = noPromocion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValorDescuento() {
        return this.valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUrlBanner() {
        return this.urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }
}
