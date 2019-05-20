package co.com.bancolombia.certificacion.app.models.saldo;

import co.com.bancolombia.certificacion.app.models.producto.Producto;

public class Saldo extends Producto {

    private String saldoTotal;    //Saldo Total
    private String saldoEnCanje; //Saldo en canje
    private String saldoDisponible; //Saldo disponible

    /**
     * Instantiates a new Producto.
     *
     * @param numero       the numero
     * @param tipoProducto the producto type
     */
    protected Saldo(String numero, String tipoProducto) {
        super(numero, tipoProducto);
    }

    public Saldo() {
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
