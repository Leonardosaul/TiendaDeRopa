package com.tiendaderopa.tiendaderopa.Model.User.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.User.Customer.ClienteModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Plan")
@Entity
public class PlanModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Plan")
    private long idPlan;

    @Column(name = "No_Plan", nullable = false, length = 200)
    private String noPlan;

    @Lob
    @Column(name = "Beneficios", nullable = false)
    private String beneficios;

    @Column(name = "Precio_Mensual", nullable = false)
    private double precioMensual;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @OneToMany(mappedBy = "plan")
    private List<ClienteModel> clientes;

    public PlanModel() {

    }

    public long getIdPlan() {
        return this.idPlan;
    }

    public void setIdPlan(long idPlan) {
        this.idPlan = idPlan;
    }

    public String getNoPlan() {
        return this.noPlan;
    }

    public void setNoPlan(String noPlan) {
        this.noPlan = noPlan;
    }

    public String getBeneficios() {
        return this.beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public double getPrecioMensual() {
        return this.precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ClienteModel> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<ClienteModel> clientes) {
        this.clientes = clientes;
    }
}
