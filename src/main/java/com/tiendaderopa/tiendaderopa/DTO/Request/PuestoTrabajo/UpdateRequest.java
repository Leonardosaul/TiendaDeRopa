package com.tiendaderopa.tiendaderopa.DTO.Request.PuestoTrabajo;

public class UpdateRequest {
 
    private String noPuestoTrabajo;
    private boolean estado;

    public UpdateRequest() {

    }

    public String getNoPuestoTrabajo() {
        return this.noPuestoTrabajo;
    }

    public void setNoPuestoTrabajo(String noPuestoTrabajo) {
        this.noPuestoTrabajo = noPuestoTrabajo;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
