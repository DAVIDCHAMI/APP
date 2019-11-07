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
    private String fechaLimitePago;
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
    private String codigoSeguridad;

    private TarjetaCreditoBuilder() {
        this.tipoCuenta = "";
        this.numeroCuenta = "";
        this.formatoTarjetaCredito = "";
        this.tipoTarjetaCreditoEnNumero = "";
        this.fechaLimitePago = "";
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
        this.numeroTarjeta="";
        this.codigoSeguridad ="";
    }

    public static TarjetaCreditoBuilder tarjetaCredito(){
        return new TarjetaCreditoBuilder();
    }

    public TarjetaCreditoBuilder conDatosDeTarjeta(List<Map<String, String>> datos) {
        this.numeroTarjeta= datos.get(0).get("numeroTarjeta");
        this.codigoSeguridad = datos.get(0).get("codigoSeguridad");
        return this;
    }

    public TarjetaCreditoBuilder conTipoPago(List<Map<String, String>> datos){
        this.tipoPago = datos.get(0).get("tipoPago");
        return this;
    }

    public TarjetaCreditoBuilder conValor(List<Map<String, String>> datos){
        this.valorPago = datos.get(0).get("valorPago");
        return this;
    }

    public TarjetaCreditoBuilder conTarjeta(List<Map<String, String>> datos){
        this.tipoCuenta = datos.get(0).get("tipoTarjeta");
        this.numeroCuenta = datos.get(0).get("numeroTarjeta");
        return this;
    }

    public TarjetaCreditoBuilder conMoneda(List<Map<String, String>> datos){
        this.moneda = datos.get(0).get("moneda");
        return this;
    }

    public TarjetaCreditoBuilder conDeudaFechaPesos(String datos){
        this.deudaALaFechaEnPesos = datos;
        return this;
    }

    public TarjetaCreditoBuilder conDeudaFechaDolares(String datos){
        this.deudaTotalEnDolares = datos;
        return this;
    }
    public TarjetaCreditoBuilder conAvanceDisponiblePeso(String datos){
        this.avancesDisponiblesEnPesos = datos;
        return this;
    }

    public TarjetaCreditoBuilder conFechaProximoPago(String datos){
        this.fechaLimitePago = datos;
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

    public String getTipoPago() {
        return tipoPago;
    }

    public String getValorPago() {
        return valorPago;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getNumeroTarjeta() {return numeroTarjeta;}

    public String getCodigoSeguridad() {return codigoSeguridad;}

    @Override
    public TarjetaCredito build() {
        return new TarjetaCredito(this);
    }
}