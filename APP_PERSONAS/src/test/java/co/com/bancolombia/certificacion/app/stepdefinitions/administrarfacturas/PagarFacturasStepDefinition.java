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

    @Cuando("el actor realizar el pago de sus facturas inscritas con opcion (.*)$")
    public void elActorPagaSusFacturasInscritaConOpcion(String opcion, List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.conOpcionPagarVariasInscritas(
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

    @Cuando("el actor realizar el pago de sus factura redeban$")
    public void elActorPagaSusFacturasRedeban(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(AdministrarFactura.pagoRedeban(
                factura().conValor(datos)
                        .conEmpresaServicio(datos)
                        .conProducto(datos)
                        .conFechaFactura(datos)

                )
        );
    }

    @Entonces("^deberia ver el pago de su factura programada$")
    public void deberiaVerHPagoFacturaProgramada() {

    }

    @Entonces("^deberia ver el pago de su factura inscrita$")
    public void deberiaVerHPagoFacturaInscrita() {

    }

}