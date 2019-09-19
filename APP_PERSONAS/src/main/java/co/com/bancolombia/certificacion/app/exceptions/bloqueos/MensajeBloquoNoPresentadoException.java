package co.com.bancolombia.certificacion.app.exceptions.bloqueos;

public class MensajeBloquoNoPresentadoException extends AssertionError  {
    public static final String MENSAJE_NO_PRESENTADO = "El mensaje de bloqueo exitoso no fue presentado";

    public MensajeBloquoNoPresentadoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
