package co.com.bancolombia.certificacion.app.models.productos;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.formatoTarjetaCredito;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.tipoTarjetaCreditoEnNumero;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;

public class TarjetaCredito extends Producto {
  private String formatoTarjetaCredito;
  private String tipoTarjetaCreditoEnNumero;
  private String fechaLimitePago;
  private String fechaProximoPago;
  private String fechaVencimiento;
  private String pagoMinimoEnPesos;
  private String pagoTotalEnPesos;
  private String trm;
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

  public TarjetaCredito(TarjetaCreditoBuilder builder) {
    super(builder.getNumeroCuenta(), builder.getTipoCuenta());
    this.formatoTarjetaCredito = builder.getFormatoTarjetaCredito();
    this.tipoTarjetaCreditoEnNumero = builder.getTipoTarjetaCreditoEnNumero();
    this.fechaProximoPago = builder.getFechaProximoPago();
    this.fechaVencimiento = builder.getFechaVencimiento();
    this.pagoMinimoEnPesos = builder.getPagoMinimoEnPesos();
    this.pagoTotalEnPesos = builder.getPagoTotalEnPesos();
    this.trm = builder.getTrm();
    this.deudaALaFechaEnPesos = builder.getDeudaALaFechaEnPesos();
    this.avancesDisponiblesEnPesos = builder.getAvancesDisponiblesEnPesos();
    this.totalDisponibleEnPesos = builder.getTotalDisponibleEnPesos();
    this.pagoMinimoEnDolares = builder.getPagoMinimoEnDolares();
    this.totalPagoEnDolares = builder.getTotalPagoEnDolares();
    this.deudaTotalEnDolares = builder.getDeudaTotalEnDolares();
    this.tipoPago = builder.getTipoPago();
    this.valorPago = builder.getValorPago();
    this.moneda = builder.getMoneda();
    this.numeroTarjeta = builder.getNumeroTarjeta();
    this.tipoTarjeta = builder.getTipoTarjeta();
    this.codigoSeguridad = builder.getCodigoSeguridad();
    this.montoAvance = builder.getMontoAvance();
    this.numeroTarjetaDestino = builder.getNumeroTarjetaDestino();
    this.mensajeConfirmacion = builder.getMensajeConfirmacion();
    this.mensajeAvanceNoExitoso = builder.getMensajeAvanceNoExitoso();
  }

  public TarjetaCredito() {}

  public TarjetaCredito(String numero, String tipoProducto) {
    super(numero, tipoProducto);
  }

  public String getFormatoTarjetaCredito() {
    return formatoTarjetaCredito;
  }

  public void setFormatoTarjetaCredito(String number, String accountType) {
    this.formatoTarjetaCredito = formatoTarjetaCredito(number, accountType);
  }

  public void setTipoTarjetaCreditoEnNumero(String accountType) {
    this.tipoTarjetaCreditoEnNumero = tipoTarjetaCreditoEnNumero(accountType);
  }

  public String getTipoTarjetaCreditoEnNumero() {
    return tipoTarjetaCreditoEnNumero;
  }

  public void setFormatoTarjetaCredito(String creditCardFormat) {
    this.formatoTarjetaCredito = creditCardFormat;
  }

  public String getFechaLimitePago() {
    return fechaLimitePago;
  }

  public void setFechaLimitePago(String fechaLimitePago) {
    this.fechaLimitePago = fechaLimitePago;
  }

  public String getFechaVencimiento() {
    return fechaVencimiento;
  }

  public String getFechaProximoPago() {
    return fechaProximoPago;
  }

  public String getMinimumPaymentPesos() {
    return pagoMinimoEnPesos;
  }

  public void setMinimumPaymentPesos(String minimumPaymentPesos) {
    this.pagoMinimoEnPesos = minimumPaymentPesos;
  }

  public String getPagoTotalEnPesos() {
    return pagoTotalEnPesos;
  }

  public void setPagoTotalEnPesos(String pagoTotalEnPesos) {
    this.pagoTotalEnPesos = pagoTotalEnPesos;
  }

  public String getDeudaALaFechaEnPesos() {
    return deudaALaFechaEnPesos;
  }

  public void setDeudaALaFechaEnPesos(String deudaALaFechaEnPesos) {
    this.deudaALaFechaEnPesos = deudaALaFechaEnPesos;
  }

  public void setValorPago(String valorPago) {
    this.valorPago = valorPago;
  }

  public String getAvancesDisponiblesEnPesos() {
    return avancesDisponiblesEnPesos;
  }

  public void setAvancesDisponiblesEnPesos(String avancesDisponiblesEnPesos) {
    this.avancesDisponiblesEnPesos = avancesDisponiblesEnPesos;
  }

  public String getTrm() {
    return trm;
  }

  public String getTotalDisponibleEnPesos() {
    return totalDisponibleEnPesos;
  }

  public void setTotalDisponibleEnPesos(String totalDisponibleEnPesos) {
    this.totalDisponibleEnPesos = totalDisponibleEnPesos;
  }

  public String getPagoMinimoEnDolares() {
    return pagoMinimoEnDolares;
  }

  public void setPagoMinimoEnDolares(String pagoMinimoEnDolares) {
    this.pagoMinimoEnDolares = pagoMinimoEnDolares;
  }

  public String getTotalPagoEnDolares() {
    return totalPagoEnDolares;
  }

  public void setTotalPagoEnDolares(String totalPagoEnDolares) {
    this.totalPagoEnDolares = totalPagoEnDolares;
  }

  public String getDeudaTotalEnDolares() {
    return deudaTotalEnDolares;
  }

  public void setDeudaTotalEnDolares(String deudaTotalEnDolares) {
    this.deudaTotalEnDolares = deudaTotalEnDolares;
  }

  public String getPagoMinimoEnPesos() {
    return pagoMinimoEnPesos;
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
}
