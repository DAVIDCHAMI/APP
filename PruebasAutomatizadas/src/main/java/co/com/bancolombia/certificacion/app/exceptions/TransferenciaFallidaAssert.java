package co.com.bancolombia.certificacion.app.exceptions;

public class TransferenciaFallidaAssert extends AssertionError {

    public static final String TRANSFERENCIA_FALLIDA = "El monto pagado no fue deducido de la cuenta origen";
    public static final String CASO_ALTERNO_FALLIDO = "El caso alterno no pudo ser verificado para la transferencia";

    public TransferenciaFallidaAssert(String mensaje) {super(mensaje);
    }

    public TransferenciaFallidaAssert(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
