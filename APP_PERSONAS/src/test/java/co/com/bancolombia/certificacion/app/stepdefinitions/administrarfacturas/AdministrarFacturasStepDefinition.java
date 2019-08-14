package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.exceptions.VerificarInscripcionFactura;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarInscripcion;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.Inscribir;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.ProgramarFactura;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.VerificarInscripcionFactura.INSCRIPCION_FALLIDA;
import static co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdministrarFacturasStepDefinition {

    @Cuando("^el actor programa sus facturas inscritas con información$")
    public void programaSusFacturasInscritasConInformacion(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(ProgramarFactura.inscritas(
                con()
                        .conValor(datos)
                        .conFechaFactura(datos)
                        .conDescripcionFactura(datos)
                        .conProducto(datos)
                        .conPeriodicidad(datos)
                        .conNumeroIntento(datos)
                        .conFechaInicioFin(datos)
        ));
    }

    @Cuando("^inscribe una factura$")
    public void inscribirFacura(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                Inscribir.facturas(con().conConvenio(datos).conDescripcionFactura(datos).conReferencia(datos))
        );
    }

    @Entonces("^deberia ver el mensaje de confirmación$")
    public void deberiaVisualzoarMensajeEnlace() {
        theActorInTheSpotlight().should(
                seeThat(VerificarInscripcion.factura()).orComplainWith(VerificarInscripcionFactura.class, INSCRIPCION_FALLIDA)
        );
    }
}