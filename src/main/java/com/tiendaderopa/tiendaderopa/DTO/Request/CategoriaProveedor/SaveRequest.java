package com.tiendaderopa.tiendaderopa.DTO.Request.CategoriaProveedor;

public class SaveRequest {
    
    private String noCategoriaProveedor;
    private String descripcion;
    private boolean estado;

    public SaveRequest() {
        
    }

    public String getNoCategoriaProveedor() {
        return this.noCategoriaProveedor;
    }

    public void setNoCategoriaProveedor(String noCategoriaProveedor) {
        this.noCategoriaProveedor = noCategoriaProveedor;
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
