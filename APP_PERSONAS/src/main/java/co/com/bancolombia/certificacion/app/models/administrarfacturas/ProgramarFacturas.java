package co.com.bancolombia.certificacion.app.models.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;

public class ProgramarFacturas {
    private String valorFactura;
    private String empresaServicio;
    private String fechaFactura;
    private String periodicidad;
    private String numeroIntento;
    private String fechaInicioFin;
    private String frecuenciaPago;
    private String referencia;
    private Producto producto;

    public ProgramarFacturas(ProgramarFacturasBuilder programarFacturasBuilder) {
        this.valorFactura = programarFacturasBuilder.getValorFactura();
        this.empresaServicio = programarFacturasBuilder.getEmpresaServicio();
        this.fechaFactura = programarFacturasBuilder.getFechaFactura();
        this.periodicidad = programarFacturasBuilder.getPeriodicidad();
        this.numeroIntento = programarFacturasBuilder.getNumeroIntento();
        this.fechaInicioFin = programarFacturasBuilder.getFechaInicioFin();
        this.frecuenciaPago=programarFacturasBuilder.getFrecuenciaPago();
        this.referencia=programarFacturasBuilder.getReferencia();
        this.producto = programarFacturasBuilder.getProducto();
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public void setFrecuenciaPago(String frecuenciaPago) {
        this.frecuenciaPago = frecuenciaPago;
    }

    public String getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(String valorFactura) {
        this.valorFactura = valorFactura;
    }

    public String getEmpresaServicio() {
        return empresaServicio;
    }

    public void setEmpresaServicio(String empresaServicio) {
        this.empresaServicio = empresaServicio;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getNumeroIntento() {
        return numeroIntento;
    }

    public void setNumeroIntento(String numeroIntento) {
        this.numeroIntento = numeroIntento;
    }

    public String getFechaInicioFin() {
        return fechaInicioFin;
    }

    public void setFechaInicioFin(String fechaInicioFin) {
        this.fechaInicioFin = fechaInicioFin;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}