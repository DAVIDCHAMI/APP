package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ProductosDeUsuarioNoSonCorrectosException;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarProductosElegidos;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ProductosDeUsuarioNoSonCorrectosException.MENSAJE_PRODUCTOS_MOSTRADOS_NO_SON_CORRECTOS;
import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaDetalleCuentasDepositoStepDefinition {

    @Cuando("^consulto el detalle de mi Cuenta de Ahorro (.*) numero (.*)$")
    public void consultoElSaldoDeMisCuentasDeposito(String tipoCuenta, String opcionCategoria) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.desdeSaldosMovimientos(tipoCuenta, opcionCategoria)
        );
    }

    @Entonces("^deberia de ver el detalle de mi cuenta de ahorro$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {

    }

}
