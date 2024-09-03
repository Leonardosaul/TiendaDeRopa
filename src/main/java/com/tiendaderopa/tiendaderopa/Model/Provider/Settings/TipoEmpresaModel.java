package com.tiendaderopa.tiendaderopa.Model.Provider.Settings;

import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.Provider.ProveedorModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Tipo_Empresa")
@Entity
public class TipoEmpresaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Tipo_Empresa")
    private long idTipoEmpresa;

    @Column(name = "No_Tipo_Empresa", nullable = false, length = 300)
    private String noTipoEmpresa;

    @Column(name = "Acronimo", nullable = false, length = 50)
    private String acronimo;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "tipoEmpresa")
    private List<ProveedorModel> proveedores;

    public TipoEmpresaModel() {

    }

    public long getIdTipoEmpresa() {
        return this.idTipoEmpresa;
    }

    public void setIdTipoEmpresa(long idTipoEmpresa) {
        this.idTipoEmpresa = idTipoEmpresa;
    }

    public String getNoTipoEmpresa() {
        return this.noTipoEmpresa;
    }

    public void setNoTipoEmpresa(String noTipoEmpresa) {
        this.noTipoEmpresa = noTipoEmpresa;
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

    public List<ProveedorModel> getProveedores() {
        return this.proveedores;
    }

    public void setProveedores(List<ProveedorModel> proveedores) {
        this.proveedores = proveedores;
    }
}
