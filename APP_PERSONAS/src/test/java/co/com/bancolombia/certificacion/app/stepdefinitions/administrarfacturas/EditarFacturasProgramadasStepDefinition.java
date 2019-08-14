package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.exceptions.ModificacionProgramacionException;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarModificacionFacturas;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.AdministrarFactura;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.ProgramarFactura;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.ModificacionProgramacionException.MENSAJE_MODIFICACION;
import static co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder.programarFactura;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarFacturasProgramadasStepDefinition {

    @Cuando("el actor modifica sus facturas programadas por la opcion (.*)$")
    public void elActorModificaSusFacturasProgramadas(List<Map<String, String>> datos, String opcion) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionEditar(
                programarFactura().conValor(datos)
                        .conFechaInicioFin(datos)
                        .conDescripcionFactura(datos)
                        .conProducto(datos)
                        .conFrecuenciaPago(datos)
                        .conPeriodicidad(datos)
                        .conFechaInicioFin(datos),
                opcion
        ));
    }

    @Entonces("debería ver el mensaje de modificación exitosa$")
    public void deberiaVerMensajeModificacionExitosa() {
        theActorInTheSpotlight().should(seeThat(VerificarModificacionFacturas.programadas())
                .orComplainWith(ModificacionProgramacionException.class, MENSAJE_MODIFICACION));
    }
}