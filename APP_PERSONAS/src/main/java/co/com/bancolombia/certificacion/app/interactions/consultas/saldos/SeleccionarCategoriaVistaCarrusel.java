package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CATEGORIA_PRODUCTOS_VISTA_CARRUSEL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarCategoriaVistaCarrusel implements Interaction {
  private String categoria;

  public SeleccionarCategoriaVistaCarrusel(String categoria) {
    this.categoria = categoria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        RealizarScroll.hastaPosicionDeTarget(CATEGORIA_PRODUCTOS_VISTA_CARRUSEL.of(categoria)),
        Click.on(CATEGORIA_PRODUCTOS_VISTA_CARRUSEL.of(categoria)));
  }

  public static SeleccionarCategoriaVistaCarrusel deSaldosMovimientos(String categoria) {
    return instrumented(SeleccionarCategoriaVistaCarrusel.class, categoria);
  }
}
