package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Temporada;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Producto_Temporada")
@Entity
public class ProductoTemporadaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto_Temporada")
    private long idProductoTemporada;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @ManyToOne
    @JoinColumn(name = "ID_Temporada", nullable = false)
    private TemporadaModel temporada;

    public ProductoTemporadaModel() {

    }

    public long getIdProductoTemporada() {
        return this.idProductoTemporada;
    }

    public void setIdProductoTemporada(long idProductoTemporada) {
        this.idProductoTemporada = idProductoTemporada;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public TemporadaModel getTemporada() {
        return this.temporada;
    }

    public void setTemporada(TemporadaModel temporada) {
        this.temporada = temporada;
    }
}
