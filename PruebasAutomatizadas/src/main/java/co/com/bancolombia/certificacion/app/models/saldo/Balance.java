package co.com.bancolombia.certificacion.app.models.saldo;

import co.com.bancolombia.certificacion.app.models.producto.Producto;

public class Balance extends Producto {

    private String totalBalance;    //Saldo Total
    private String exchangeBalance; //Saldo en canje
    private String availableBalance; //Saldo disponible

    /**
     * Instantiates a new Producto.
     *
     * @param numero       the numero
     * @param tipoProducto the producto type
     */
    protected Balance(String numero, String tipoProducto) {
        super(numero, tipoProducto);
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getExchangeBalance() {
        return exchangeBalance;
    }

    public void setExchangeBalance(String exchangeBalance) {
        this.exchangeBalance = exchangeBalance;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }
}
