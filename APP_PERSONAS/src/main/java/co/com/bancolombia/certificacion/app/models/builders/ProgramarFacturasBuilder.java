package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.ProgramarFacturas;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;

public class ProgramarFacturasBuilder implements Builder<ProgramarFacturas> {
    private String valorFactura;
    private String descripcionFactura;
    private String fechaFactura;
    private String periodicidad;
    private String numeroIntento;
    private String fechaInicioFin;
    private Producto producto = new Producto();

    public ProgramarFacturasBuilder() {
        this.valorFactura = "";
        this.descripcionFactura = "";
        this.fechaFactura = "";
        this.periodicidad = "";
        this.numeroIntento = "";
        this.fechaInicioFin = "";
    }

    public static ProgramarFacturasBuilder programarFactura() {
        return new ProgramarFacturasBuilder();
    }

    public ProgramarFacturasBuilder conValor(List<Map<String, String>> datos) {
        this.valorFactura = datos.get(0).get("valorFactura");
        return this;
    }

    public ProgramarFacturasBuilder conDescripcionFactura(List<Map<String, String>> datos) {
        this.descripcionFactura = datos.get(0).get("descripcionFactura");
        return this;
    }

    public ProgramarFacturasBuilder conFechaFactura(List<Map<String, String>> datos) {
        this.fechaFactura = datos.get(0).get("fechaFactura");
        return this;
    }

    public ProgramarFacturasBuilder conPeriodicidad(List<Map<String, String>> datos) {
        this.periodicidad = datos.get(0).get("periodicidad");
        return this;
    }

    public ProgramarFacturasBuilder conNumeroIntento(List<Map<String, String>> datos) {
        this.numeroIntento = datos.get(0).get("numeroIntento");
        return this;
    }

    public ProgramarFacturasBuilder conFechaInicioFin(List<Map<String, String>> datos) {
        this.fechaInicioFin = datos.get(0).get("fechaInicioFin");
        return this;
    }

    public ProgramarFacturasBuilder conProducto(List<Map<String, String>> datos) {
        this.producto = elProducto().conNumero(datos.get(0).get("numeroCuenta"))
                .conTipoCuenta(datos.get(0).get("tipoCuenta"))
                .build();
        return this;
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

    @Override
    public ProgramarFacturas build() {
        return new ProgramarFacturas(this);
    }
}