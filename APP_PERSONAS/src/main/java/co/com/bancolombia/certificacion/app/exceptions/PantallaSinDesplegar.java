package co.com.bancolombia.certificacion.app.exceptions;

public class PantallaSinDesplegar extends AssertionError {
    public static final String NO_PRESENTA_MENSAJE = "No se presentó el título de la pantalla";

    public PantallaSinDesplegar(String message, Throwable cause) {
        super(message, cause);
    }
}
