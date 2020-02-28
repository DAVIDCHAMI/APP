package co.com.bancolombia.certificacion.app.interactions.eprepago;

import static co.com.bancolombia.certificacion.app.models.builders.MovimientoBuilder.movimiento;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_LISTA_MOVIMIENTOS;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.obtenerIteradorEprepago;

import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder;
import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class GuardarMovimientos implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    String platform = ElementFinder.getPlatformCapability();
    List<Movimiento> listaMovimiento = new ArrayList<>();

    if (("Android").equalsIgnoreCase(platform)) {
      int cantidadMovimientos = CONTENEDOR_MOVIMIENTOS_EPREPAGO.resolveAllFor(actor).size();

      for (int iterador = 1; iterador <= cantidadMovimientos; iterador++) {
        listaMovimiento.add(
            movimiento()
                .conFecha(
                    LBL_FECHA_MOVIMIENTO_EPREPAGO
                        .of(String.valueOf(obtenerIteradorEprepago(iterador)))
                        .resolveFor(actor)
                        .getText())
                .conDescripcion(
                    LBL_DESCRIPCION_MOVIMIENTO_EPREPAGO
                        .of(String.valueOf(obtenerIteradorEprepago(iterador)))
                        .resolveFor(actor)
                        .getText())
                .conValorMovimiento(
                    LBL_SALDO_MOVIMIENTO_EPREPAGO
                        .of(String.valueOf(obtenerIteradorEprepago(iterador)))
                        .resolveFor(actor)
                        .getText())
                .build());
      }
    } else {
      int iterador1 = 9;
      int iterador2 = 1;
      int iterador3 = 11;

      while (!MOVIMIENTOS_EPREPAGO_DES
          .of(String.valueOf(iterador3 + 1))
          .resolveFor(actor)
          .getText()
          .contains("No tienes")) {
        listaMovimiento.add(
            movimiento()
                .conFecha(
                    MOVIMIENTOS_EPREPAGO_FECHA_VALOR
                        .of(String.valueOf(iterador1), String.valueOf(iterador2))
                        .resolveFor(actor)
                        .getText())
                .conValorMovimiento(
                    MOVIMIENTOS_EPREPAGO_FECHA_VALOR
                        .of(String.valueOf(iterador1), String.valueOf(iterador2 + 1))
                        .resolveFor(actor)
                        .getText())
                .conDescripcion(
                    MOVIMIENTOS_EPREPAGO_DES
                        .of(String.valueOf(iterador3))
                        .resolveFor(actor)
                        .getText())
                .build());
        iterador1 = iterador1 + 3;
        iterador3 = iterador3 + 3;
      }
    }
    actor.remember(MODELO_LISTA_MOVIMIENTOS, listaMovimiento);
  }

  public static GuardarMovimientos deEprepago() {
    return new GuardarMovimientos();
  }
}
