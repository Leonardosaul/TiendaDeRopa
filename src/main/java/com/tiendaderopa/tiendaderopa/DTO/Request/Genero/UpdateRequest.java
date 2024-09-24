package com.tiendaderopa.tiendaderopa.DTO.Request.Genero;

public class UpdateRequest {

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