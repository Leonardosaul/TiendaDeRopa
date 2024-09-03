package com.tiendaderopa.tiendaderopa.Model.Buy;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;
import com.tiendaderopa.tiendaderopa.Model.Provider.ProveedorModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Detalle_Compra")
@Entity
public class DetalleCompraModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Detalle_Compra")
    private long idDetalleCompra;

    @ManyToOne
    @JoinColumn(name = "ID_Compra", nullable = false)
    private CompraModel compra;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @ManyToOne
    @JoinColumn(name = "ID_Proveedor", nullable = false)
    private ProveedorModel proveedor;

    @Column(name = "Cantidad")
    private int cantidad;

    @Column(name = "Precio_Bruto")
    private double precioBruto;

    public DetalleCompraModel() {

    }

    public long getIdDetalleCompra() {
        return this.idDetalleCompra;
    }

    public void setIdDetalleCompra(long idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public CompraModel getCompra() {
        return this.compra;
    }

    public void setCompra(CompraModel compra) {
        this.compra = compra;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public ProveedorModel getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(ProveedorModel proveedor) {
        this.proveedor = proveedor;
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
