package co.com.bancolombia.certificacion.app.exceptions.eprepago;

public class NoSeRealizoLaConsulta extends AssertionError {
    public static final String MENSAJE_CONSULTA_NO_REALIZADA = "No se realizo la consulta de forma exitosa de e-prepago";

    public NoSeRealizoLaConsulta(String mensaje, Throwable causa){super(mensaje, causa);}
}