package com.tiendaderopa.tiendaderopa.Model.Product.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Disponibilidad")
@Entity
public class DisponibilidadModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Disponibilidad")
    private long idDisponibilidad;

    @Column(name = "No_Disponibilidad", nullable = false, length = 200)
    private String noDisponibilidad;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado;

    @Column(name = "Acronimo", nullable = true, length = 20)
    private String acronimo = null;

    @OneToMany(mappedBy = "disponibilidad")
    private List<ProductoModel> productos;

    public DisponibilidadModel() {

    }

    public long getIdDisponibilidad() {
        return this.idDisponibilidad;
    }

    public void setIdDisponibilidad(long idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public String getNoDisponibilidad() {
        return this.noDisponibilidad;
    }

    public void setNoDisponibilidad(String noDisponibilidad) {
        this.noDisponibilidad = noDisponibilidad;
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

    public List<ProductoModel> getProductos() {
        return this.productos;
    }

    public void setProductos(List<ProductoModel> productos) {
        this.productos = productos;
    }
}
