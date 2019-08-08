package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.ProgramarFactura;
import cucumber.api.java.es.Cuando;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.ProgramarFacturasBuilder.programarFactura;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProgramarFacturasStepDefinition {

    @Cuando("el actor programa sus facturas inscritas con información$")
    public void programaSusFacturasInscritasConInformacion(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(ProgramarFactura.inscritas(
                programarFactura()
                        .conValor(datos)
                        .conFechaFactura(datos)
                        .conDescripcionFactura(datos)
                        .conProducto(datos)
                        .conPeriodicidad(datos)
                        .conNumeroIntento(datos)
                        .conFechaInicioFin(datos)
        ));
    }
}