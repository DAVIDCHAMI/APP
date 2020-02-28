package co.com.bancolombia.certificacion.app.questions.avancetarjetacredito;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AvanceNoExitoso implements Question<Boolean> {
  private TarjetaCredito tarjetaCredito;

  public AvanceNoExitoso(TarjetaCredito tarjetaCredito) {
    this.tarjetaCredito = tarjetaCredito;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return LBL_CUPO_INSUFICIENTE_AVANCE
            .resolveFor(actor)
            .withTimeoutOf(20, TimeUnit.SECONDS)
            .isVisible()
        && LBL_CUPO_INSUFICIENTE_AVANCE
            .resolveAllFor(actor)
            .toString()
            .trim()
            .contains(tarjetaCredito.getMensajeAvanceNoExitoso());
  }

  public static AvanceNoExitoso validarAvanceNoExitoso(TarjetaCreditoBuilder datosExcel) {
    return new AvanceNoExitoso(datosExcel.build());
  }
}
