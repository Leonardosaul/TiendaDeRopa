package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Almacen;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Producto_Almacen")
@Entity
public class ProductoAlmacenModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto_Almacen")
    private long idProductoAlmacen;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @ManyToOne
    @JoinColumn(name = "ID_Almacen", nullable = false)
    private AlmacenModel almacen;

    public ProductoAlmacenModel() {

    }

    public long getIdProductoAlmacen() {
        return this.idProductoAlmacen;
    }

    public void setIdProductoAlmacen(long idProductoAlmacen) {
        this.idProductoAlmacen = idProductoAlmacen;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public AlmacenModel getAlmacen() {
        return this.almacen;
    }

    public void setAlmacen(AlmacenModel almacen) {
        this.almacen = almacen;
    }
}
