package com.tiendaderopa.tiendaderopa.DTO.Request.Proveedor;

import java.util.Date;

public class SaveRequest {
    
    private long paisId;
    private long tipoEmpresaId;
    private long categoriaProveedorId;
    private long tipoRucId;
    private String ruc;
    private String noProveedor;
    private String telefono;
    private String correoElectronico;
    private Date fechaInicioActividad;
    private String representanteVentas;
    private String nota;

    public SaveRequest() {

    }

    public long getPaisId() {
        return this.paisId;
    }

    public void setPaisId(long paisId) {
        this.paisId = paisId;
    }

    public long getTipoEmpresaId() {
        return this.tipoEmpresaId;
    }

    public void setTipoEmpresaId(long tipoEmpresaId) {
        this.tipoEmpresaId = tipoEmpresaId;
    }

    public long getCategoriaProveedorId() {
        return this.categoriaProveedorId;
    }

    public void setCategoriaProveedorId(long categoriaProveedorId) {
        this.categoriaProveedorId = categoriaProveedorId;
    }

    public long getTipoRucId() {
        return this.tipoRucId;
    }

    public void setTipoRucId(long tipoRucId) {
        this.tipoRucId = tipoRucId;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNoProveedor() {
        return this.noProveedor;
    }

    public void setNoProveedor(String noProveedor) {
        this.noProveedor = noProveedor;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaInicioActividad() {
        return this.fechaInicioActividad;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public String getRepresentanteVentas() {
        return this.representanteVentas;
    }

    public void setRepresentanteVentas(String representanteVentas) {
        this.representanteVentas = representanteVentas;
    }

    public String getNota() {
        return this.nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
