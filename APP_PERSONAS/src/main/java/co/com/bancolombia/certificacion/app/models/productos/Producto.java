package co.com.bancolombia.certificacion.app.models.productos;


import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import co.com.bancolombia.certificacion.app.models.saldo.Saldo;

import java.util.List;

/**
 * The type Producto.
 */
public class Producto {

    private String numero;
    private String tipo;
    private String codigoBanco;
    private String nombreBanco;
    private String nombreProducto;
    private Saldo saldo;
    private List<Movimiento> movimientos;


    protected Producto(){}
    /**
     * Instantiates a new Producto.
     *
     * @param numero      the numero
     * @param tipoProducto the productos type
     */
    protected Producto(String numero, String tipoProducto) {
        this.numero = numero;
        this.tipo = tipoProducto;
    }

    /**
     * Gets movimientos.
     *
     * @return the movimientos
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Sets movimientos.
     *
     * @param movimientos the movimientos
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * Gets numero.
     *
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets numero.
     *
     * @param numero the numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Gets productos type.
     *
     * @return the productos type
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets productos type.
     *
     * @param tipo the tipo productos
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets bank code.
     *
     * @return the bank code
     */
    public String getCodigoBanco() {
        return codigoBanco;
    }

    /**
     * Sets bank code.
     *
     * @param codigoBanco the codigo banco
     */
    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    /**
     * Gets bank name.
     *
     * @return the bank name
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Sets bank name.
     *
     * @param nombreBanco the nombre banco
     */
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    /**
     * Gets productos name.
     *
     * @return the productos name
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Sets productos name.
     *
     * @param nombreProducto the productos name
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Gets saldo cuenta deposito
     * @return saldo
     */
    public Saldo getSaldo() {
        return saldo;
    }

    /**
     * Sets saldo cuenta deposito
     * @param saldo
     */
    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

}
