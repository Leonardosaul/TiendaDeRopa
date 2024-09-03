package com.tiendaderopa.tiendaderopa.Model.Buy;

import java.util.Date;
import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.IgvModel;
import com.tiendaderopa.tiendaderopa.Model.KardexModel;
import com.tiendaderopa.tiendaderopa.Model.MedioPagoModel;
import com.tiendaderopa.tiendaderopa.Model.Buy.Settings.EstadoCompraModel;

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

@Table(name = "Compra")
@Entity
public class CompraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Compra")
    private long idCompra;
    
    @ManyToOne
    @JoinColumn(name = "ID_Estado_Compra", nullable = false)
    private EstadoCompraModel estadoCompra;

    @ManyToOne
    @JoinColumn(name = "ID_Igv", nullable = false)
    private IgvModel igv;

    @ManyToOne
    @JoinColumn(name = "ID_Medio_Pago", nullable = false)
    private MedioPagoModel medioPago;

    @Column(name = "Precio_Igv")
    private double precioIgv;

    @Column(name = "Precio_Total")
    private double precioTotal;

    @Column(name = "Fecha_Compra", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCompra = new Date();

    @Lob
    @Column(name = "Comentarios", nullable = true)
    private String comentarios = null;

    @OneToMany(mappedBy = "compra")
    private List<DetalleCompraModel> detallesCompra;

    @OneToMany(mappedBy = "compra")
    private List<KardexModel> kardexs;

    public CompraModel() {

    }

    public long getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(long idCompra) {
        this.idCompra = idCompra;
    }

    public EstadoCompraModel getEstadoCompra() {
        return this.estadoCompra;
    }

    public void setEstadoCompra(EstadoCompraModel estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

    public IgvModel getIgv() {
        return this.igv;
    }

    public void setIgv(IgvModel igv) {
        this.igv = igv;
    }

    public MedioPagoModel getMedioPago() {
        return this.medioPago;
    }

    public void setMedioPago(MedioPagoModel medioPago) {
        this.medioPago = medioPago;
    }

    public double getPrecioIgv() {
        return this.precioIgv;
    }

    public void setPrecioIgv(double precioIgv) {
        this.precioIgv = precioIgv;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Date getFechaCompra() {
        return this.fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public List<DetalleCompraModel> getDetallesCompra() {
        return this.detallesCompra;
    }

    public void setDetallesCompra(List<DetalleCompraModel> detallesCompra) {
        this.detallesCompra = detallesCompra;
    }
}
