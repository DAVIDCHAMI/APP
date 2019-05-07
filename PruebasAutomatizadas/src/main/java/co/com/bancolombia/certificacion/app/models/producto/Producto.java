package co.com.bancolombia.certificacion.app.models.producto;


import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;

import java.util.List;

/**
 * The type Producto.
 */
public class Producto {

    private String numero;
    private String tipoProducto;
    private String codigoBanco;
    private String nombreBanco;
    private String nombreProducto;
    private List<Movimiento> movimientos;


    protected Producto(){}
    /**
     * Instantiates a new Producto.
     *
     * @param numero      the numero
     * @param tipoProducto the producto type
     */
    protected Producto(String numero, String tipoProducto) {
        this.numero = numero;
        this.tipoProducto = tipoProducto;
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
     * Gets producto type.
     *
     * @return the producto type
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Sets producto type.
     *
     * @param tipoProducto the tipo producto
     */
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
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
     * Gets producto name.
     *
     * @return the producto name
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Sets producto name.
     *
     * @param nombreProducto the producto name
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

}
