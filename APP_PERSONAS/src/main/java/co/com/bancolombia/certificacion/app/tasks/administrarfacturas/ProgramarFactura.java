package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.interactions.recaudos.SeleccionarOpcionFactura;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.RANGO_FECHAS;

public class ProgramarFactura implements Task {
    private Factura factura;

    public ProgramarFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String fecha[] = factura.getFechaInicioFin().split("-");
        String fechaInicio = fecha[0];
        String fechaFin = fecha[1];
        actor.attemptsTo(
                Saltar.onBoarding(),
                SeleccionarOpcionFactura.conInformacion(OPT_PROGRAMAR,factura),
                Click.on(OPT_MIS_PRODUCTOS),
                Click.on(OPT_CUENTA_PRODUCTO.of(factura.getProducto().
                        getTipo(), factura.getProducto().getNumero())),
                Click.on(CHK_FECHA_VENCIMIENTO.of(factura.getPeriodicidad())),
                Click.on(LST_NUMERO_INTENTOS),
                Click.on(LST_INTENTOS_PAGO.of(factura.getNumeroIntento())));
        if ((RANGO_FECHAS).equalsIgnoreCase(factura.getDuracionProgramacion())) {
            actor.attemptsTo(
                    Click.on(CHK_FECHA_VENCIMIENTO.of(factura.getDuracionProgramacion())),
                    Click.on(TXT_FECHA_INICIO_FIN)
            );
            while (!Visibility.of(LBL_MES.of(factura.getMesProgramacion())).viewedBy(actor).asBoolean()) {
                actor.attemptsTo(Click.on(BTN_FLECHA_MES_SIGUIENTE));
            }
            String valorMes = LBL_VALOR_MES.of(factura.getMesProgramacion()).resolveFor(actor).getValue();
            actor.attemptsTo(Click.on(LST_RANGO_FECHA.of(fechaInicio, valorMes)),
                    Click.on(LST_RANGO_FECHA.of(fechaFin, valorMes)),
                    Click.on(BTN_SELECCIONAR));
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