package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.SeleccionarOpcionFactura;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.ProgramarFacturas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.INISCRITAS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.SERVICIO;

public class EliminarFactura extends PagarProgramarFactura {
    private ProgramarFacturas programarFacturas;
    private String opcion;

    public EliminarFactura(ProgramarFacturas programarFacturas, String opcion) {
        this.programarFacturas = programarFacturas;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        Check.whether(INISCRITAS.equals(opcion.toUpperCase()))
                        .andIfSo(
                                SeleccionarOpcionFactura.conInformacion(OPT_ELIMINAR_FACTURA, programarFacturas.getValorFactura(), programarFacturas.getFechaFactura(), programarFacturas.getEmpresaServicio())),
                Click.on(BTN_CONFIRMAR_ELIMINACION)
        );

        actor.remember(SERVICIO, programarFacturas.getEmpresaServicio());
    }
}