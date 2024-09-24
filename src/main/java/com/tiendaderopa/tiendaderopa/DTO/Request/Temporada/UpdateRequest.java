package com.tiendaderopa.tiendaderopa.DTO.Request.Temporada;

public class UpdateRequest {
    
    private String noTemporada;
    private String descripcion;
    private String mesInicio;
    private String mesFinal;

    public UpdateRequest() {
        
    }

    public String getNoTemporada() {
        return this.noTemporada;
    }

    public void setNoTemporada(String noTemporada) {
        this.noTemporada = noTemporada;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMesInicio() {
        return this.mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public String getMesFinal() {
        return this.mesFinal;
    }

    public void setMesFinal(String mesFinal) {
        this.mesFinal = mesFinal;
    }
}
