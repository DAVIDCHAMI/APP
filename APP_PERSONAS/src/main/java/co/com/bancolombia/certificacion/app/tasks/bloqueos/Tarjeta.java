package co.com.bancolombia.certificacion.app.tasks.bloqueos;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoVisible;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Tarjeta implements Task {
  private Producto producto;

  public Tarjeta(Producto producto) {
    this.producto = producto;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Check.whether(elementoVisible(actor, LBL_TARJETAS))
            .andIfSo(
                Scroll.to(BTN_TARJETA_BLOQUEAR.of(producto.getTipo(), producto.getNumero())),
                JavaScriptClick.on(
                    BTN_TARJETA_BLOQUEAR.of(producto.getTipo(), producto.getNumero()))),
        Click.on(LNK_BLOQUEAR),
        WaitUntil.the(BTN_BLOQUEAR, isEnabled()),
        Click.on(BTN_BLOQUEAR),
        Validar.carga());
    actor.remember(MODELO_PRODUCTO, producto);
  }
}
