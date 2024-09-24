package com.tiendaderopa.tiendaderopa.DTO.Request.EstadoCompra;

public class SaveRequest {
    
    private String noEstadoCompra;
    private String descripcion;
    private boolean estado;

    public SaveRequest() {
        
    }

    public String getNoEstadoCompra() {
        return this.noEstadoCompra;
    }

    public void setNoEstadoCompra(String noEstadoCompra) {
        this.noEstadoCompra = noEstadoCompra;
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
