package co.com.bancolombia.certificacion.app.models.billetera;

import co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder;
import java.util.ArrayList;
import java.util.List;

public class DatosPagoBilletera {
  private String establecimiento;
  private String tipoTarjeta;
  private String numeroTarjeta;
  private String subtotal;
  private String iva;
  private String inc;
  private String propina;
  private String totalPagar;
  private List<String> infoPagoDeBilletera = new ArrayList<>();

  public DatosPagoBilletera(DatosPagoBilleteraBuilder datosPagoBilleteraBuilder) {
    this.establecimiento = datosPagoBilleteraBuilder.getEstablecimiento();
    this.tipoTarjeta = datosPagoBilleteraBuilder.getTipoTarjeta();
    this.numeroTarjeta = datosPagoBilleteraBuilder.getNumeroTarjeta();
    this.subtotal = datosPagoBilleteraBuilder.getSubtotal();
    this.iva = datosPagoBilleteraBuilder.getIva();
    this.inc = datosPagoBilleteraBuilder.getInc();
    this.propina = datosPagoBilleteraBuilder.getPropina();
    this.totalPagar = datosPagoBilleteraBuilder.getTotalPagar();
  }

  private void setInfoPagoDeBilletera() {
    infoPagoDeBilletera.add(establecimiento);
    infoPagoDeBilletera.add(tipoTarjeta);
    infoPagoDeBilletera.add(numeroTarjeta);
    infoPagoDeBilletera.add(subtotal);
    infoPagoDeBilletera.add(iva);
    infoPagoDeBilletera.add(inc);
    infoPagoDeBilletera.add(propina);
    infoPagoDeBilletera.add(totalPagar);
  }

  public String getEstablecimiento() {
    return establecimiento;
  }

  public String getTipoTarjeta() {
    return tipoTarjeta;
  }

  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public String getSubtotal() {
    return subtotal;
  }

  public String getIva() {
    return iva;
  }

  public String getInc() {
    return inc;
  }

  public String getPropina() {
    return propina;
  }

  public String getTotalPagar() {
    return totalPagar;
  }

  public List<String> getInfoPagoDeBilletera() {
    setInfoPagoDeBilletera();
    return infoPagoDeBilletera;
  }
}
