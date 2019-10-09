package co.com.bancolombia.certificacion.app.stepdefinitions.administrarfacturas;

import co.com.bancolombia.certificacion.app.tasks.administrarfacturas.AdministrarFactura;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder.factura;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagarFacturasStepDefinition {

    @Cuando("el actor realizar el pago de sus facturas programadas con opcion (.*)$")
    public void elActorPagaSusFacturasProgramadas(String opcion, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionPagarProgramadas(
                opcion,
                factura().conValor(datos)
                        .conEmpresaServicio(datos)
                        .conProducto(datos)
                        .conFechaFactura(datos)
                        .conReferencia(datos)
                        .conFechaVencimiento(datos)
                        .conValorFacturaReferencia(datos)

                )
        );
    }
    @Entonces("^deberia ver el pago de su factura programada$")
    public void deberiaVerHPagoFacturaProgramada() {
        theActorInTheSpotlight().should(
                //   seeThat().orComplainWith()
        );
    }

    @Cuando("el actor realizar el pago de sus facturas inscritas$")
    public void elActorPagaSusFacturasInscritas(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionPagarInscritas(
                factura().conValor(datos)
                        .conEmpresaServicio(datos)
                        .conProducto(datos)
                        .conFechaFactura(datos)
                        .conValorFacturaReferencia(datos)

                )
        );
    }

    @Entonces("^deberia ver el pago de su factura inscrita$")
    public void deberiaVerHPagoFacturaInscrita() {
        theActorInTheSpotlight().should(
                //   seeThat().orComplainWith()
        );
    }
}