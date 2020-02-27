package co.com.bancolombia.certificacion.app.tasks.billetera;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.IMG_TARJETA_LISTA_ELEGIR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.LBL_ELIGE_UNA_TARJETA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.BTN_CAMBIAR_TARJETA_VERIFICAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CambiarTarjetaBilletera implements Task {
  private DatosPagoBilletera datosPagoBilletera;

  public CambiarTarjetaBilletera(DatosPagoBilletera datosPagoBilletera) {
    this.datosPagoBilletera = datosPagoBilletera;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_CAMBIAR_TARJETA_VERIFICAR),
        WaitUntil.the(LBL_ELIGE_UNA_TARJETA, isVisible()),
        Click.on(
            IMG_TARJETA_LISTA_ELEGIR.of(
                datosPagoBilletera.getTipoTarjeta(), datosPagoBilletera.getNumeroTarjeta())));
  }
}
