package com.tiendaderopa.tiendaderopa.DTO.Request.TipoDocumento;

import java.io.Serializable;

public class SaveRequest implements Serializable {
    
    private String noTipoDocumento;
    private int rangoDigitos;
    private String acronimo;
    private boolean estado;

    public SaveRequest() {
        
    }

    public String getNoTipoDocumento() {
        return this.noTipoDocumento;
    }

    public void setNoTipoDocumento(String noTipoDocumento) {
        this.noTipoDocumento = noTipoDocumento;
    }

    public int getRangoDigitos() {
        return this.rangoDigitos;
    }

    public void setRangoDigitos(int rangoDigitos) {
        this.rangoDigitos = rangoDigitos;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
