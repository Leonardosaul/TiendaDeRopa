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

@Table(name = "Genero")
@Entity
public class GeneroModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Genero")
    private long idGenero;

    @Column(name = "No_Genero", nullable = false, length = 200)
    private String noGenero;

    @Column(name = "Acronimo", nullable = true, length = 20)
    private String acronimo = null;

    @OneToMany(mappedBy = "genero")
    private List<EmpleadoModel> empleados;

    @OneToMany(mappedBy = "genero")
    private List<ClienteModel> clientes;

    public GeneroModel() {

    }

    public long getIdGenero() {
        return this.idGenero;
    }

    public void setIdGenero(long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNoGenero() {
        return this.noGenero;
    }

    public void setNoGenero(String noGenero) {
        this.noGenero = noGenero;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
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
