package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Almacen;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Almacen")
@Entity
public class AlmacenModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Almacen")
    private long idAlmacen;

    @Column(name = "No_Almacen", nullable = false, length = 200)
    private String noAlmacen;

    @Column(name = "Ubicacion", nullable = true, length = 200)
    private String ubicacion = null;

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_Operaciones")
    private Date fechaOperaciones = new Date();

    @Column(name = "Capacidad")
    private int capacidad = 100;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "almacen")
    private List<ProductoAlmacenModel> productosAlmacen;

    public AlmacenModel() {

    }

    public long getIdAlmacen() {
        return this.idAlmacen;
    }

    public void setIdAlmacen(long idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNoAlmacen() {
        return this.noAlmacen;
    }

    public void setNoAlmacen(String noAlmacen) {
        this.noAlmacen = noAlmacen;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaOperaciones() {
        return this.fechaOperaciones;
    }

    public void setFechaOperaciones(Date fechaOperaciones) {
        this.fechaOperaciones = fechaOperaciones;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<ProductoAlmacenModel> getProductosAlmacen() {
        return this.productosAlmacen;
    }

    public void setProductosAlmacen(List<ProductoAlmacenModel> productosAlmacen) {
        this.productosAlmacen = productosAlmacen;
    }
}
