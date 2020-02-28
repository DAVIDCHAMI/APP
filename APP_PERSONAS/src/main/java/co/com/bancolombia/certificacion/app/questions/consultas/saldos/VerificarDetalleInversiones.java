package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarDetalleInversiones implements Question<Boolean> {
  @Override
  public Boolean answeredBy(Actor actor) {
    Producto producto = actor.recall(MODELO_DETALLE_PRODUCTO);
    return (producto.getTipo() != null
        && producto.getNumero() != null
        && producto.getInversion().getSaldoDisponible() != null
        && producto.getInversion().getSaldoTotal() != null);
  }

  public static VerificarDetalleInversiones esExitoso() {
    return new VerificarDetalleInversiones();
  }
}
