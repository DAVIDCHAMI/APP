package co.com.bancolombia.certificacion.app.tasks.billetera;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.IMG_TARJETA_LISTA_ELEGIR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.LBL_ELIGE_UNA_TARJETA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.*;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.ArchivosUtilidades.abrirCodigoQr;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.bancolombia.certificacion.app.interactions.billetera.SeleccionarPago;
import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LeerQR implements Task {
  private DatosPagoBilletera datosPagoBilletera;

  public LeerQR(DatosPagoBilletera datosPagosBilletera) {
    this.datosPagoBilletera = datosPagosBilletera;
  }

  public static Performable estatico(DatosPagoBilleteraBuilder datosPagoBilleteraBuilder) {
    return instrumented(LeerQR.class, datosPagoBilleteraBuilder.build());
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarPago.conBilletera(),
        WaitUntil.the(LBL_ELIGE_UNA_TARJETA, isVisible()),
        Click.on(
            IMG_TARJETA_LISTA_ELEGIR.of(
                datosPagoBilletera.getTipoTarjeta(), datosPagoBilletera.getNumeroTarjeta())));
    abrirCodigoQr("qr_estatico_uno");
  }
}
