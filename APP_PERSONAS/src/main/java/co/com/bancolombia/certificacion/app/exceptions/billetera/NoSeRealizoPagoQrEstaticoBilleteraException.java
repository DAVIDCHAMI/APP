package co.com.bancolombia.certificacion.app.exceptions.billetera;

public class NoSeRealizoPagoQrEstaticoBilleteraException extends AssertionError {
    public static final String MENSAJE_PAGO_NO_REALIZADO_EXCEPTION = "No se ha realizado el pago con la billetera";

    public NoSeRealizoPagoQrEstaticoBilleteraException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}