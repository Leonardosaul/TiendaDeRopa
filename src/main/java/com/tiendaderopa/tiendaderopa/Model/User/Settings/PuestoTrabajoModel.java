package com.tiendaderopa.tiendaderopa.Model.User.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.User.Employee.EmpleadoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Puesto_Trabajo")
@Entity
public class PuestoTrabajoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Puesto_Trabajo")
    private long idPuestoTrabajo;

    @Column(name = "No_Puesto_Trabajo", nullable = false, length = 200)
    private String noPuestoTrabajo;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "puestoTrabajo")
    private List<EmpleadoModel> empleados;

    public PuestoTrabajoModel() {

    }

    public long getIdPuestoTrabajo() {
        return this.idPuestoTrabajo;
    }

    public void setIdPuestoTrabajo(long idPuestoTrabajo) {
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    public String getNoPuestoTrabajo() {
        return this.noPuestoTrabajo;
    }

    public void setNoPuestoTrabajo(String noPuestoTrabajo) {
        this.noPuestoTrabajo = noPuestoTrabajo;
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
}
