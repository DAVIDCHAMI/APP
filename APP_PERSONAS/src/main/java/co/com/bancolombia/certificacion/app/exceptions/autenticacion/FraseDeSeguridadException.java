package co.com.bancolombia.certificacion.app.exceptions.autenticacion;

public class FraseDeSeguridadException extends AssertionError {
    public static final String FRASE_DE_SEGURIDAD_NO_VISIBLE = "No se visualiza la frase de seguridad asociada al usuario";
    public static final String FRASE_DE_SEGURIDAD_VISIBLE = "Se visualiza frase de seguridad asociada al usuario o hubo un error desconocido";

    public FraseDeSeguridadException(String message, Throwable cause) {
        super(message, cause);
    }
}