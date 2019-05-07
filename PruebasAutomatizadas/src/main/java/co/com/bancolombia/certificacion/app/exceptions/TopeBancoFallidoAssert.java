package co.com.bancolombia.certificacion.app.exceptions;

public class TopeBancoFallidoAssert extends AssertionError {

    public static final String TOPE_BANCO_FALLIDO = "Los topes banco no pueden ser verificados";

    public TopeBancoFallidoAssert(String mensaje) {
        super(mensaje);
    }

    public TopeBancoFallidoAssert(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
