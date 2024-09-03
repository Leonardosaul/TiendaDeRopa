package com.tiendaderopa.tiendaderopa.Model.User.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.User.Employee.EmpleadoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Tipo_Contrato")
@Entity
public class TipoContratoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Tipo_Contrato")
    private long idTipoContrato;

    @Column(name = "No_Tipo_Contrato", nullable = false, length = 200)
    private String noTipoContrato;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @Column(name = "Acronimo", nullable = true, length = 20)
    private String acronimo = null;

    @OneToMany(mappedBy = "tipoContrato")
    private List<EmpleadoModel> empleados;

    public TipoContratoModel() {

    }

    public long getIdTipoContrato() {
        return this.idTipoContrato;
    }

    public void setIdTipoContrato(long idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public String getNoTipoContrato() {
        return this.noTipoContrato;
    }

    public void setNoTipoContrato(String noTipoContrato) {
        this.noTipoContrato = noTipoContrato;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
}
