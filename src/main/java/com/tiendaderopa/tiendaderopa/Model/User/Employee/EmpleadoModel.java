package com.tiendaderopa.tiendaderopa.Model.User.Employee;

import java.util.Date;
import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.AuditoriaModel;
import com.tiendaderopa.tiendaderopa.Model.PaisModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.GeneroModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.PuestoTrabajoModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.TipoContratoModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.TipoDocumentoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Empleado")
@Entity
public class EmpleadoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Empleado")
    private long idEmpleado;

    @ManyToOne
    @JoinColumn(name = "ID_Puesto_Trabajo", nullable = false)
    private PuestoTrabajoModel puestoTrabajo;

    @ManyToOne
    @JoinColumn(name = "ID_Tipo_Documento", nullable = false)
    private TipoDocumentoModel tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "ID_Genero", nullable = false)
    private GeneroModel genero;

    @ManyToOne
    @JoinColumn(name = "ID_Pais", nullable = false)
    private PaisModel pais;

    @ManyToOne
    @JoinColumn(name = "ID_Tipo_Contrato", nullable = false)
    private TipoContratoModel tipoContrato;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_Inicio", nullable = false)
    private Date fechaInicio = new Date();

    @Lob
    @Column(name = "Descripcion_Labor", nullable = true)
    private String descripcionLabor = null;

    @Column(name = "Celular", nullable = true, length = 12)
    private String celular = null;

    @Column(name = "Numero_Documento", nullable = false, length = 50)
    private String numeroDocumento;

    @Column(name = "Direccion", nullable = true, length = 200)
    private String direccion = null;

    @Column(name = "Correo_Electronico", nullable = false, length = 200)
    private String correoElectronico;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "empleado")
    private List<AuditoriaModel> auditorias;

    public EmpleadoModel() {

    }

    public long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public PuestoTrabajoModel getPuestoTrabajo() {
        return this.puestoTrabajo;
    }

    public void setPuestoTrabajo(PuestoTrabajoModel puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public TipoDocumentoModel getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoModel tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public GeneroModel getGenero() {
        return this.genero;
    }

    public void setGenero(GeneroModel genero) {
        this.genero = genero;
    }

    public PaisModel getPais() {
        return this.pais;
    }

    public void setPais(PaisModel pais) {
        this.pais = pais;
    }

    public TipoContratoModel getTipoContrato() {
        return this.tipoContrato;
    }

    public void setTipoContrato(TipoContratoModel tipoContrato) {
        this.tipoContrato = tipoContrato;
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
