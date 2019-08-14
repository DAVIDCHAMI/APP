package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AdministrarFactura {

    public static Performable conOpcionProgramar(ProgramarFacturasBuilder programarFacturasBuilder) {
        return instrumented(ProgramarFactura.class, programarFacturasBuilder.build());
    }

    public static Performable conOpcionEditar(ProgramarFacturasBuilder programarFacturasBuilder,String opcion) {
        return instrumented(EditarProgramacion.class, programarFacturasBuilder.build(),opcion);
    }

    public static Performable conOpcionELiminar(ProgramarFacturasBuilder programarFacturasBuilder, String opcion) {
        return instrumented(EliminarFactura.class, programarFacturasBuilder.build(),opcion);
    }
}