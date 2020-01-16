package co.com.bancolombia.certificacion.app.models.productos;

import co.com.bancolombia.certificacion.app.models.builders.InversionBuilder;

public class Inversion {
    private String tipoInversion;
    private String numeroInversion;
    private String saldoDisponible;
    private String saldoTotal;

    public Inversion(InversionBuilder builder) {
        this.tipoInversion = builder.getTipoInversion();
        this.numeroInversion = builder.getNumeroInversion();
        this.saldoDisponible = builder.getSaldoDisponible();
        this.saldoTotal = builder.getSaldoTotal();
    }

    public Inversion() {
    }

    public String getTipoInversion() {
        return tipoInversion;
    }

    public void setTipoInversion(String tipoInversion) {
        this.tipoInversion = tipoInversion;
    }

    public String getNumeroInversion() {
        return numeroInversion;
    }

    public void setNumeroInversion(String numeroInversion) {
        this.numeroInversion = numeroInversion;
    }

    public String getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(String saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public String getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}