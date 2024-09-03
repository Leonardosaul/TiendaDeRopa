package com.tiendaderopa.tiendaderopa.Model.Promotion;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Promocion")
@Entity
public class PromocionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Promocion")
    private long idPromocion;

    @Column(name = "No_Promocion", nullable = false, length = 300)
    private String noPromocion;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Fecha_Inicio", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio = null;

    @Column(name = "Fecha_Fin", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaFin = null;

    @Column(name = "Valor_Descuento")
    private double valorDescuento;

    @Column(name = "Estado")
    private boolean estado = true;

    @Column(name = "Fecha_Creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion = new Date();

    @Column(name = "Url_Banner", nullable = true, length = 100)
    private String urlBanner = null;

    @OneToMany(mappedBy = "promocion")
    private List<DetallePromocionModel> detallesPromocion;

    public PromocionModel() {

    }

    public long getIdPromocion() {
        return this.idPromocion;
    }

    public void setIdPromocion(long idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getNoPromocion() {
        return this.noPromocion;
    }

    public void setNoPromocion(String noPromocion) {
        this.noPromocion = noPromocion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValorDescuento() {
        return this.valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUrlBanner() {
        return this.urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }

    public List<DetallePromocionModel> getDetallesPromocion() {
        return this.detallesPromocion;
    }

    public void setDetallesPromocion(List<DetallePromocionModel> detallesPromocion) {
        this.detallesPromocion = detallesPromocion;
    }
}
