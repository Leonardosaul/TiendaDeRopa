package com.tiendaderopa.tiendaderopa.Model.Provider.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.PaisModel;
import com.tiendaderopa.tiendaderopa.Model.Provider.ProveedorModel;

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

@Table(name = "Tipo_Ruc")
@Entity
public class TipoRucModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Tipo_Ruc")
    private long idTipoRuc;

    @ManyToOne
    @JoinColumn(name = "ID_Pais", nullable = false)
    private PaisModel pais;

    @Column(name = "No_Tipo_Ruc", nullable = false, length = 300)
    private String noTipoRuc;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Acronimo", nullable = false, length = 50)
    private String acronimo;

    @Column(name = "Cantidad_Digitos")
    private int cantidadDigitos;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "tipoRuc")
    private List<ProveedorModel> proveedores;

    public TipoRucModel() {

    }

    public long getIdTipoRuc() {
        return this.idTipoRuc;
    }

    public void setIdTipoRuc(long idTipoRuc) {
        this.idTipoRuc = idTipoRuc;
    }

    public PaisModel getPais() {
        return this.pais;
    }

    public void setPais(PaisModel pais) {
        this.pais = pais;
    }

    public String getNoTipoRuc() {
        return this.noTipoRuc;
    }

    public void setNoTipoRuc(String noTipoRuc) {
        this.noTipoRuc = noTipoRuc;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAcronimo() {
        return this.acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public int getCantidadDigitos() {
        return this.cantidadDigitos;
    }

    public void setCantidadDigitos(int cantidadDigitos) {
        this.cantidadDigitos = cantidadDigitos;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<ProveedorModel> getProveedores() {
        return this.proveedores;
    }

    public void setProveedores(List<ProveedorModel> proveedores) {
        this.proveedores = proveedores;
    }
}
