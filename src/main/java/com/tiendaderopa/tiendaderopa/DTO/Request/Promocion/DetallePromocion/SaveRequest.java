package com.tiendaderopa.tiendaderopa.DTO.Request.Promocion.DetallePromocion;

public class SaveRequest {
    
    private long promocionId;
    private long productoId;
    private long categoriaProductoId;

    public SaveRequest() {
        
    }

    public long getPromocionId() {
        return this.promocionId;
    }

    public void setPromocionId(long promocionId) {
        this.promocionId = promocionId;
    }

    public long getProductoId() {
        return this.productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public long getCategoriaProductoId() {
        return this.categoriaProductoId;
    }

    public void setCategoriaProductoId(long categoriaProductoId) {
        this.categoriaProductoId = categoriaProductoId;
    }
}
