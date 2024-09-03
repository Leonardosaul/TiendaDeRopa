package com.tiendaderopa.tiendaderopa.Model;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Provider.ProveedorModel;
import com.tiendaderopa.tiendaderopa.Model.Provider.Settings.TipoRucModel;
import com.tiendaderopa.tiendaderopa.Model.User.Customer.ClienteModel;
import com.tiendaderopa.tiendaderopa.Model.User.Employee.EmpleadoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Pais")
@Entity
public class PaisModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Pais")
    private long idPais;

    @Column(name = "No_Pais", nullable = false, length = 200)
    private String noPais;

    @Column(name = "Acronimo", length = 20, nullable = true)
    private String acronimo = null;

    @Column(name = "Codigo_Telefonico", nullable = true, length = 5)
    private String codigoTelefonico = null;

    @Column(name = "Codigo_Postal", nullable = true, length = 8)
    private String codigoPostal = null;

    @OneToMany(mappedBy = "pais")
    private List<ClienteModel> clientes;

    @OneToMany(mappedBy = "pais")
    private List<EmpleadoModel> empleados;

    @OneToOne(mappedBy = "pais")
    private IgvModel igv;

    @OneToMany(mappedBy = "pais")
    private List<TipoRucModel> tiposRuc;

    @OneToMany(mappedBy = "pais")
    private List<ProveedorModel> proveedores;

    public PaisModel() {
        
    }

    public long getIdPais() {
        return this.idPais;
    }

    public void setIdPais(long idPais) {
        this.idPais = idPais;
    }

    public String getNoPais() {
        return this.noPais;
    }

    public void setNoPais(String noPais) {
        this.noPais = noPais;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getCodigoTelefonico() {
        return this.codigoTelefonico;
    }

    public void setCodigoTelefonico(String codigoTelefonico) {
        this.codigoTelefonico = codigoTelefonico;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<ClienteModel> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<ClienteModel> clientes) {
        this.clientes = clientes;
    }

    public List<EmpleadoModel> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(List<EmpleadoModel> empleados) {
        this.empleados = empleados;
    }

    public IgvModel getIgv() {
        return this.igv;
    }

    public void setIgv(IgvModel igv) {
        this.igv = igv;
    }

    public List<TipoRucModel> getTiposRuc() {
        return this.tiposRuc;
    }

    public void setTiposRuc(List<TipoRucModel> tiposRuc) {
        this.tiposRuc = tiposRuc;
    }

    public List<ProveedorModel> getProveedores() {
        return this.proveedores;
    }

    public void setProveedores(List<ProveedorModel> proveedores) {
        this.proveedores = proveedores;
    }
}
