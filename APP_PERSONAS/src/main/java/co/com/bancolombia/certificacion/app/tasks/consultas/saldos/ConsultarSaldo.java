package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO_SALDOS_MOVIMIENTOS;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import java.util.ArrayList;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsultarSaldo implements Task {
  private String opcionCategoria;

  public ConsultarSaldo(String opcionCategoria) {
    this.opcionCategoria = opcionCategoria;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(SeleccionarCategoria.deSaldosMovimientos(opcionCategoria));
    List<Producto> listaProductos = new ArrayList<>();
    listaProductos.add(
        tarjetaCredito()
            .conTipoTarjeta(LBL_TIPO_ECARD.resolveFor(actor).getText())
            .conNumeroTarjeta(LBL_NUMERO_ECARD.resolveFor(actor).getText())
            .conDeudaFechaPesos(LBL_DEUDA_PESOS_ECARD.resolveFor(actor).getText())
            .conDeudaFechaDolares(LBL_DEUDA_DOLARES.resolveFor(actor).getText())
            .build());
    actor.remember(MODELO_PRODUCTO_SALDOS_MOVIMIENTOS, listaProductos);
  }

  public static ConsultarSaldo deEcard(String opcionCategoria) {
    return Tasks.instrumented(ConsultarSaldo.class, opcionCategoria);
  }
}
