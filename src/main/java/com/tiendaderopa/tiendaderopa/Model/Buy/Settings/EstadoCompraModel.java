package com.tiendaderopa.tiendaderopa.Model.Buy.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Buy.CompraModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Estado_Compra")
@Entity
public class EstadoCompraModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Estado_Compra")
    private long idEstadoCompra;

    @Column(name = "No_Estado_Compra", nullable = false, length = 300)
    private String noEstadoCompra;
    
    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado;

    @OneToMany(mappedBy = "estadoCompra")
    private List<CompraModel> compras;

    public EstadoCompraModel() {

    }

    public long getIdEstadoCompra() {
        return this.idEstadoCompra;
    }

    public void setIdEstadoCompra(long idEstadoCompra) {
        this.idEstadoCompra = idEstadoCompra;
    }

    public String getNoEstadoCompra() {
        return this.noEstadoCompra;
    }

    public void setNoEstadoCompra(String noEstadoCompra) {
        this.noEstadoCompra = noEstadoCompra;
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

    public List<CompraModel> getCompras() {
        return this.compras;
    }

    public void setCompras(List<CompraModel> compras) {
        this.compras = compras;
    }
}
