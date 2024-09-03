package com.tiendaderopa.tiendaderopa.Model.Sale.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Sale.VentaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Estado_Venta")
@Entity
public class EstadoVentaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Estado_Venta")
    private long idEstadoVenta;

    @Column(name = "No_Estado_Venta", nullable = false, length = 200)
    private String noEstadoVenta;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Acronimo", nullable = false, length = 50)
    private String acronimo;

    @OneToMany(mappedBy = "estadoVenta")
    private List<VentaModel> ventas;

    public EstadoVentaModel() {

    }

    public long getIdEstadoVenta() {
        return this.idEstadoVenta;
    }

    public void setIdEstadoVenta(long idEstadoVenta) {
        this.idEstadoVenta = idEstadoVenta;
    }

    public String getNoEstadoVenta() {
        return this.noEstadoVenta;
    }

    public void setNoEstadoVenta(String noEstadoVenta) {
        this.noEstadoVenta = noEstadoVenta;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public List<VentaModel> getVentas() {
        return this.ventas;
    }

    public void setVentas(List<VentaModel> ventas) {
        this.ventas = ventas;
    }
    
}
