package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;

public class FacturaBuilder implements Builder<Factura> {
    private String valorFactura;
    private String empresaServicio;
    private String fechaFactura;
    private String periodicidad;
    private String numeroIntento;
    private String fechaInicioFin;
    private String frecuenciaPago;
    private String referencia;
    private Producto producto = new Producto();
    private String convenio;
    private String descripcionFactura;
    private String duracionProgramacion;
    private String mesProgramacion;

    public FacturaBuilder() {
        this.valorFactura = "";
        this.empresaServicio = "";
        this.fechaFactura = "";
        this.periodicidad = "";
        this.numeroIntento = "";
        this.fechaInicioFin = "";
        this.convenio = "";
        this.referencia = "";
        this.frecuenciaPago = "";
        this.referencia = "";
        this.descripcionFactura="";
        this.duracionProgramacion="";
        this.mesProgramacion="";
    }

    public static FacturaBuilder factura() {
        return new FacturaBuilder();
    }

    public FacturaBuilder conValor(List<Map<String, String>> datos) {
        this.valorFactura = datos.get(0).get("valorFactura");
        return this;
    }

  /*  public FacturaBuilder conValor(String factura) {
        this.valorFactura = factura;
        return this;
    }

    public FacturaBuilder conFecha(String factura) {
        this.valorFactura = factura;
        return this;
    }
    public FacturaBuilder conValor(String factura) {
        this.valorFactura = factura;
        return this;
    }*/

    public FacturaBuilder conEmpresaServicio(List<Map<String, String>> datos) {
        this.empresaServicio = datos.get(0).get("empresaServicio");
        return this;
    }

    public FacturaBuilder conFechaFactura(List<Map<String, String>> datos) {
        this.fechaFactura = datos.get(0).get("fechaFactura");
        return this;
    }

    public FacturaBuilder conPeriodicidad(List<Map<String, String>> datos) {
        this.periodicidad = datos.get(0).get("periodicidad");
        return this;
    }

    public FacturaBuilder conNumeroIntento(List<Map<String, String>> datos) {
        this.numeroIntento = datos.get(0).get("numeroIntento");
        return this;
    }

    public FacturaBuilder conFechaInicioFin(List<Map<String, String>> datos) {
        this.fechaInicioFin = datos.get(0).get("fechaInicioFin");
        return this;
    }

    public FacturaBuilder conProducto(List<Map<String, String>> datos) {
        this.producto = elProducto().conNumero(datos.get(0).get("numeroCuenta"))
                .conTipoCuenta(datos.get(0).get("tipoCuenta"))
                .build();
        return this;
    }

    public FacturaBuilder conFrecuenciaPago(List<Map<String, String>> datos) {
        this.frecuenciaPago = datos.get(0).get("frecuenciaPago");
        return this;
    }

    public FacturaBuilder conReferencia(List<Map<String, String>> datos) {
        this.referencia = datos.get(0).get("referencia");
        return this;
    }

    public FacturaBuilder conConvenio(List<Map<String, String>> datos) {
        this.convenio = datos.get(0).get("convenio");
        return this;
    }

    public FacturaBuilder conDescripcionFactura(List<Map<String, String>> datos) {
        this.descripcionFactura = datos.get(0).get("descripcionFactura");
        return this;
    }

    public FacturaBuilder conDuracionProgramacion(List<Map<String, String>> datos) {
        this.duracionProgramacion = datos.get(0).get("duracionProgramacion");
        return this;
    }
    public FacturaBuilder conMesProgramacion(List<Map<String, String>> datos) {
        this.mesProgramacion = datos.get(0).get("mesProgramacion");
        return this;
    }

    public String getDuracionProgramacion() {
        return duracionProgramacion;
    }

    public String getMesProgramacion() {
        return mesProgramacion;
    }

    public String getDescripcionFactura() {
        return descripcionFactura;
    }

    public String getValorFactura() {
        return valorFactura;
    }

    public String getEmpresaServicio() {
        return empresaServicio;
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

    public String getConvenio() {
        return convenio;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getFrecuenciaPago() {
        return frecuenciaPago;
    }

    @Override
    public Factura build() {
        return new Factura(this);
    }
}