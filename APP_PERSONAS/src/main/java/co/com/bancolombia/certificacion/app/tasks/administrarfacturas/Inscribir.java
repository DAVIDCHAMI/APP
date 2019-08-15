package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

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
                Click.on(TXT_EMPRESA_SERVICIO),
                Escribir.enCampoTexto(factura.getConvenio()),
                Click.on(TXT_EMPRESA_SERVICIO_POP_UP),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_DESCRIPCION),
                Escribir.enCampoTexto(factura.getEmpresaServicio()),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_REFERENCIA),
                Escribir.enCampoTexto(factura.getReferencia()),
                Click.on(LNK_SIGUIENTE),
                Click.on(LNK_INSCRIBIR)
        );
        actor.remember(MODELO_FACTURA, factura);
    }

    public static Inscribir facturas(FacturaBuilder factura) {
        return instrumented(Inscribir.class, factura.build());
    }
}
