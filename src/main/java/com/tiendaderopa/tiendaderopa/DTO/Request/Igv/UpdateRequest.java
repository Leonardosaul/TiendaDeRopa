package com.tiendaderopa.tiendaderopa.DTO.Request.Igv;

import java.io.Serializable;

public class UpdateRequest implements Serializable {
    
    private long paisId;
    private double tasa;
    private boolean estado;

    public UpdateRequest() {
        
    }

    public long getPaisId() {
        return this.paisId;
    }

    public void setPaisId(long paisId) {
        this.paisId = paisId;
    }

    public double getTasa() {
        return this.tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
