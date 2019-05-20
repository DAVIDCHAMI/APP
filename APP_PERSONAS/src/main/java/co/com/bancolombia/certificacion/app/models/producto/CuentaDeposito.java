package co.com.bancolombia.certificacion.app.models.producto;


import co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoCuentas.AHORRO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoCuentas.CORRIENTE;

/**
 * The type Deposit account.
 */
public class CuentaDeposito extends Producto {

    private String tipoCuentaEnLetra;
    private String tipoCuentaEnNumero;
    private String numeroCuentaFormateado;


    public CuentaDeposito() {
        super();
    }
    /**
     * Instantiates a new Deposit account.
     *
     * @param number      the number
     * @param productType the producto type
     */
    public CuentaDeposito(String number, String productType) {
        super(number, productType);
    }

    /**
     * Gets type account in letter.
     *
     * @return the type account in letter
     */
    public String getTipoCuentaEnLetra() {
        return tipoCuentaEnLetra;
    }

    /**
     * Sets type account in letter.
     *
     * @param tipoCuentaEnLetras the type account in letter
     */
    public void setTipoCuentaEnLetras(String tipoCuentaEnLetras) {
        if (tipoCuentaEnLetras.equalsIgnoreCase(AHORRO.getLetra()) || tipoCuentaEnLetras.equalsIgnoreCase(CORRIENTE.getLetra())) {
            this.tipoCuentaEnLetra = tipoCuentaEnLetras;
        } else {
            this.tipoCuentaEnLetra = AdministradorUtilidades.tipoCuentaLetra(tipoCuentaEnLetras);
        }

    }

    /**
     * Gets type account in number.
     *
     * @return the type account in number
     */
    public String getTipoCuentaEnNumero() {
        return tipoCuentaEnNumero;
    }

    /**
     * Sets type account in number.
     *
     * @param tipoCuentaEnNumeros the type account in number
     */
    public void setTipoCuentaEnNumeros(String tipoCuentaEnNumeros) {
        if (tipoCuentaEnNumeros.equalsIgnoreCase(CORRIENTE.getNumero()) || tipoCuentaEnNumeros.equalsIgnoreCase(AHORRO.getNumero())) {
            this.tipoCuentaEnNumero = tipoCuentaEnNumeros;
        } else {
            this.tipoCuentaEnNumero = AdministradorUtilidades.formatoTipoCuentaNumero(tipoCuentaEnNumeros);
        }

    }

    /**
     * Gets account number format.
     *
     * @return the account number format
     */
    public String getNumeroCuentaFormateado() {
        return numeroCuentaFormateado;
    }

    /**
     * Sets account number format.
     *
     * @param accountNumberFormat the account number format
     */
    public void setNumeroCuentaFormateado(String accountNumberFormat) {
        this.numeroCuentaFormateado = AdministradorUtilidades.formatoCuentaDeposito(accountNumberFormat);
    }


}
