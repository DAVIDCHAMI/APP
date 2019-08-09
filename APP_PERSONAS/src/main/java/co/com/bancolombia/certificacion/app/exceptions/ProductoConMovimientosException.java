package co.com.bancolombia.certificacion.app.exceptions;

public class ProductoConMovimientosException extends AssertionError {
    public static final String CON_MOVIMIENTOS= "La cuenta tiene movimientos";

    public ProductoConMovimientosException(String message, Throwable cause) {
        super(message, cause);
    }
}