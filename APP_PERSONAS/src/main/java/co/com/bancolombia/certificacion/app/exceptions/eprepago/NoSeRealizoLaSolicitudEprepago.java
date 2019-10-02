package co.com.bancolombia.certificacion.app.exceptions.eprepago;

public class NoSeRealizoLaSolicitudEprepago extends AssertionError{
    public static final String MENSAJE_E_PREPAGO_NO_SOLICITADA = "No se realizo la activacion exitosa de e-prepago";

    public NoSeRealizoLaSolicitudEprepago(String mensaje, Throwable causa){super(mensaje, causa);}
}