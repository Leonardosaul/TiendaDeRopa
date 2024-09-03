package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Temporada;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Temporada")
@Entity
public class TemporadaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Temporada")
    private long idTemporada;

    @Column(name = "No_Temporada", nullable = false, length = 200)
    private String noTemporada;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Mes_Inicio", nullable = true, length = 100)
    private String mesInicio = null;

    @Column(name = "Mes_Final", nullable = true, length = 100)
    private String mesFinal = null;

    @OneToMany(mappedBy = "temporada")
    private List<ProductoTemporadaModel> productosTemporada;

    public TemporadaModel() {

    }

    public long getIdTemporada() {
        return this.idTemporada;
    }

    public void setIdTemporada(long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public String getNoTemporada() {
        return this.noTemporada;
    }

    public void setNoTemporada(String noTemporada) {
        this.noTemporada = noTemporada;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMesInicio() {
        return this.mesInicio;
    }

    public void setMesInicio(String mesInicio) {
        this.mesInicio = mesInicio;
    }

    public String getMesFinal() {
        return this.mesFinal;
    }

    public void setMesFinal(String mesFinal) {
        this.mesFinal = mesFinal;
    }

    public List<ProductoTemporadaModel> getProductosTemporada() {
        return this.productosTemporada;
    }

    public void setProductosTemporada(List<ProductoTemporadaModel> productosTemporada) {
        this.productosTemporada = productosTemporada;
    }
}
