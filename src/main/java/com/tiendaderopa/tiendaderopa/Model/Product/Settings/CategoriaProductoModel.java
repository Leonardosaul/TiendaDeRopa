package com.tiendaderopa.tiendaderopa.Model.Product.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Product.ProductoModel;
import com.tiendaderopa.tiendaderopa.Model.Promotion.DetallePromocionModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Categoria_Producto")
@Entity
public class CategoriaProductoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Categoria_Producto")
    private long idCategoriaProducto;

    @Column(name = "No_Categoria", nullable = false, length = 200)
    private String noCategoria;

    @Column(name = "Estado")
    private boolean estado = true;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Lob
    @Column(name = "Imagen_Url", nullable = true)
    private String imagenUrl = null;

    @OneToMany(mappedBy = "categoriaProducto")
    private List<ProductoModel> productos;

    @OneToMany(mappedBy = "categoriaProducto")
    private List<DetallePromocionModel> detallesPromocion;

    public CategoriaProductoModel() {

    }

    public long getIdCategoriaProducto() {
        return this.idCategoriaProducto;
    }

    public void setIdCategoriaProducto(long idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getNoCategoria() {
        return this.noCategoria;
    }

    public void setNoCategoria(String noCategoria) {
        this.noCategoria = noCategoria;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return this.imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public List<ProductoModel> getProductos() {
        return this.productos;
    }

    public void setProductos(List<ProductoModel> productos) {
        this.productos = productos;
    }

    public List<DetallePromocionModel> getDetallesPromocion() {
        return this.detallesPromocion;
    }

    public void setDetallesPromocion(List<DetallePromocionModel> detallesPromocion) {
        this.detallesPromocion = detallesPromocion;
    }
}
