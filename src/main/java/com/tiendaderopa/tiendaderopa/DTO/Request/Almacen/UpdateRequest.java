package com.tiendaderopa.tiendaderopa.DTO.Request.Almacen;

import java.util.Date;

public class UpdateRequest {
    
    private String noAlmacen;
    private String ubicacion;
    private Date fechaOperaciones;
    private int capacidad;
    private boolean estado;

    public UpdateRequest() {
        
    }

    public String getNoAlmacen() {
        return this.noAlmacen;
    }

    public void setNoAlmacen(String noAlmacen) {
        this.noAlmacen = noAlmacen;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaOperaciones() {
        return this.fechaOperaciones;
    }

    public void setFechaOperaciones(Date fechaOperaciones) {
        this.fechaOperaciones = fechaOperaciones;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
