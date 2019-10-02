package co.com.bancolombia.certificacion.app.exceptions.eprepago;

public class NoSeRealizoLaSolicitudEprepagoException extends AssertionError{
    public static final String MENSAJE_E_PREPAGO_NO_SOLICITADA = "No se realizo la activacion exitosa de e-prepago";

    public NoSeRealizoLaSolicitudEprepagoException(String mensaje, Throwable causa){super(mensaje, causa);}
}