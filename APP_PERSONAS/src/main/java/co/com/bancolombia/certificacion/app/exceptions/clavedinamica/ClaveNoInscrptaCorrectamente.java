package co.com.bancolombia.certificacion.app.exceptions.clavedinamica;

public class ClaveNoInscrptaCorrectamente extends AssertionError{
    public static final String NO_INCRIBE_CLAVE_DINAMICA="Los datos mostrados no coincden con los ingresados";

    public ClaveNoInscrptaCorrectamente(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}