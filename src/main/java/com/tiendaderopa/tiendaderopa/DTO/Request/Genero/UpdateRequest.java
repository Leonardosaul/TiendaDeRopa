package com.tiendaderopa.tiendaderopa.DTO.Request.Genero;

import java.io.Serializable;

public class UpdateRequest implements Serializable {

    private String noGenero;
    private String acronimo;

    public UpdateRequest() {
        
    }

    public String getNoGenero() {
        return this.noGenero;
    }

    public void setNoGenero(String noGenero) {
        this.noGenero = noGenero;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }
}