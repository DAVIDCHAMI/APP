package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AdministrarFactura {

    public static Performable conOpcionProgramar(FacturaBuilder programarFacturasBuilder) {
        return instrumented(ProgramarFactura.class, programarFacturasBuilder.build());
    }

    public static Performable conOpcionEditar(FacturaBuilder programarFacturasBuilder, String opcion) {
        return instrumented(EditarProgramacion.class, programarFacturasBuilder.build(), opcion);
    }

    public static Performable conOpcionELiminar(FacturaBuilder programarFacturasBuilder, String opcion) {
        return instrumented(EliminarFactura.class, programarFacturasBuilder.build(), opcion);
    }

    public static Performable conOpcionConsultarDetalleFacturasInscritas(FacturaBuilder programarFacturasBuilder) {
        return instrumented(ConsultarDetalleFacturaInscrita.class, programarFacturasBuilder.build());
    }

    public static Performable conOpcionConsultarDetalleFacturasProgramadas(FacturaBuilder programarFacturasBuilder) {
        return instrumented(ConsultarDetalleFacturaProgramada.class, programarFacturasBuilder.build());
    }

    public static Performable conHistoricoPago() {
        return instrumented(HistoricoPago.class);
    }

    public static Performable conOpcionPagarProgramadas(String opcion, FacturaBuilder opcionFacturaBuilder) {
        return instrumented(PagarFacturaProgramada.class, opcion, opcionFacturaBuilder.build());
    }

    public static Performable conOpcionPagarInscritas( FacturaBuilder opcionFacturaBuilder) {
        return instrumented(PagarFacturaInscrita.class,opcionFacturaBuilder.build());
    }

    private AdministrarFactura() {
    }
}