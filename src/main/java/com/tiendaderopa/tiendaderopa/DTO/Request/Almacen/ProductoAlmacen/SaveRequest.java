package com.tiendaderopa.tiendaderopa.DTO.Request.Almacen.ProductoAlmacen;

public class SaveRequest {
    
    private long almacenId;

    public SaveRequest() {
        
    }

    public long getAlmacenId() {
        return this.almacenId;
    }

    public void setAlmacenId(long almacenId) {
        this.almacenId = almacenId;
    }
}
