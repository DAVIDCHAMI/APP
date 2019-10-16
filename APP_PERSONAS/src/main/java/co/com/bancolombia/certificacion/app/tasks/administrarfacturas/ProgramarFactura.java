package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.interactions.recaudos.SeleccionarOpcionFactura;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.RANGO_FECHAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ProgramarFactura implements Task {
    private Factura factura;

    public ProgramarFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Saltar.onBoarding(),
                SeleccionarOpcionFactura.conInformacion(OPT_PROGRAMAR,factura),
                Click.on(OPT_MIS_PRODUCTOS),
                Click.on(OPT_CUENTA_PRODUCTO.of(factura.getProducto().
                        getTipo(), factura.getProducto().getNumero())),
                Click.on(CHK_FECHA_VENCIMIENTO.of(factura.getPeriodicidad())),
                WaitUntil.the(LST_INTENTOS_PAGO.of(factura.getNumeroIntento()), isEnabled()),
                Click.on(LST_INTENTOS_PAGO.of(factura.getNumeroIntento())),
                Click.on(BTN_CERRAR_NUMERO_INTENTOS));
        if ((RANGO_FECHAS).equalsIgnoreCase(factura.getDuracionProgramacion())) {
            actor.attemptsTo(
                    Click.on(CHK_FECHA_VENCIMIENTO.of(factura.getDuracionProgramacion())),
                    RealizarScroll.hastaPosicionDeTarget(TXT_FECHA_INICIO_FIN),
                    Click.on(TXT_FECHA_INICIO_FIN)
            );
            while (!Verificar.elementoVisible(actor, LBL_MES.of(factura.getMesProgramacion()))) {
                actor.attemptsTo(Click.on(BTN_FLECHA_MES_SIGUIENTE));
            }
            String valorMes = LBL_VALOR_MES.of(factura.getMesProgramacion()).resolveFor(actor).getValue();
            actor.attemptsTo(Click.on(LST_RANGO_FECHA.of(factura.getFechaInicio(), valorMes)),
                    Click.on(LST_RANGO_FECHA.of(factura.getFechaFin(), valorMes)),
                    Click.on(BTN_SELECCIONAR),
                    Click.on(LNK_SIGUIENTE)
        }else {
            actor.attemptsTo(
                    Click.on(CHK_FECHA_VENCIMIENTO.of(factura.getDuracionProgramacion())));
        }
        actor.attemptsTo(
                Click.on(BTN_SIGUIENTE),
                Scroll.to(CHK_ACEPTO_TERMINOS),
                Click.on(CHK_ACEPTO_TERMINOS),
                Click.on(BTN_PROGRAMAR)
        );
    }
}