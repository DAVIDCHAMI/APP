package co.com.bancolombia.certificacion.app.tasks.eprepago.CargarEprepago;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_TASK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import net.serenitybdd.screenplay.Performable;

public class CargarValor {

  public static Performable sobreElValorMaximoCon(ProductoBuilder producto, String valorRecarga) {
    return instrumented(SobreElValorMaximo.class, producto.build(), valorRecarga);
  }

  public static Performable SobreElValorMinimoCon(ProductoBuilder producto, String valorRecarga) {
    return instrumented(SobreElValorMinimo.class, producto.build(), valorRecarga);
  }

  private CargarValor() {
    throw new IllegalStateException(CLASE_TASK);
  }
}
