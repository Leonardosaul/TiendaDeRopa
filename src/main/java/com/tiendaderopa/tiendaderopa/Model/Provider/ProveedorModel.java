package com.tiendaderopa.tiendaderopa.Model.Provider;

import java.util.Date;
import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.PaisModel;
import com.tiendaderopa.tiendaderopa.Model.Buy.DetalleCompraModel;
import com.tiendaderopa.tiendaderopa.Model.Provider.Settings.CategoriaProveedorModel;
import com.tiendaderopa.tiendaderopa.Model.Provider.Settings.TipoEmpresaModel;
import com.tiendaderopa.tiendaderopa.Model.Provider.Settings.TipoRucModel;

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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Proveedor")
@Entity
public class ProveedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Proveedor")
    private long idProveedor;

    @ManyToOne
    @JoinColumn(name = "ID_Pais", nullable = false)
    private PaisModel pais;

    @ManyToOne
    @JoinColumn(name = "ID_Tipo_Empresa", nullable = false)
    private TipoEmpresaModel tipoEmpresa;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria_Proveedor", nullable = false)
    private CategoriaProveedorModel categoriaProveedor;

    @ManyToOne
    @JoinColumn(name = "ID_Tipo_Ruc", nullable = false)
    private TipoRucModel tipoRuc;

    @Column(name = "Ruc", nullable = false, length = 50)
    private String ruc;

    @Column(name = "No_Proveedor", nullable = false, length = 300)
    private String noProveedor;

    @Column(name = "Telefono", nullable = true, length = 30)
    private String telefono = null;

    @Column(name = "Correo_Electronico", nullable = true, length = 200)
    private String correoElectronico = null;

    @Column(name = "Fecha_Inicio_Actividad", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicioActividad = new Date();

    @Column(name = "Representante_Ventas", nullable = false, length = 300)
    private String representanteVentas;

    @Lob
    @Column(name = "Notas", nullable = true)
    private String notas = null;

    @OneToMany(mappedBy = "proveedor")
    private List<DetalleCompraModel> detallesCompra;

    public ProveedorModel() {

    }

    public long getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public PaisModel getPais() {
        return this.pais;
    }

    public void setPais(PaisModel pais) {
        this.pais = pais;
    }

    public TipoEmpresaModel getTipoEmpresa() {
        return this.tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresaModel tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public CategoriaProveedorModel getCategoriaProveedor() {
        return this.categoriaProveedor;
    }

    public void setCategoriaProveedor(CategoriaProveedorModel categoriaProveedor) {
        this.categoriaProveedor = categoriaProveedor;
    }

    public TipoRucModel getTipoRuc() {
        return this.tipoRuc;
    }

    public void setTipoRuc(TipoRucModel tipoRuc) {
        this.tipoRuc = tipoRuc;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNoProveedor() {
        return this.noProveedor;
    }

    public void setNoProveedor(String noProveedor) {
        this.noProveedor = noProveedor;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaInicioActividad() {
        return this.fechaInicioActividad;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public String getRepresentanteVentas() {
        return this.representanteVentas;
    }

    public void setRepresentanteVentas(String representanteVentas) {
        this.representanteVentas = representanteVentas;
    }

    public String getNotas() {
        return this.notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public List<DetalleCompraModel> getDetallesCompra() {
        return this.detallesCompra;
    }

    public void setDetallesCompra(List<DetalleCompraModel> detallesCompra) {
        this.detallesCompra = detallesCompra;
    }
}
