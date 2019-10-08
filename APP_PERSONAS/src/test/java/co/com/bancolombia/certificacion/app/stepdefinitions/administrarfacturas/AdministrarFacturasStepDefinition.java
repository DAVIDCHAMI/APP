package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.exceptions.EliminacionFacturasException;
import co.com.bancolombia.certificacion.app.exceptions.ModificacionProgramacionException;
import co.com.bancolombia.certificacion.app.exceptions.VerificarInscripcionFactura;
import co.com.bancolombia.certificacion.app.exceptions.recaudos.HistoricoPagoException;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarEliminacionFactura;
import co.com.bancolombia.certificacion.app.questions.administrarfacturas.VerificarHistoricoPago;
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
import static co.com.bancolombia.certificacion.app.exceptions.recaudos.HistoricoPagoException.NO_TIENE_HISTORICO_DE_PAGOS;
import static co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder.factura;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdministrarFacturasStepDefinition {

    @Cuando("^el actor programa sus facturas inscritas con informacion$")
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
                Inscribir.facturas(factura().conConvenio(datos).conDescripcionFactura(datos).conReferencia(datos).conConvenio(datos))
        );
    }

    @Cuando("^el actor ingresa al historico de pagos$")
    public void elActorIngresaHistoricoPagos() {
        theActorInTheSpotlight().attemptsTo( AdministrarFactura.conHistoricoPago());
    }

    @Cuando("el actor elimina su factura con opcion (.*) e informacion$")
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
    public void elActorModificaSusFacturasProgramadas(String opcion,List<Map<String, String>> datos) {
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

    @Cuando("el actor realizar el pago de sus facturas programadas$")
    public void elActorPagaSusFacturasProgramadas(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionPagar(
                factura().conValor(datos)
                        .conFechaInicioFin(datos)
                        .conEmpresaServicio(datos)
                        .conProducto(datos)
                        .conFrecuenciaPago(datos)
                        .conPeriodicidad(datos)
                        .conFechaInicioFin(datos)
        )
        );
    }


    @Entonces("deberia ver el mensaje de modificacion exitosa$")
    public void deberiaVerMensajeModificacionExitosa() {
        theActorInTheSpotlight().should(seeThat(VerificarModificacionFacturas.programadas())
                .orComplainWith(ModificacionProgramacionException.class, MENSAJE_MODIFICACION));
    }

    @Entonces("deberia ver el mensaje de eliminacion exitosa$")
    public void mensajeEliminacionExitosa() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarEliminacionFactura.exitoso()).orComplainWith(EliminacionFacturasException.class, MENSAJE_ELIMINACION));
    }

    @Entonces("^deberia ver el mensaje de confirmacion$")
    public void deberiaVisualzoarMensajeEnlace() {
        theActorInTheSpotlight().should(
                seeThat(VerificarInscripcion.factura()).orComplainWith(VerificarInscripcionFactura.class, INSCRIPCION_FALLIDA)
        );
    }

    @Entonces("^deberia ver el historico de pagos$")
    public void deberiaVerHistoricoPago() {
        theActorInTheSpotlight().should(
                seeThat(VerificarHistoricoPago.enFacturas()).orComplainWith(HistoricoPagoException.class, NO_TIENE_HISTORICO_DE_PAGOS)
        );
    }
}