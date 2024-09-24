package com.tiendaderopa.tiendaderopa.DTO.Request.Material;

public class UpdateRequest {
    
    private String noMaterial;
    private String descripcion;
    private String acronimo;

    public UpdateRequest() {

    }

    public String getNoMaterial() {
        return this.noMaterial;
    }

    public void setNoMaterial(String noMaterial) {
        this.noMaterial = noMaterial;
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
}
