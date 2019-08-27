package co.com.bancolombia.certificacion.app.exceptions.codigoqr;

public class MensajeVerificacionNoPresentado extends AssertionError {
    public static final String NO_PRESENTA_MENSAJE_CONFIRMACION = "El mensaje de verificación no fue presentado";

    public MensajeVerificacionNoPresentado(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
