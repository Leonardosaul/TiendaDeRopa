package com.tiendaderopa.tiendaderopa.DTO.Request.Producto;

import java.util.Date;

public class SaveRequest {
    
    private long disponibilidadId;
    private long categoriaProductoId;
    private String noProducto;
    private String marca;
    private String color;
    private String descripcion;
    private boolean estado;
    private String talla;
    private double precioUnitario;
    private Date fechaRegistro;
    private Date fechaActividad;
    private String carpetaImagenesUrl;

    public SaveRequest() {
        
    }

    public long getDisponibilidadId() {
        return this.disponibilidadId;
    }

    public void setDisponibilidadId(long disponibilidadId) {
        this.disponibilidadId = disponibilidadId;
    }

    public long getCategoriaProductoId() {
        return this.categoriaProductoId;
    }

    public void setCategoriaProductoId(long categoriaProductoId) {
        this.categoriaProductoId = categoriaProductoId;
    }

    public String getNoProducto() {
        return this.noProducto;
    }

    public void setNoProducto(String noProducto) {
        this.noProducto = noProducto;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActividad() {
        return this.fechaActividad;
    }

    public void setFechaActividad(Date fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getCarpetaImagenesUrl() {
        return this.carpetaImagenesUrl;
    }

    public void setCarpetaImagenesUrl(String carpetaImagenesUrl) {
        this.carpetaImagenesUrl = carpetaImagenesUrl;
    }
}
