package co.com.bancolombia.certificacion.app.exceptions;

public class AlertaLogFallidaAssert extends AssertionError {

    public static final String ALERTA_LOG_FALLIDA = "La alerta del log no puede ser verificada";

    public AlertaLogFallidaAssert(String mensaje) {
        super(mensaje);
    }

    public AlertaLogFallidaAssert(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
