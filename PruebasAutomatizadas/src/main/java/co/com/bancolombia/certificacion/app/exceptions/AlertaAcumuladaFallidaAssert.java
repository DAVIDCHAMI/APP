package co.com.bancolombia.certificacion.app.exceptions;

public class AlertaAcumuladaFallidaAssert extends AssertionError {

    public static final String ALERTA_ACUMULADA_FALLIDA = "La alerta acumulada no puede ser verificada";

    public AlertaAcumuladaFallidaAssert(String mensaje) {
        super(mensaje);
    }

    public AlertaAcumuladaFallidaAssert(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
