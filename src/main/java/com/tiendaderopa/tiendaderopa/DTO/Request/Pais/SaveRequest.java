package com.tiendaderopa.tiendaderopa.DTO.Request.Pais;

import java.io.Serializable;

public class SaveRequest implements Serializable {
    
    private String noPais;
    private String acronimo;
    private String codigoTelefonico;
    private String codigoPostal;

    public SaveRequest() {
        
    }

    public String getNoPais() {
        return this.noPais;
    }

    public void setNoPais(String noPais) {
        this.noPais = noPais;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getCodigoTelefonico() {
        return this.codigoTelefonico;
    }

    public void setCodigoTelefonico(String codigoTelefonico) {
        this.codigoTelefonico = codigoTelefonico;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
