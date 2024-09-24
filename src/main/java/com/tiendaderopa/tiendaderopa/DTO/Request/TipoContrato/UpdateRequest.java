package com.tiendaderopa.tiendaderopa.DTO.Request.TipoContrato;

public class UpdateRequest {
    
    private String noTipoContrato;
    private String descripcion;
    private boolean estado;
    private String acronimo;

    public UpdateRequest() {
        
    }

    public String getNoTipoContrato() {
        return this.noTipoContrato;
    }

    public void setNoTipoContrato(String noTipoContrato) {
        this.noTipoContrato = noTipoContrato;
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
