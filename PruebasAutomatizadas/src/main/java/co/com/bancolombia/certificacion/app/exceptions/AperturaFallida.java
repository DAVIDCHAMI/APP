package co.com.bancolombia.certificacion.app.exceptions;

/**
 * The type Start exception.
 */
public class AperturaFallida extends AssertionError {

    /**
     * The constant MENSAJE_APERTURA_INVERSION_VIRTUAL_FALLIDA.
     */
    public static final String MENSAJE_APERTURA_INVERSION_VIRTUAL_FALLIDA = "La apertura de inversion virtual ha fallado";


    /**
     * Instantiates a new Start exception.
     *
     * @param mensaje the mensaje
     * @param causa   the causa
     */
    public AperturaFallida(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}