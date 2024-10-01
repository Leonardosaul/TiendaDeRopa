package com.tiendaderopa.tiendaderopa.DTO.Request.Compra.DetalleCompra;

public class SaveRequest {
    
    private long compraId;
    private long productoId;
    private long proveedorId;
    private int cantidad;
    private double precioBruto;

    public SaveRequest() {
        
    }

    public long getCompraId() {
        return this.compraId;
    }

    public void setCompraId(long compraId) {
        this.compraId = compraId;
    }

    public long getProductoId() {
        return this.productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public long getProveedorId() {
        return this.proveedorId;
    }

    public void setProveedorId(long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBruto() {
        return this.precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }
}
