package co.com.bancolombia.certificacion.app.interactions.recaudos;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
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
    private String valorFactura;
    private String fechaFactura;
    private String descripcionFactura;

    public SeleccionarOpcionFactura(Target target, String valorFactura, String fechaFactura, String descripcionFactura) {
        this.target = target;
        this.valorFactura = valorFactura;
        this.fechaFactura = fechaFactura;
        this.descripcionFactura = descripcionFactura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPT_FACTURA.of(
                        valorFactura,
                        fechaFactura,
                        descripcionFactura), isPresent()),
                Click.on(OPT_FACTURA.of(
                        valorFactura,
                        fechaFactura,
                        descripcionFactura)),
                Click.on(target)
        );
    }

    public static SeleccionarOpcionFactura conInformacion(Target target, String valorFactura, String fechaFactura, String descripcionFactura) {
        return instrumented(SeleccionarOpcionFactura.class, target, valorFactura, fechaFactura, descripcionFactura);
    }
}