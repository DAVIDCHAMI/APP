package co.com.bancolombia.certificacion.app.exceptions;

/**
 * The type Start exception.
 */
public class InicioError extends AssertionError {

    /**
     * The constant MENSAJE_PAGINA_INICIO_SESION_NO_CARGA.
     */
    public static final String MENSAJE_PAGINA_INICIO_SESION_NO_CARGA = "La pagina de inicio de sesion no puede ser cargada";
    /**
     * The constant MENSAJE_AUTENTICACION_FALLIDA.
     */
    public static final String MENSAJE_AUTENTICACION_FALLIDA = "La autenticacion ha sido fallida";

    /**
     * Instantiates a new Start exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public InicioError(String message, Throwable cause) {
        super(message, cause);
    }
}