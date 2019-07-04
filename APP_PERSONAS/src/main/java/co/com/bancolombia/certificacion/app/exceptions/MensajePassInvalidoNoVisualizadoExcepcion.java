package co.com.bancolombia.certificacion.app.exceptions;

public class MensajePassInvalidoNoVisualizadoExcepcion extends AssertionError {

    public static final String MENSAJE_PASS_INVALIDO_NO_ENCONTRADO = "Mensaje de validacion contraseña incorrecta no visualizado";

    public MensajePassInvalidoNoVisualizadoExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
