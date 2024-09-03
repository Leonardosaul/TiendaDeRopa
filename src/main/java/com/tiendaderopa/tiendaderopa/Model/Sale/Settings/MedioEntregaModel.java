package com.tiendaderopa.tiendaderopa.Model.Sale.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Sale.VentaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Medio_Entrega")
@Entity
public class MedioEntregaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Medio_Entrega")
    private long idMedioEntrega;

    @Column(name = "No_Medio_Entrega", nullable = false, length = 300)
    private String noMedioEntrega;

    @Column(name = "Acronimo", nullable = false, length = 50)
    private String acronimo;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "medioEntrega")
    private List<VentaModel> ventas;

    public MedioEntregaModel() {

    }

    public long getIdMedioEntrega() {
        return this.idMedioEntrega;
    }

    public void setIdMedioEntrega(long idMedioEntrega) {
        this.idMedioEntrega = idMedioEntrega;
    }

    public String getNoMedioEntrega() {
        return this.noMedioEntrega;
    }

    public void setNoMedioEntrega(String noMedioEntrega) {
        this.noMedioEntrega = noMedioEntrega;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
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

    public List<VentaModel> getVentas() {
        return this.ventas;
    }

    public void setVentas(List<VentaModel> ventas) {
        this.ventas = ventas;
    }
}
