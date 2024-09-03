package com.tiendaderopa.tiendaderopa.Model;

import java.util.Date;

import com.tiendaderopa.tiendaderopa.Enum.TipoEntidad;
import com.tiendaderopa.tiendaderopa.Enum.TipoEvento;
import com.tiendaderopa.tiendaderopa.Model.User.Employee.EmpleadoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Auditoria")
@Entity
public class AuditoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Auditoria")
    private long idAuditoria;

    @ManyToOne
    @JoinColumn(name = "ID_Empleado", nullable = false)
    private EmpleadoModel empleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_Entidad", nullable = false)
    private TipoEntidad tipoEntidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_Evento", nullable = false)
    private TipoEvento tipoEvento;

    @Column(name = "Fecha_Evento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaEvento = new Date();

    @Lob
    @Column(name = "Detalles", nullable = true)
    private String detalles = null;

    public AuditoriaModel() {

    }

    public long getIdAuditoria() {
        return this.idAuditoria;
    }

    public void setIdAuditoria(long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public EmpleadoModel getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(EmpleadoModel empleado) {
        this.empleado = empleado;
    }

    public TipoEntidad getTipoEntidad() {
        return this.tipoEntidad;
    }

    public void setTipoEntidad(TipoEntidad tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public TipoEvento getTipoEvento() {
        return this.tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Date getFechaEvento() {
        return this.fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getDetalles() {
        return this.detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
