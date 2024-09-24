package com.tiendaderopa.tiendaderopa.DTO.Request.Compra;

import java.util.Date;

public class SaveRequest {
    
    private long estadoCompraId;
    private long igvId;
    private long medioPagoId;
    private double precioIgv;
    private double precioTotal;
    private Date fechaCompra;
    private String comentarios;

    public SaveRequest() {
        
    }

    public long getEstadoCompraId() {
        return this.estadoCompraId;
    }

    public void setEstadoCompraId(long estadoCompraId) {
        this.estadoCompraId = estadoCompraId;
    }

    public long getIgvId() {
        return this.igvId;
    }

    public void setIgvId(long igvId) {
        this.igvId = igvId;
    }

    public long getMedioPagoId() {
        return this.medioPagoId;
    }

    public void setMedioPagoId(long medioPagoId) {
        this.medioPagoId = medioPagoId;
    }

    public double getPrecioIgv() {
        return this.precioIgv;
    }

    public void setPrecioIgv(double precioIgv) {
        this.precioIgv = precioIgv;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Date getFechaCompra() {
        return this.fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
