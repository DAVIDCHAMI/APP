package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_TASK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;

public class GenerarCodigoQr {

  public static GenerarQR sinInciarSesion(
      String nombrePersonalizado, TransferenciaBuilder transferencia) {
    return instrumented(SinInicioSesion.class, nombrePersonalizado, transferencia);
  }

  public static GenerarQR conInicioSesion(TransferenciaBuilder transferencia) {
    return instrumented(ConInicioSesion.class, transferencia);
  }

  private GenerarCodigoQr() {
    throw new IllegalStateException(CLASE_TASK);
  }
}
