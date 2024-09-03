package com.tiendaderopa.tiendaderopa.Model;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Buy.CompraModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.VentaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Igv")
@Entity
public class IgvModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Igv")
    private long idIgv;

    @OneToOne
    @JoinColumn(name = "ID_Pais", nullable = false)
    private PaisModel pais;

    @Column(name = "Tasa", nullable = false)
    private double tasa;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "igv")
    private List<VentaModel> ventas;

    @OneToMany(mappedBy = "igv")
    private List<CompraModel> compras;

    public IgvModel() {

    }

    public long getIdIgv() {
        return this.idIgv;
    }

    public void setIdIgv(long idIgv) {
        this.idIgv = idIgv;
    }

    public PaisModel getPais() {
        return this.pais;
    }

    public void setPais(PaisModel pais) {
        this.pais = pais;
    }

    public double getTasa() {
        return this.tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<VentaModel> getVentas() {
        return this.ventas;
    }

    public void setVentas(List<VentaModel> ventas) {
        this.ventas = ventas;
    }

    public List<CompraModel> getCompras() {
        return this.compras;
    }

    public void setCompras(List<CompraModel> compras) {
        this.compras = compras;
    }
}
