package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Estilo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Estilo")
@Entity
public class EstiloModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Estilo")
    private long idEstilo;

    @Column(name = "No_Estilo", nullable = false, length = 200)
    private String noEstilo;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "estilo")
    private List<ProductoEstiloModel> productosEstilo;

    public EstiloModel() {

    }

    public long getIdEstilo() {
        return this.idEstilo;
    }

    public void setIdEstilo(long idEstilo) {
        this.idEstilo = idEstilo;
    }

    public String getNoEstilo() {
        return this.noEstilo;
    }

    public void setNoEstilo(String noEstilo) {
        this.noEstilo = noEstilo;
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

    public List<ProductoEstiloModel> getProductosEstilo() {
        return this.productosEstilo;
    }

    public void setProductosEstilo(List<ProductoEstiloModel> productosEstilo) {
        this.productosEstilo = productosEstilo;
    }
}
