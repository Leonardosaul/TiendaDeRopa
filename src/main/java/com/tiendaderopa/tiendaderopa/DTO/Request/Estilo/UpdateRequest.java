package com.tiendaderopa.tiendaderopa.DTO.Request.Estilo;

public class UpdateRequest {
    
    private String noEstilo;
    private String descripcion;
    private boolean estado;

    public UpdateRequest() {
        
    }

    public String getNoEstilo() {
        return this.noEstilo;
    }

    public void setNoEstilo(String noEstilo) {
        this.noEstilo = noEstilo;
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
}
