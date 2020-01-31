package co.com.bancolombia.certificacion.app.tasks.consultas.saldos.vistacarrusel;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoriaVistaCarrusel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoPresente;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.OpcionCategoriaSaldosMovimientosEnum.TARJETAS_CREDITO;

public class DeEcard implements Task {
    int iterador = 1;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unTiempo(3000),
                Click.on(BTN_VISTA_CARRUSEL),
                SeleccionarCategoriaVistaCarrusel.deSaldosMovimientos(TARJETAS_CREDITO.getCategoria())
        );
        while (elementoPresente(actor, LBL_DEUDA_PESOS_TC_VISTA_CARRUSEL.of(String.valueOf(iterador)))) {
            actor.attemptsTo(
                    Scroll.to(LBL_DEUDA_PESOS_TC_VISTA_CARRUSEL.of(String.valueOf(iterador)))
            );
            iterador = iterador + 1;
        }
        actor.attemptsTo(
                Click.on(LBL_VER_DETALLE_ECARD_TDC_CARRUSEL)
        );
        actor.remember(MODELO_DETALLE_PRODUCTO,
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
                        .build()
        );
    }
}