package com.tiendaderopa.tiendaderopa.DTO.Request.MedioPago;

import java.io.Serializable;

public class SaveRequest implements Serializable {
    
    private String noMedioPago;
    private String descripcion;
    private String acronimo;
    private boolean estado;

    public SaveRequest() {

    }

    public String getNoMedioPago() {
        return this.noMedioPago;
    }

    public void setNoMedioPago(String noMedioPago) {
        this.noMedioPago = noMedioPago;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
