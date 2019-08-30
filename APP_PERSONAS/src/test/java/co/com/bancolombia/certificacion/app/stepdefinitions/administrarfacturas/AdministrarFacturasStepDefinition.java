package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.exceptions.EliminacionFacturasException;
import co.com.bancolombia.certificacion.app.exceptions.ModificacionProgramacionException;
import co.com.bancolombia.certificacion.app.exceptions.VerificarInscripcionFactura;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarEliminacionFactura;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarInscripcion;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarModificacionFacturas;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.AdministrarFactura;
import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.Inscribir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.EliminacionFacturasException.MENSAJE_ELIMINACION;
import static co.com.bancolombia.certificacion.app.exceptions.ModificacionProgramacionException.MENSAJE_MODIFICACION;
import static co.com.bancolombia.certificacion.app.exceptions.VerificarInscripcionFactura.INSCRIPCION_FALLIDA;
import static co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder.factura;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdministrarFacturasStepDefinition {

    @Cuando("^el actor programa sus facturas inscritas con información$")
    public void programaSusFacturasInscritasConInformacion(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionProgramar(
                factura()
                        .conValor(datos)
                        .conFechaFactura(datos)
                        .conEmpresaServicio(datos)
                        .conProducto(datos)
                        .conPeriodicidad(datos)
                        .conNumeroIntento(datos)
                        .conFechaInicioFin(datos)
                        .conMesProgramacion(datos)
                        .conDuracionProgramacion(datos)
        ));
    }

    @Cuando("^inscribe una factura$")
    public void inscribirFacura(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                Inscribir.facturas(factura().conConvenio(datos).conDescripcionFactura(datos).conReferencia(datos))
        );
    }

    @Cuando("el actor elimina su factura con opción (.*) e información$")
    public void eliminaSusFacturasInscritas(String opcion, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionELiminar(
                factura().conValor(datos)
                        .conFechaFactura(datos)
                        .conEmpresaServicio(datos),
                opcion
                )
        );
    }

    @Cuando("el actor modifica sus facturas programadas por la opcion (.*)$")
    public void elActorModificaSusFacturasProgramadas(List<Map<String, String>> datos, String opcion) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionEditar(
                factura().conValor(datos)
                        .conFechaInicioFin(datos)
                        .conEmpresaServicio(datos)
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

    @Entonces("debería ver el mensaje de eliminación exitosa$")
    public void mensajeEliminaciónExitosa() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarEliminacionFactura.exitoso()).orComplainWith(EliminacionFacturasException.class, MENSAJE_ELIMINACION));
    }

    @Entonces("^deberia ver el mensaje de confirmación$")
    public void deberiaVisualzoarMensajeEnlace() {
        theActorInTheSpotlight().should(
                seeThat(VerificarInscripcion.factura()).orComplainWith(VerificarInscripcionFactura.class, INSCRIPCION_FALLIDA)
        );
    }
}