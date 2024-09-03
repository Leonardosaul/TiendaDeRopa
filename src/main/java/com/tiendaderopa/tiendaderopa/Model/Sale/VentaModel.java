package com.tiendaderopa.tiendaderopa.Model.Sale;

import java.util.Date;
import java.util.List;

import com.tiendaderopa.tiendaderopa.Model.IgvModel;
import com.tiendaderopa.tiendaderopa.Model.KardexModel;
import com.tiendaderopa.tiendaderopa.Model.MedioPagoModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.Settings.EstadoVentaModel;
import com.tiendaderopa.tiendaderopa.Model.Sale.Settings.MedioEntregaModel;
import com.tiendaderopa.tiendaderopa.Model.User.Customer.ClienteModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "Venta")
@Entity
public class VentaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Venta")
    private long idVenta;

    @ManyToOne
    @JoinColumn(name = "ID_Cliente", nullable = false)
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "ID_Medio_Pago", nullable = false)
    private MedioPagoModel medioPago;

    @ManyToOne
    @JoinColumn(name = "ID_Medio_Entrega", nullable = false)
    private MedioEntregaModel medioEntrega;

    @ManyToOne
    @JoinColumn(name = "ID_Estado_Venta", nullable = false)
    private EstadoVentaModel estadoVenta;

    @ManyToOne
    @JoinColumn(name = "ID_Igv", nullable = false)
    private IgvModel igv;

    @Column(name = "Direccion_Envio", nullable = false, length = 300)
    private String direccionEnvio;

    @Column(name = "Precio_Total", nullable = false)
    private double precioTotal;

    @Column(name = "Precio_Igv", nullable = false)
    private double precioIgv;

    @Column(name = "Fecha_Venta", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaVenta = new Date();

    @OneToMany(mappedBy = "venta")
    private List<DetalleVentaModel> detalleVenta;

    @OneToMany(mappedBy = "venta")
    private List<KardexModel> kardexs;

    public VentaModel() {

    }

    public long getIdVenta() {
        return this.idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public ClienteModel getCliente() {
        return this.cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public MedioPagoModel getMedioPago() {
        return this.medioPago;
    }

    public void setMedioPago(MedioPagoModel medioPago) {
        this.medioPago = medioPago;
    }

    public MedioEntregaModel getMedioEntrega() {
        return this.medioEntrega;
    }

    public void setMedioEntrega(MedioEntregaModel medioEntrega) {
        this.medioEntrega = medioEntrega;
    }

    public EstadoVentaModel getEstadoVenta() {
        return this.estadoVenta;
    }

    public void setEstadoVenta(EstadoVentaModel estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public IgvModel getIgv() {
        return this.igv;
    }

    public void setIgv(IgvModel igv) {
        this.igv = igv;
    }

    public String getDireccionEnvio() {
        return this.direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioIgv() {
        return this.precioIgv;
    }

    public void setPrecioIgv(double precioIgv) {
        this.precioIgv = precioIgv;
    }

    public Date getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public List<DetalleVentaModel> getDetalleVenta() {
        return this.detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVentaModel> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
}
