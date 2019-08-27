package co.com.bancolombia.certificacion.app.exceptions.clavedinamica;

public class ClaveNoInscritaCorrectamente extends AssertionError {
    public static final String NO_INCRIBE_CLAVE_DINAMICA = "Los datos mostrados no coincden con los ingresados";

    public ClaveNoInscritaCorrectamente(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}