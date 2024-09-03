package com.tiendaderopa.tiendaderopa.Model;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Buy.CompraModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.VentaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Medio_Pago")
@Entity
public class MedioPagoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Medio_Pago")
    private long idMedioPago;

    @Column(name = "No_Medio_Pago", nullable = false, length = 300)
    private String noMedioPago;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Acronimo", nullable = false, length = 50)
    private String acronimo;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "medioPago")
    private List<VentaModel> ventas;

    @OneToMany(mappedBy = "medioPago")
    private List<CompraModel> compras;

    public MedioPagoModel() {

    }

    public long getIdMedioPago() {
        return this.idMedioPago;
    }

    public void setIdMedioPago(long idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getNoMedioPago() {
        return this.noMedioPago;
    }

    public void setNoMedioPago(String noMedioPago) {
        this.noMedioPago = noMedioPago;
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

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<VentaModel> getVentas() {
        return this.ventas;
    }

    public void setVentas(List<VentaModel> ventas) {
        this.ventas = ventas;
    }

    public List<CompraModel> getCompras() {
        return this.compras;
    }

    public void setCompras(List<CompraModel> compras) {
        this.compras = compras;
    }
}
