package com.tiendaderopa.tiendaderopa.DTO.Request.TipoEmpresa;

import java.io.Serializable;

public class SaveRequest implements Serializable {
    
    private String noTipoEmpresa;
    private String acronimo;
    private String descripcion;
    private boolean estado;

    public SaveRequest() {
        
    }

    public String getNoTipoEmpresa() {
        return this.noTipoEmpresa;
    }

    public void setNoTipoEmpresa(String noTipoEmpresa) {
        this.noTipoEmpresa = noTipoEmpresa;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
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
