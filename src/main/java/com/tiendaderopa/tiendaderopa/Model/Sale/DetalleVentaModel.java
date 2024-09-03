package com.tiendaderopa.tiendaderopa.Model.Sale;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Detalle_Venta")
@Entity
public class DetalleVentaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Detalle_Venta")
    private long idDetalleVenta;

    @ManyToOne
    @JoinColumn(name = "ID_Venta", nullable = false)
    private VentaModel venta;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @Column(name = "Cantidad", nullable = false)
    private int cantidad;

    @Column(name = "Precio_Bruto", nullable = false)
    private double precioBruto;

    public DetalleVentaModel() {

    }

    public long getIdDetalleVenta() {
        return this.idDetalleVenta;
    }

    public void setIdDetalleVenta(long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public VentaModel getVenta() {
        return this.venta;
    }

    public void setVenta(VentaModel venta) {
        this.venta = venta;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBruto() {
        return this.precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }
}
