package co.com.bancolombia.certificacion.app.exceptions;

/**
 * The type Start exception.
 */
public class ConsultaDetalleError extends AssertionError {

    /**
     * The constant MENSAJE_CONSULTA_DETALLE_CUENTA_DEPOSITO_FALLIDO.
     */
    public static final String MENSAJE_CONSULTA_DETALLE_CUENTA_DEPOSITO_FALLIDO = "La detalleproductos del detalleproductos de la cuenta deposito ha sido fallida";

    /**
     * The constant MENSAJE_CONSULTA_DETALLE_INVERSION_VIRTUAL_FALLIDO.
     */
    public static final String MENSAJE_CONSULTA_DETALLE_INVERSION_VIRTUAL_FALLIDO = "La Consulta del detalleproductos de inversion virtual ha sido fallida";


    /**
     * Instantiates a new Start exception.
     *
     * @param mensaje the mensaje
     * @param causa   the causa
     */
    public ConsultaDetalleError(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}