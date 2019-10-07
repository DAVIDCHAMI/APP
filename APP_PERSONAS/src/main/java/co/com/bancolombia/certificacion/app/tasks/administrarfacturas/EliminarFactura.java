package co.com.bancolombia.certificacion.app.tasks.administrarfacturas;

import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.interactions.recaudos.SeleccionarOpcionFactura;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.INSCRITAS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.SERVICIO;

public class EliminarFactura implements Task {
    private Factura programarFacturas;
    private String opcion;

    public EliminarFactura(Factura programarFacturas, String opcion) {
        this.programarFacturas = programarFacturas;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Saltar.onBoarding(),
                Check.whether(INSCRITAS.equals(opcion.toUpperCase()))
                        .andIfSo(
                                SeleccionarOpcionFactura.conInformacion(OPT_VER_DETALLE_FACTURA, programarFacturas)
                        ),
                RealizarScroll.hastaPosicionDeTarget(OPT_ELIMINAR_FACTURA),
                Click.on(OPT_ELIMINAR_FACTURA),
                Click.on(BTN_CONFIRMAR_ELIMINACION)
        );
        actor.remember(SERVICIO, programarFacturas.getEmpresaServicio());
    }
}