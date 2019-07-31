package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.saldo.Saldo;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

public class SaldoBuilder implements Builder<Saldo> {
    private String saldoTotal;
    private String saldoEnCanje;
    private String saldoDisponible;

    public SaldoBuilder(){
        this.saldoTotal = "";
        this.saldoEnCanje = "";
        this.saldoDisponible = "";
    }

    public static SaldoBuilder saldo(){
        return new SaldoBuilder();
    }

    public SaldoBuilder conSaldoTotal(String saldoTotal){
        this.saldoTotal = saldoTotal;
        return this;
    }

    public SaldoBuilder conSaldoEnCanje(String saldoEnCanje){
        this.saldoEnCanje = saldoEnCanje;
        return this;
    }

    public SaldoBuilder conSaldoDisponible(String saldoDisponible){
        this.saldoDisponible = saldoDisponible;
        return this;
    }

    public String getSaldoTotal() {
        return saldoTotal;
    }

    public String getSaldoEnCanje() {
        return saldoEnCanje;
    }

    public String getSaldoDisponible() {
        return saldoDisponible;
    }

    @Override
    public Saldo build() {
        return new Saldo(this);
    }
}
