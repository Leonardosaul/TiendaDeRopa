package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Material;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Producto_Material")
@Entity
public class ProductoMaterialModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto_Material")
    private long idProductoMaterial;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = false)
    private ProductoModel producto;

    @ManyToOne
    @JoinColumn(name = "ID_Material", nullable = false)
    private MaterialModel material;

    public ProductoMaterialModel() {

    }

    public long getIdProductoMaterial() {
        return this.idProductoMaterial;
    }

    public void setIdProductoMaterial(long idProductoMaterial) {
        this.idProductoMaterial = idProductoMaterial;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public MaterialModel getMaterial() {
        return this.material;
    }

    public void setMaterial(MaterialModel material) {
        this.material = material;
    }
}
