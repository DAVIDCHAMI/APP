package co.com.bancolombia.certificacion.app.exceptions.avancetarjetacredito;

public class AvanceNoExitoso extends AssertionError {
    public static final String MENSAJE_AVANCE_NO_EXITOSO = "Ocurrio error en la visualización del mensaje";

    public AvanceNoExitoso(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
