package co.com.bancolombia.certificacion.app.exceptions;

public class MensajeValidacionNoVisualizadoExcepcion extends AssertionError{



    public static final String MENSAJE_VALIDACION_NO_ENCONTRADO = "Mensaje de validacion no visualizado";

    public MensajeValidacionNoVisualizadoExcepcion(String mensaje, Throwable causa) {

        super(mensaje, causa);

    }




}
