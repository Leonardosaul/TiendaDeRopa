package com.tiendaderopa.tiendaderopa.Model.Promotion;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.CategoriaProductoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Detalles_Promocion")
@Entity
public class DetallePromocionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Detalle_Promocion")
    private long idDetallePromocion;

    @ManyToOne
    @JoinColumn(name = "ID_Promocion", nullable = false)
    private PromocionModel promocion;

    @ManyToOne
    @JoinColumn(name = "ID_Producto", nullable = true)
    private ProductoModel producto = null;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria_Producto", nullable = true)
    private CategoriaProductoModel categoriaProducto = null;

    public DetallePromocionModel() {

    }

    public long getIdDetallePromocion() {
        return this.idDetallePromocion;
    }

    public void setIdDetallePromocion(long idDetallePromocion) {
        this.idDetallePromocion = idDetallePromocion;
    }

    public PromocionModel getPromocion() {
        return this.promocion;
    }

    public void setPromocion(PromocionModel promocion) {
        this.promocion = promocion;
    }

    public ProductoModel getProducto() {
        return this.producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public CategoriaProductoModel getCategoriaProducto() {
        return this.categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProductoModel categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
}
