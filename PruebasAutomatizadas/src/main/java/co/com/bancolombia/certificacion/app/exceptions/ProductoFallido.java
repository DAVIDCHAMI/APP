package co.com.bancolombia.certificacion.app.exceptions;

public class ProductoFallido extends AssertionError {

    public static final String PRODUCTO_NO_EXISTE = "El producto no existe";

    public ProductoFallido(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductoFallido(String detailMessage) {
        super(detailMessage);
    }


}
