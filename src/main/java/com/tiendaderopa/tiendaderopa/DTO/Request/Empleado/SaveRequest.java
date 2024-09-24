package com.tiendaderopa.tiendaderopa.DTO.Request.Empleado;

import java.io.Serializable;
import java.util.Date;

public class SaveRequest implements Serializable {
    
    private long puestoTrabajoId;
    private long tipoDocumentoId;
    private long generoId;
    private long paisId;
    private long tipoContratoId;
    private String nombre;
    private String apellido;
    private Date fechaInicio;
    private String descripcionLabor;
    private String celular;
    private String numeroDocumento;
    private String direccion;
    private String correoElectronico;
    private String password;
    private boolean estado;

    public SaveRequest() {
        
    }

    public long getPuestoTrabajoId() {
        return this.puestoTrabajoId;
    }

    public void setPuestoTrabajoId(long puestoTrabajoId) {
        this.puestoTrabajoId = puestoTrabajoId;
    }

    public long getTipoDocumentoId() {
        return this.tipoDocumentoId;
    }

    public void setTipoDocumentoId(long tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }

    public long getGeneroId() {
        return this.generoId;
    }

    public void setGeneroId(long generoId) {
        this.generoId = generoId;
    }

    public long getPaisId() {
        return this.paisId;
    }

    public void setPaisId(long paisId) {
        this.paisId = paisId;
    }

    public long getTipoContratoId() {
        return this.tipoContratoId;
    }

    public void setTipoContratoId(long tipoContratoId) {
        this.tipoContratoId = tipoContratoId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDescripcionLabor() {
        return this.descripcionLabor;
    }

    public void setDescripcionLabor(String descripcionLabor) {
        this.descripcionLabor = descripcionLabor;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
