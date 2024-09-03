package com.tiendaderopa.tiendaderopa.Model.User.Customer;

import java.util.Date;
import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.PaisModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.VentaModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.GeneroModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.PlanModel;
import com.tiendaderopa.tiendaderopa.Model.User.Settings.TipoDocumentoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Cliente")
@Entity
public class ClienteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Cliente")
    private long idCliente;

    @ManyToOne
    @JoinColumn(name = "ID_Plan", nullable = false)
    private PlanModel plan;

    @ManyToOne
    @JoinColumn(name = "ID_Tipo_Documento", nullable = false)
    private TipoDocumentoModel tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "ID_Genero", nullable = false)
    private GeneroModel genero;

    @ManyToOne
    @JoinColumn(name = "ID_Pais", nullable = false)
    private PaisModel pais;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_Registro", nullable = false)
    private Date fechaRegistro = new Date();

    @Column(name = "Celular", length = 12, nullable = true)
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

    @OneToMany(mappedBy = "cliente")
    private List<VentaModel> ventas;

    public ClienteModel() {

    }

    public long getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public PlanModel getPlan() {
        return this.plan;
    }

    public void setPlan(PlanModel plan) {
        this.plan = plan;
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

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
