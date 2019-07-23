package co.com.bancolombia.certificacion.app.exceptions.consultas.saldos;

public class DetalleProductoNoEsCorrectoException extends AssertionError {
    public static final String MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO = "El detalle del producto seleccionado no es correcto";

    public DetalleProductoNoEsCorrectoException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
