package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Estilo;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Producto_Estilo")
@Entity
public class ProductoEstiloModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto_Estilo")
    private long idProductoEstilo;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @ManyToOne
    @JoinColumn(name = "ID_Estilo", nullable = false)
    private EstiloModel estilo;

    public ProductoEstiloModel() {

    }

    public long getIdProductoEstilo() {
        return this.idProductoEstilo;
    }

    public void setIdProductoEstilo(long idProductoEstilo) {
        this.idProductoEstilo = idProductoEstilo;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public EstiloModel getEstilo() {
        return this.estilo;
    }

    public void setEstilo(EstiloModel estilo) {
        this.estilo = estilo;
    }
}
