package co.com.bancolombia.certificacion.app.exceptions.autenticacion;

public class OpcionAunNoEresClienteException extends AssertionError {
  public static final String OPCION_AUN_NO_ERES_CLIENTE_NO_VISIBLE =
      "Opcion aun no eres cliente no fue visualizada";

  public OpcionAunNoEresClienteException(String message, Throwable cause) {
    super(message, cause);
  }
}
