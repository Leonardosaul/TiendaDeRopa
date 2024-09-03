package com.tiendaderopa.tiendaderopa.Model.Product.Settings.Material;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "Material")
@Entity
public class MaterialModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Material")
    private long idMaterial;

    @Column(name = "No_Material", nullable = false, length = 200)
    private String noMaterial;

    @Lob
    @Column(name = "Descripcion", nullable = true)
    private String descripcion = null;

    @Column(name = "Acronimo", nullable = true, length = 20)
    private String acronimo = null;

    @OneToMany(mappedBy = "material")
    private List<ProductoMaterialModel> productosMaterial;

    public MaterialModel() {

    }

    public long getIdMaterial() {
        return this.idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNoMaterial() {
        return this.noMaterial;
    }

    public void setNoMaterial(String noMaterial) {
        this.noMaterial = noMaterial;
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

    public List<ProductoMaterialModel> getProductosMaterial() {
        return this.productosMaterial;
    }

    public void setProductosMaterial(List<ProductoMaterialModel> productosMaterial) {
        this.productosMaterial = productosMaterial;
    }
}
