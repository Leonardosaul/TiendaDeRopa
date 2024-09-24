package com.tiendaderopa.tiendaderopa.DTO.Request.Almacen.ProductoAlmacen;

public class UpdateRequest {
    
    private long almacenId;

    public UpdateRequest() {
        
    }

    public long getAlmacenId() {
        return this.almacenId;
    }

    public void setAlmacenId(long almacenId) {
        this.almacenId = almacenId;
    }
}
