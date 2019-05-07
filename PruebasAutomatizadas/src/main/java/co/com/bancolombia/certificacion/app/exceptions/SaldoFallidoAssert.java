package co.com.bancolombia.certificacion.app.exceptions;

public class SaldoFallidoAssert extends AssertionError {

    public static final String SALDO_FALLIDO = "No se generan saldos de débito o crédito en las cuentas de depósito.";

    public SaldoFallidoAssert(String mensaje) {
        super(mensaje);
    }

    public SaldoFallidoAssert(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
