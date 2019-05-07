package co.com.bancolombia.certificacion.app.exceptions;

public class TopePersonalizadoFallidoAssert extends AssertionError {

    public static final String TOPES_PERSONALIZADOS_FALLIDOS = "Los topes personalizados no pueden ser verificados";

    public TopePersonalizadoFallidoAssert(String mensaje) {
        super(mensaje);
    }

    public TopePersonalizadoFallidoAssert(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
