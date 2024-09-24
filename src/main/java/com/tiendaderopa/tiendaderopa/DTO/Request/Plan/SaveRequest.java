package com.tiendaderopa.tiendaderopa.DTO.Request.Plan;

public class SaveRequest {
    
    private String noPlan;
    private String beneficios;
    private double precioMensual;
    private String descripcion;

    public SaveRequest() {
        
    }

    public String getNoPlan() {
        return this.noPlan;
    }

    public void setNoPlan(String noPlan) {
        this.noPlan = noPlan;
    }

    public String getBeneficios() {
        return this.beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public double getPrecioMensual() {
        return this.precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
