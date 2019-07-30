package co.com.bancolombia.certificacion.app.models.saldo;

import co.com.bancolombia.certificacion.app.models.builders.SaldoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;

public class Saldo extends Producto {

    private String saldoTotal;
    private String saldoEnCanje;
    private String saldoDisponible;

    protected Saldo(String numero, String tipoProducto) {
        super(numero, tipoProducto);
    }

    public Saldo() {
    }

    public Saldo(SaldoBuilder saldoBuilder){
        this.saldoTotal = saldoBuilder.getSaldoTotal();
        this.saldoEnCanje = saldoBuilder.getSaldoEnCanje();
        this.saldoDisponible = saldoBuilder.getSaldoDisponible();
    }

    public String getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getSaldoEnCanje() {
        return saldoEnCanje;
    }

    public void setSaldoEnCanje(String saldoEnCanje) {
        this.saldoEnCanje = saldoEnCanje;
    }

    public String getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(String saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
