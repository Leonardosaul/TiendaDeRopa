package com.tiendaderopa.tiendaderopa.DTO.Request.TipoRuc;

import java.io.Serializable;

public class UpdateRequest implements Serializable {
    
    private long paisId;
    private String noTipoRuc;
    private String descripcion;
    private String acronimo;
    private int cantidadDigitos;
    private boolean estado;

    public UpdateRequest() {
        
    }

    public long getPaisId() {
        return this.paisId;
    }

    public void setPaisId(long paisId) {
        this.paisId = paisId;
    }

    public String getNoTipoRuc() {
        return this.noTipoRuc;
    }

    public void setNoTipoRuc(String noTipoRuc) {
        this.noTipoRuc = noTipoRuc;
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

    public int getCantidadDigitos() {
        return this.cantidadDigitos;
    }

    public void setCantidadDigitos(int cantidadDigitos) {
        this.cantidadDigitos = cantidadDigitos;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
