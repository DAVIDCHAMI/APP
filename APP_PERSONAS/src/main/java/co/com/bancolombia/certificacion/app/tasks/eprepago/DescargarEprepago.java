package co.com.bancolombia.certificacion.app.tasks.eprepago;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import co.com.bancolombia.certificacion.app.interactions.eprepago.SeleccionarOpcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.CHK_DESCARGA_TOTAL_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.DescargarTarjetaVirtualEprepagoPage.LNK_DESCARGAR_EPREPAGO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.SolicitarEprepagoPage.LBL_EPREPAGO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class DescargarEprepago implements Task {
    private List<Map<String, String>> datos;

    public DescargarEprepago(List<Map<String, String>> datos){this.datos = datos;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCategoria.deSaldosMovimientos(LBL_EPREPAGO.resolveFor(actor).getText()),
                SeleccionarOpcion.deSubmenu(datos.get(0).get("opcionSubmenu")),
                WaitUntil.the(CHK_DESCARGA_TOTAL_EPREPAGO, isEnabled()),
                Click.on(CHK_DESCARGA_TOTAL_EPREPAGO),
                WaitUntil.the(LNK_SIGUIENTE, isEnabled()),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_DESCARGAR_EPREPAGO)
        );
    }

    public static DescargarEprepago enLaAppBancolombia(List<Map<String, String>> datos){
        return instrumented(DescargarEprepago.class, datos);
    }
}