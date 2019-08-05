package co.com.bancolombia.certificacion.app.exceptions.autenticacion;

public class InicioError extends AssertionError {

    public static final String MENSAJE_PAGINA_INICIO_SESION_NO_CARGA = "La pagina de inicio de sesion no puede ser cargada";

    public static final String MENSAJE_AUTENTICACION_FALLIDA = "La autenticacion ha sido fallida";

    public InicioError(String message, Throwable cause) {
        super(message, cause);
    }
}