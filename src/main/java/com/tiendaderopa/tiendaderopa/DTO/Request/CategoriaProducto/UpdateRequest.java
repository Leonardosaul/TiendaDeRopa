package com.tiendaderopa.tiendaderopa.DTO.Request.CategoriaProducto;

public class UpdateRequest {
    
    private String noCategoria;
    private boolean estado;
    private String descripcion;
    private String imagenUrl;

    public UpdateRequest() {

    }

    public String getNoCategoria() {
        return this.noCategoria;
    }

    public void setNoCategoria(String noCategoria) {
        this.noCategoria = noCategoria;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return this.imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}
