package co.com.bancolombia.certificacion.app.exceptions;

public class PantallaSinDespleglegar extends AssertionError {
    public static final String NO_PRESENTA_MENSAJE = "No se presentó el título de la pantalla";

    public PantallaSinDespleglegar(String message, Throwable cause) {
        super(message, cause);
    }
}
