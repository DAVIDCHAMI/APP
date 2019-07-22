package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaDetalleCuentasDepositoStepDefinition {

    @Cuando("^consulto el detalle de mi Cuenta de Ahorro (.*) numero (.*)$")
    public void consultoElSaldoDeMisCuentasDeposito(String tipoCuenta, String opcionCategoria) {

    }

    @Entonces("^deberia de ver el detalle de mi cuenta de ahorro$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
    }
}
