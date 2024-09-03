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

@Table(name = "Categoria_Proveedor")
@Entity
public class CategoriaProveedorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Categoria_Proveedor")
    private long idCategoriaProveedor;

    @Column(name = "No_Categoria_Proveedor", nullable = false, length = 300)
    private String noCategoriaProveedor;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Estado")
    private boolean estado = true;

    @OneToMany(mappedBy = "categoriaProveedor")
    private List<ProveedorModel> proveedores;

    public CategoriaProveedorModel() {

    }

    public long getIdCategoriaProveedor() {
        return this.idCategoriaProveedor;
    }

    public void setIdCategoriaProveedor(long idCategoriaProveedor) {
        this.idCategoriaProveedor = idCategoriaProveedor;
    }

    public String getNoCategoriaProveedor() {
        return this.noCategoriaProveedor;
    }

    public void setNoCategoriaProveedor(String noCategoriaProveedor) {
        this.noCategoriaProveedor = noCategoriaProveedor;
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
