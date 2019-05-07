package co.com.bancolombia.certificacion.app.exceptions;

/**
 * The type Clave no valida.
 */
public class ContraseniaNoValida extends AssertionError {

    /**
     * The constant MENSAJE_LONGITUD_NO_VALIDA
     */
    public static final String MENSAJE_LONGITUD_NO_VALIDA = "La longitud de la clave no es valida";

    /**
     * Instantiates a new Clave no valida.
     *
     * @param mensaje el mensaje
     * @param causa   the causa
     */
    public ContraseniaNoValida(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
