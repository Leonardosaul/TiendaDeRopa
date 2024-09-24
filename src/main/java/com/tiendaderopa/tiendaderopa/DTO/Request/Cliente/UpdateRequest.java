package com.tiendaderopa.tiendaderopa.DTO.Request.Cliente;

import java.io.Serializable;
import java.util.Date;

public class UpdateRequest implements Serializable {
    
    private long planId;
    private long tipoDocumentoId;
    private long generoId;
    private long paisId;
    private String nombre;
    private String apellido;
    private Date fechaRegistro;
    private String celular;
    private String numeroDocumento;
    private String direccion;
    private String correoElectronico;
    private String password;
    private boolean estado;

    public UpdateRequest() {
        
    }

    public long getPlanId() {
        return this.planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
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

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
