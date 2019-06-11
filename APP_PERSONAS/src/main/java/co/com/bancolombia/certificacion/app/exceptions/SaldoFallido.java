package co.com.bancolombia.certificacion.app.exceptions;

public class SaldoFallido extends AssertionError {

    public static final String SALDO_FALLIDO = "No se generan saldo de débito o crédito en las cuentas de depósito.";

    public SaldoFallido(String mensaje) {
        super(mensaje);
    }

    public SaldoFallido(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
