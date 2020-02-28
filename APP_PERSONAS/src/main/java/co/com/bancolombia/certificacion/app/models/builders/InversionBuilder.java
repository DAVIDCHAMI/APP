package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.productos.Inversion;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Builder;

public class InversionBuilder implements Builder<Inversion> {
  private String tipoInversion;
  private String numeroInversion;
  private String saldoDisponible;
  private String saldoTotal;

  public InversionBuilder() {
    this.tipoInversion = "";
    this.numeroInversion = "";
    this.saldoDisponible = "";
    this.saldoTotal = "";
  }

  public static InversionBuilder inversion() {
    return new InversionBuilder();
  }

  public InversionBuilder conTipoInversion(String datos) {
    this.tipoInversion = datos;
    return this;
  }

  public InversionBuilder conNumeroInversion(String datos) {
    this.numeroInversion = datos;
    return this;
  }

  public InversionBuilder conSaldoDisponible(String datos) {
    this.saldoDisponible = datos;
    return this;
  }

  public InversionBuilder conSaldoTotal(String datos) {
    this.saldoTotal = datos;
    return this;
  }

  public String getTipoInversion() {
    return tipoInversion;
  }

  public String getNumeroInversion() {
    return numeroInversion;
  }

  public String getSaldoDisponible() {
    return saldoDisponible;
  }

  public String getSaldoTotal() {
    return saldoTotal;
  }

  @Override
  public Inversion build() {
    return new Inversion(this);
  }
}
