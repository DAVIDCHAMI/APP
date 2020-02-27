package co.com.bancolombia.certificacion.app.tasks.consultas.saldos;

import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.BTN_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_TARJETA_CREDITO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.OpcionCategoriaSaldosMovimientosEnum.TARJETAS_CREDITO;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConsultarDetalleTarjetaEcard implements Task {
  private String tipoTarjeta;
  private String numeroTarjeta;

  public ConsultarDetalleTarjetaEcard(String tipoTarjeta, String numeroTarjeta) {
    this.tipoTarjeta = tipoTarjeta;
    this.numeroTarjeta = numeroTarjeta;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SeleccionarCategoria.deSaldosMovimientos(TARJETAS_CREDITO.getCategoria()),
        SeleccionarProducto.desdeSaldosMovimientos(
            tipoTarjeta, numeroTarjeta, CUENTA_ESPECIFICA_TARJETA_CREDITO),
        Click.on(BTN_DETALLE_PRODUCTO));
    actor.remember(
        MODELO_DETALLE_PRODUCTO,
        tarjetaCredito()
            .conFechaVencimiento(LBL_FECHA_VENCIMIENTO_ECARD.resolveFor(actor).getText())
            .conCodigoDeSeguridad(LBL_CVC_ECARD.resolveFor(actor).getText())
            .conFechaProximoPago(LBL_PROXIMO_PAGO_ECARD.resolveFor(actor).getText())
            .conDeudaFechaPesos(LBL_DEUDA_FECHA_PESOS_ECARD.resolveFor(actor).getText())
            .conDeudaFechaDolares(LBL_DEUDA_FECHA_DOLARES_ECARD.resolveFor(actor).getText())
            .conAvanceDisponiblePeso(LBL_DISPO_AVANCE_PESOS_ECARD.resolveFor(actor).getText())
            .conTrm(LBL_TRM_ECARD.resolveFor(actor).getText())
            .conPagoMinimoEnPesos(LBL_PAGO_MINIMO_PESOS_ECARD.resolveFor(actor).getText())
            .conPagoMinimoEnDolares(LBL_PAGO_MINIMO_DOLARES_ECARD.resolveFor(actor).getText())
            .conPagoTotalEnPesos(LBL_PAGO_TOTAL_PESOS_ECARD.resolveFor(actor).getText())
            .conPagoTotalEnDolares(LBL_PAGO_TOTAL_DOLARES_ECARD.resolveFor(actor).getText())
            .build());
  }
}
