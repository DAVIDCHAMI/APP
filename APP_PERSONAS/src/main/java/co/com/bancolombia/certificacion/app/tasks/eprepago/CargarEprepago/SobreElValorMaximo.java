package co.com.bancolombia.certificacion.app.tasks.eprepago.CargarEprepago;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.BTN_PRODUCTO_ORIGEN;
import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.RecargarTarjetaVirtualEprepagoPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.RecargarTarjetaVirtualEprepagoPage.FOCO_E_PREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.RECARGAR_EPREPAGO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.comunes.Validar;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SobreElValorMaximo implements Task {

  private Producto producto;
  private String valorRecarga;

  public SobreElValorMaximo(Producto producto, String valorRecarga) {
    this.producto = producto;
    this.valorRecarga = valorRecarga;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        RealizarScroll.hastaPosicionDeTarget(BTN_RECARGAR_EPREPAGO),
        Click.on(BTN_RECARGAR_EPREPAGO),
        Check.whether(Verificar.elementoVisible(actor, LBL_PRODUCTO_ORIGEN_EPREPAGO))
            .andIfSo(
                RealizarScroll.hastaPosicionDeTarget(
                    BTN_PRODUCTO_ORIGEN.of(producto.getTipo(), producto.getNumero())),
                Esperar.unTiempo(3000),
                Click.on(BTN_PRODUCTO_ORIGEN.of(producto.getTipo(), producto.getNumero()))));
    actor.attemptsTo(
        Enter.theValue(valorRecarga).into(TXT_VALOR_RECARGA_EPREPAGO),
        Click.on(FOCO_E_PREPAGO),
        WaitUntil.the(LNK_SIGUIENTE, isEnabled()),
        Click.on(LNK_SIGUIENTE),
        Click.on(LNK_RECARGAR_EPREPAGO),
        Validar.carga());
    actor.remember(MODELO_PRODUCTO, producto);
    actor.remember(RECARGAR_EPREPAGO, valorRecarga);
  }
}
