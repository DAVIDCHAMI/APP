package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AdministrarFactura {

    public static Performable conOpcionProgramar(ProgramarFacturasBuilder programarFacturasBuilder) {
        return instrumented(ProgramarFactura.class, programarFacturasBuilder.build());
    }
}