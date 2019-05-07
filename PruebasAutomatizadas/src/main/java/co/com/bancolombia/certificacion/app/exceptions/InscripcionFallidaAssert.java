package co.com.bancolombia.certificacion.app.exceptions;

public class InscripcionFallidaAssert extends AssertionError{

    public static final String INSCRIPCION_FALLIDA = "La inscripcion no se pudo realizar";
    public static final String CASO_ALTERNO_FALLIDO = "El caso alterno no pudo ser verificado para la inscripción";

    public InscripcionFallidaAssert(String mensaje) { super(mensaje);
    }

    public InscripcionFallidaAssert(String mensaje, Throwable causa) {super(mensaje, causa);
    }
}
