package com.tiendaderopa.tiendaderopa.DTO.Request.Temporada.ProductoTemporada;

public class SaveRequest {
    
    private long temporadaId;

    public SaveRequest() {
        
    }

    public long getTemporadaId() {
        return this.temporadaId;
    }

    public void setTemporadaId(long temporadaId) {
        this.temporadaId = temporadaId;
    }
}
