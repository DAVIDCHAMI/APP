package co.com.bancolombia.certificacion.app.exceptions.eprepago;

public class NoSeActivoEprepago extends AssertionError{
    public static final String MENSAJE_E_PREPAGO_NO_ACTIVADA = "No se realizo la activacion exitosa de e-prepago";

    public NoSeActivoEprepago(String mensaje, Throwable causa){super(mensaje, causa);}
}