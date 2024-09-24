package com.tiendaderopa.tiendaderopa.DTO.Request.Temporada.ProductoTemporada;

public class UpdateRequest {
    
    private long temporadaId;

    public UpdateRequest() {
        
    }

    public long getTemporadaId() {
        return this.temporadaId;
    }

    public void setTemporadaId(long temporadaId) {
        this.temporadaId = temporadaId;
    }
}
