package com.tiendaderopa.tiendaderopa.Model;

import java.util.Date;

import com.tiendaderopa.tiendaderopa.Enum.TipoMovimiento;
import com.tiendaderopa.tiendaderopa.Model.Buy.CompraModel;
import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.VentaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Kardex")
@Entity
public class KardexModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Kardex")
    private long idKardex;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @ManyToOne
    @JoinColumn(name = "ID_Compra", nullable = true)
    private CompraModel compra = null;

    @ManyToOne
    @JoinColumn(name = "ID_Venta", nullable = true)
    private VentaModel venta = null;

    @Column(name = "Cantidad")
    private int cantidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_Movimiento", nullable = false)
    private TipoMovimiento tipoMovimiento;

    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_Movimiento", nullable = false)
    private Date fechaMovimiento = new Date();

    public KardexModel() {

    }

    public long getIdKardex() {
        return this.idKardex;
    }

    public void setIdKardex(long idKardex) {
        this.idKardex = idKardex;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public CompraModel getCompra() {
        return this.compra;
    }

    public void setCompra(CompraModel compra) {
        this.compra = compra;
    }

    public VentaModel getVenta() {
        return this.venta;
    }

    public void setVenta(VentaModel venta) {
        this.venta = venta;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoMovimiento getTipoMovimiento() {
        return this.tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Date getFechaMovimiento() {
        return this.fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }
}
