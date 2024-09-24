package com.tiendaderopa.tiendaderopa.DTO.Request.Disponibilidad;

public class UpdateRequest {
    
    private String noDisponibilidad;
    private String descripcion;
    private boolean estado;
    private String acronimo;

    public UpdateRequest() {
        
    }

    public String getNoDisponibilidad() {
        return this.noDisponibilidad;
    }

    public void setNoDisponibilidad(String noDisponibilidad) {
        this.noDisponibilidad = noDisponibilidad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }
}
