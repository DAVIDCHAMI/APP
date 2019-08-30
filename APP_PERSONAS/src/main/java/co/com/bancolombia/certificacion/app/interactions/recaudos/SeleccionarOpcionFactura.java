package co.com.bancolombia.certificacion.app.interactions.recaudos;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.OPT_FACTURA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SeleccionarOpcionFactura implements Interaction {
    private Target target;
    private Factura factura;

    public SeleccionarOpcionFactura(Target target, Factura factura) {
        this.target = target;
        this.factura=factura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPT_FACTURA.of(
                        factura.getValorFactura(),
                        factura.getFechaFactura(),
                        factura.getEmpresaServicio()), isPresent()),
                Click.on(OPT_FACTURA.of(
                        factura.getValorFactura(),
                        factura.getFechaFactura(),
                        factura.getEmpresaServicio())),
                Click.on(target)
        );
    }

    public static SeleccionarOpcionFactura conInformacion(Target target, Factura factura) {
        return instrumented(SeleccionarOpcionFactura.class, target,factura);
    }
}