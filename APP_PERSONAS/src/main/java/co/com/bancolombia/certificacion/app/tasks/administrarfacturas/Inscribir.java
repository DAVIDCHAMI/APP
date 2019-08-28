package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_INSCRIBIR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.InscribirPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_FACTURA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Inscribir implements Task {
    private Factura factura;

    public Inscribir(Factura factura) {
        this.factura = factura;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INCRIBIR_MANUALMENTE),
                Enter.theValue(factura.getConvenio()).into(TXT_EMPRESA_SERVICIO),
                Click.on(TXT_EMPRESA_SERVICIO_POP_UP),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(factura.getDescripcionFactura()).into(TXT_DESCRIPCION),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(factura.getReferencia()).into(TXT_REFERENCIA),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_INSCRIBIR)
        );
        actor.remember(MODELO_FACTURA, factura);
    }

    public static Inscribir facturas(FacturaBuilder factura) {
        return instrumented(Inscribir.class, factura.build());
    }
}
