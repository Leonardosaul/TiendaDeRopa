package com.tiendaderopa.tiendaderopa.Model.User.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.User.Customer.ClienteModel;
import com.tiendaderopa.tiendaderopa.Model.User.Employee.EmpleadoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Tipo_Documento")
@Entity
public class TipoDocumentoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Tipo_Documento")
    private long idTipoDocumento;

    @Column(name = "No_Tipo_Documento", nullable = false, length = 200)
    private String noTipoDocumento;

    @Column(name = "Rango_Digitos")
    private int rangoDigitos = 8;

    @Column(name = "Acronimo", nullable = true, length = 20)
    private String acronimo = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "tipoDocumento")
    private List<EmpleadoModel> empleados;

    @OneToMany(mappedBy = "tipoDocumento")
    private List<ClienteModel> clientes;

    public TipoDocumentoModel() {

    }

    public long getIdTipoDocumento() {
        return this.idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNoTipoDocumento() {
        return this.noTipoDocumento;
    }

    public void setNoTipoDocumento(String noTipoDocumento) {
        this.noTipoDocumento = noTipoDocumento;
    }

    public int getRangoDigitos() {
        return this.rangoDigitos;
    }

    public void setRangoDigitos(int rangoDigitos) {
        this.rangoDigitos = rangoDigitos;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<EmpleadoModel> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(List<EmpleadoModel> empleados) {
        this.empleados = empleados;
    }

    public List<ClienteModel> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<ClienteModel> clientes) {
        this.clientes = clientes;
    }
}
