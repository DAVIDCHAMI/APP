package co.com.bancolombia.certificacion.app.models.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;

public class Factura {
    private String valorFactura;
    private String descripcionFactura;
    private String fechaFactura;
    private String periodicidad;
    private String numeroIntento;
    private String fechaInicioFin;
    private Producto producto;
    private String convenio;
    private String referencia;

    public Factura(FacturaBuilder programarFacturaBuilder) {
        this.valorFactura = programarFacturaBuilder.getValorFactura();
        this.descripcionFactura = programarFacturaBuilder.getDescripcionFactura();
        this.fechaFactura = programarFacturaBuilder.getFechaFactura();
        this.periodicidad = programarFacturaBuilder.getPeriodicidad();
        this.numeroIntento = programarFacturaBuilder.getNumeroIntento();
        this.fechaInicioFin = programarFacturaBuilder.getFechaInicioFin();
        this.producto = programarFacturaBuilder.getProducto();
        this.convenio = programarFacturaBuilder.getConvenio();
        this.referencia = programarFacturaBuilder.getReferencia();
    }

    public String getValorFactura() {
        return valorFactura;
    }

    public String getDescripcionFactura() {
        return descripcionFactura;
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