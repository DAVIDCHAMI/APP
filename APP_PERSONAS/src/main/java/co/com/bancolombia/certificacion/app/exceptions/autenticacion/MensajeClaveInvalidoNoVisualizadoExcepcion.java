package co.com.bancolombia.certificacion.app.exceptions.autenticacion;

public class MensajeClaveInvalidoNoVisualizadoExcepcion extends AssertionError {
    public static final String MENSAJE_PASS_INVALIDO_NO_ENCONTRADO = "Mensaje de validacion contraseña incorrecta no visualizado";

    public MensajeClaveInvalidoNoVisualizadoExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}