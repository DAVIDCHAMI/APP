package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Builder;

import java.util.List;
import java.util.Map;

public class TarjetaCreditoBuilder implements Builder<TarjetaCredito> {
    private String tipoCuenta;
    private String numeroCuenta;
    private String formatoTarjetaCredito;
    private String tipoTarjetaCreditoEnNumero;
    private String trm;
    private String fechaLimitePago;
    private String fechaProximoPago;
    private String fechaVencimiento;
    private String pagoMinimoEnPesos;
    private String pagoTotalEnPesos;
    private String deudaALaFechaEnPesos;
    private String avancesDisponiblesEnPesos;
    private String totalDisponibleEnPesos;
    private String pagoMinimoEnDolares;
    private String totalPagoEnDolares;
    private String deudaTotalEnDolares;
    private String tipoPago;
    private String valorPago;
    private String moneda;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private String codigoSeguridad;
    private String montoAvance;
    private String numeroTarjetaDestino;
    private String mensajeConfirmacion;
    private String mensajeAvanceNoExitoso;

    private TarjetaCreditoBuilder() {
        this.tipoCuenta = "";
        this.numeroCuenta = "";
        this.formatoTarjetaCredito = "";
        this.tipoTarjetaCreditoEnNumero = "";
        this.trm = "";
        this.fechaLimitePago = "";
        this.fechaProximoPago = "";
        this.fechaVencimiento = "";
        this.pagoMinimoEnPesos = "";
        this.pagoTotalEnPesos = "";
        this.deudaALaFechaEnPesos = "";
        this.avancesDisponiblesEnPesos = "";
        this.totalDisponibleEnPesos = "";
        this.pagoMinimoEnDolares = "";
        this.totalPagoEnDolares = "";
        this.deudaTotalEnDolares = "";
        this.tipoPago = "";
        this.valorPago = "";
        this.moneda = "";
        this.numeroTarjeta = "";
        this.tipoTarjeta = "";
        this.codigoSeguridad = "";
        this.montoAvance = "";
        this.numeroTarjetaDestino = "";
        this.mensajeConfirmacion = "";
        this.mensajeAvanceNoExitoso = "";
    }

    public static TarjetaCreditoBuilder tarjetaCredito() {
        return new TarjetaCreditoBuilder();
    }

    public TarjetaCreditoBuilder conMensajeConfirmacion(List<Map<String, String>> datos) {
        this.mensajeConfirmacion = datos.get(0).get("mensajeConfirmacion");
        return this;
    }

    public TarjetaCreditoBuilder conMensajeDeRechazo(List<Map<String, String>> datos) {
        this.mensajeAvanceNoExitoso = datos.get(0).get("mensajeAvanceNoExitoso");
        return this;
    }

    public TarjetaCreditoBuilder conDatosDeTarjeta(List<Map<String, String>> datos) {
        this.numeroTarjeta = datos.get(0).get("numeroTarjeta");
        this.codigoSeguridad = datos.get(0).get("codigoSeguridad");
        this.montoAvance = datos.get(0).get("montoAvance");
        this.numeroTarjetaDestino = datos.get(0).get("numeroTarjetaDestino");
        return this;
    }

    public TarjetaCreditoBuilder conTipoPago(List<Map<String, String>> datos) {
        this.tipoPago = datos.get(0).get("tipoPago");
        return this;
    }

    public TarjetaCreditoBuilder conValor(List<Map<String, String>> datos) {
        this.valorPago = datos.get(0).get("valorPago");
        return this;
    }

    public TarjetaCreditoBuilder conTarjeta(List<Map<String, String>> datos) {
        this.tipoCuenta = datos.get(0).get("tipoTarjeta");
        this.numeroCuenta = datos.get(0).get("numeroTarjeta");
        return this;
    }

    public TarjetaCreditoBuilder conTarjeta(String tipoTarjeta, String numeroTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        return this;
    }

    public TarjetaCreditoBuilder conMoneda(List<Map<String, String>> datos) {
        this.moneda = datos.get(0).get("moneda");
        return this;
    }

    public TarjetaCreditoBuilder conDeudaFechaPesos(String datos) {
        this.deudaALaFechaEnPesos = datos;
        return this;
    }

    public TarjetaCreditoBuilder conDeudaFechaDolares(String datos) {
        this.deudaTotalEnDolares = datos;
        return this;
    }

    public TarjetaCreditoBuilder conTrm(String datos) {
        this.trm = datos;
        return this;
    }

    public TarjetaCreditoBuilder conAvanceDisponiblePeso(String datos) {
        this.avancesDisponiblesEnPesos = datos;
        return this;
    }

    public TarjetaCreditoBuilder conNumeroTarjeta(String datos) {
        this.numeroTarjeta = datos;
        return this;
    }

    public TarjetaCreditoBuilder conFechaVencimiento(String datos) {
        this.fechaVencimiento = datos;
        return this;
    }

    public TarjetaCreditoBuilder conTipoTarjeta(String datos) {
        this.tipoTarjeta = datos;
        return this;
    }

    public TarjetaCreditoBuilder conFechaProximoPago(String datos) {
        this.fechaProximoPago = datos;
        return this;
    }

    public TarjetaCreditoBuilder conCodigoDeSeguridad(String datos) {
        this.codigoSeguridad = datos;
        return this;
    }

    public TarjetaCreditoBuilder conPagoMinimoEnPesos(String datos) {
        this.pagoMinimoEnPesos = datos;
        return this;
    }

    public TarjetaCreditoBuilder conPagoMinimoEnDolares(String datos) {
        this.pagoMinimoEnDolares = datos;
        return this;
    }

    public TarjetaCreditoBuilder conPagoTotalEnPesos(String datos) {
        this.pagoTotalEnPesos = datos;
        return this;
    }

    public TarjetaCreditoBuilder conPagoTotalEnDolares(String datos) {
        this.totalPagoEnDolares = datos;
        return this;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getFormatoTarjetaCredito() {
        return formatoTarjetaCredito;
    }

    public String getTipoTarjetaCreditoEnNumero() {
        return tipoTarjetaCreditoEnNumero;
    }

    public String getFechaLimitePago() {
        return fechaLimitePago;
    }

    public String getFechaProximoPago() {
        return fechaProximoPago;
    }

    public String getTrm() {
        return trm;
    }

    public String getPagoMinimoEnPesos() {
        return pagoMinimoEnPesos;
    }

    public String getPagoTotalEnPesos() {
        return pagoTotalEnPesos;
    }

    public String getDeudaALaFechaEnPesos() {
        return deudaALaFechaEnPesos;
    }

    public String getAvancesDisponiblesEnPesos() {
        return avancesDisponiblesEnPesos;
    }

    public String getTotalDisponibleEnPesos() {
        return totalDisponibleEnPesos;
    }

    public String getPagoMinimoEnDolares() {
        return pagoMinimoEnDolares;
    }

    public String getTotalPagoEnDolares() {
        return totalPagoEnDolares;
    }

    public String getDeudaTotalEnDolares() {
        return deudaTotalEnDolares;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public String getValorPago() {
        return valorPago;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public String getMontoAvance() {
        return montoAvance;
    }

    public String getNumeroTarjetaDestino() {
        return numeroTarjetaDestino;
    }

    public String getMensajeConfirmacion() {
        return mensajeConfirmacion;
    }

    public String getMensajeAvanceNoExitoso() {
        return mensajeAvanceNoExitoso;
    }

    @Override
    public TarjetaCredito build() {
        return new TarjetaCredito(this);
    }
}