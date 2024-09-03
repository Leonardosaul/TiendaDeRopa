package com.tiendaderopa.tiendaderopa.Model.Product;

import java.util.Date;
import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.KardexModel;
import com.tiendaderopa.tiendaderopa.Model.Buy.DetalleCompraModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.CategoriaProductoModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.DisponibilidadModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.Almacen.ProductoAlmacenModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.Estilo.ProductoEstiloModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.Material.ProductoMaterialModel;
import com.tiendaderopa.tiendaderopa.Model.Product.Settings.Temporada.ProductoTemporadaModel;
import com.tiendaderopa.tiendaderopa.Model.Promotion.DetallePromocionModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.DetalleVentaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Producto")
@Entity
public class ProductoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto")
    private long idProducto;

    @ManyToOne
    @JoinColumn(name = "ID_Disponibilidad", nullable = false)
    private DisponibilidadModel disponibilidad;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria_Producto", nullable = false)
    private CategoriaProductoModel categoriaProducto;

    @Column(name = "No_Producto", nullable = false, length = 200)
    private String noProducto;

    @Column(name = "Marca", nullable = false, length = 100)
    private String marca;

    @Column(name = "Color", nullable = false, length = 100)
    private String color;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @Column(name = "Talla", nullable = true, length = 20)
    private String talla = null;

    @Column(name = "Precio_Unitario")
    private double precioUnitario = 0.0;

    @Column(name = "Fecha_Registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro = new Date();

    @Column(name = "Fecha_Actividad", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaActividad = null;

    @Lob
    @Column(name = "Carpeta_Imagenes_Url", nullable = true)
    private String carpetaImagenesUrl = null;

    @OneToMany(mappedBy = "producto")
    private List<ProductoTemporadaModel> productosTemporada;
    
    @OneToMany(mappedBy = "producto")
    private List<ProductoAlmacenModel> productosAlmacen;

    @OneToMany(mappedBy = "producto")
    private List<ProductoMaterialModel> productosMaterial;

    @OneToMany(mappedBy = "producto")
    private List<ProductoEstiloModel> productosEstilo;

    @OneToMany(mappedBy = "producto")
    private List<DetalleVentaModel> detallesVenta;

    @OneToMany(mappedBy = "producto")
    private List<DetalleCompraModel> detallesCompra;

    @OneToMany(mappedBy = "producto")
    private List<DetallePromocionModel> detallesPromocion;

    @OneToMany(mappedBy = "producto")
    private List<KardexModel> kardexs;

    public ProductoModel() {

    }

    public long getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public DisponibilidadModel getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(DisponibilidadModel disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public CategoriaProductoModel getCategoriaProducto() {
        return this.categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProductoModel categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getNoProducto() {
        return this.noProducto;
    }

    public void setNoProducto(String noProducto) {
        this.noProducto = noProducto;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActividad() {
        return this.fechaActividad;
    }

    public void setFechaActividad(Date fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getCarpetaImagenesUrl() {
        return this.carpetaImagenesUrl;
    }

    public void setCarpetaImagenesUrl(String carpetaImagenesUrl) {
        this.carpetaImagenesUrl = carpetaImagenesUrl;
    }

    public List<ProductoTemporadaModel> getProductosTemporada() {
        return this.productosTemporada;
    }

    public void setProductosTemporada(List<ProductoTemporadaModel> productosTemporada) {
        this.productosTemporada = productosTemporada;
    }

    public List<ProductoAlmacenModel> getProductosAlmacen() {
        return this.productosAlmacen;
    }

    public void setProductosAlmacen(List<ProductoAlmacenModel> productosAlmacen) {
        this.productosAlmacen = productosAlmacen;
    }

    public List<ProductoMaterialModel> getProductosMaterial() {
        return this.productosMaterial;
    }

    public void setProductosMaterial(List<ProductoMaterialModel> productosMaterial) {
        this.productosMaterial = productosMaterial;
    }

    public List<ProductoEstiloModel> getProductosEstilo() {
        return this.productosEstilo;
    }

    public void setProductosEstilo(List<ProductoEstiloModel> productosEstilo) {
        this.productosEstilo = productosEstilo;
    }

    public List<DetalleVentaModel> getDetallesVenta() {
        return this.detallesVenta;
    }

    public void setDetallesVenta(List<DetalleVentaModel> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public List<DetalleCompraModel> getDetallesCompra() {
        return this.detallesCompra;
    }

    public void setDetallesCompra(List<DetalleCompraModel> detallesCompra) {
        this.detallesCompra = detallesCompra;
    }

    public List<DetallePromocionModel> getDetallesPromocion() {
        return this.detallesPromocion;
    }

    public void setDetallesPromocion(List<DetallePromocionModel> detallesPromocion) {
        this.detallesPromocion = detallesPromocion;
    }
}
