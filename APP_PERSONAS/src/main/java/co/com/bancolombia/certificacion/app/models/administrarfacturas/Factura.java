package co.com.bancolombia.certificacion.app.models.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;

public class Factura {
    private String valorFactura;
    private String empresaServicio;
    private String fechaFactura;
    private String periodicidad;
    private String numeroIntento;
    private String fechaInicioFin;
    private Producto producto;
    private String convenio;
    private String referencia;
    private String frecuenciaPago;
    private String descripcionFactura;
    private String duracionProgramacion;
    private String mesProgramacion;
    private String estadoFactura;

    public Factura(FacturaBuilder programarFacturaBuilder) {
        this.valorFactura = programarFacturaBuilder.getValorFactura();
        this.empresaServicio = programarFacturaBuilder.getEmpresaServicio();
        this.fechaFactura = programarFacturaBuilder.getFechaFactura();
        this.periodicidad = programarFacturaBuilder.getPeriodicidad();
        this.numeroIntento = programarFacturaBuilder.getNumeroIntento();
        this.fechaInicioFin = programarFacturaBuilder.getFechaInicioFin();
        this.producto = programarFacturaBuilder.getProducto();
        this.convenio = programarFacturaBuilder.getConvenio();
        this.referencia = programarFacturaBuilder.getReferencia();
        this.frecuenciaPago=programarFacturaBuilder.getFrecuenciaPago();
        this.descripcionFactura=programarFacturaBuilder.getDescripcionFactura();
        this.duracionProgramacion=programarFacturaBuilder.getDuracionProgramacion();
        this.mesProgramacion=programarFacturaBuilder.getMesProgramacion();
        this.estadoFactura=programarFacturaBuilder.getEstadoFactura();
    }

    public void setValorFactura(String valorFactura) {
        this.valorFactura = valorFactura;
    }

    public void setEmpresaServicio(String empresaServicio) {
        this.empresaServicio = empresaServicio;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public void setNumeroIntento(String numeroIntento) {
        this.numeroIntento = numeroIntento;
    }

    public void setFechaInicioFin(String fechaInicioFin) {
        this.fechaInicioFin = fechaInicioFin;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public String getMesProgramacion() {
        return mesProgramacion;
    }

    public void setMesProgramacion(String mesProgramacion) {
        this.mesProgramacion = mesProgramacion;
    }

    public String getDuracionProgramacion() {
        return duracionProgramacion;
    }

    public void setDuracionProgramacion(String duracionProgramacion) {
        this.duracionProgramacion = duracionProgramacion;
    }

    public String getDescripcionFactura() {
        return descripcionFactura;
    }

    public void setDescripcionFactura(String descripcionFactura) {
        this.descripcionFactura = descripcionFactura;
    }

    public String getValorFactura() {
        return valorFactura;
    }

    public String getEmpresaServicio() {
        return empresaServicio;
    }

    public String getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public void setFrecuenciaPago(String frecuenciaPago) {
        this.frecuenciaPago = frecuenciaPago;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public String getNumeroIntento() {
        return numeroIntento;
    }

    public String getFechaInicioFin() {
        return fechaInicioFin;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getConvenio() {
        return convenio;
    }

    public String getReferencia() {
        return referencia;
    }
}