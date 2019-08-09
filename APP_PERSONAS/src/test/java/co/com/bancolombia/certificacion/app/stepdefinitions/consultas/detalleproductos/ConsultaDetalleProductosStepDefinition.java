package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.detalleproductos;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.DetalleProductoNoEsCorrectoException;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarDetalleProducto;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.ConsultarDetalle;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.DetalleProductoNoEsCorrectoException.MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaDetalleProductosStepDefinition {

    @Y("^consulto en (.*) el detalle de mi Cuenta (.*) numero (.*)$")
    public void consultoElSaldoDeMisCuentasDeposito(String opcionCategoria, String tipoCuenta, String numeroCuenta) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarDetalle.deProducto(opcionCategoria,tipoCuenta, numeroCuenta)
        );
    }

    @Cuando("^consulto en (.*) el detalle de tarjeta (.*) numero (.*)$")
    public void consultoElSaldoDeEprepago(String opcionCategoria, String tipoCuenta, String numeroCuenta) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarDetalle.deProducto(opcionCategoria,tipoCuenta, numeroCuenta)
        );
    }

    @Entonces("^deberia de ver el detalle de mi cuenta de ahorro$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
        theActorInTheSpotlight().should(seeThat(
                VerificarDetalleProducto.esExitoso()
                ).orComplainWith(
                        DetalleProductoNoEsCorrectoException.class, MENSAJE_DETALLE_PRODUCTO_NO_CORRECTO)
        );
    }

    @Entonces("^deberia de ver el detalle de mi tarjeta eprepago$")
    public void verificoElResultadoDeLaConsultaDeEprepago() {
    }
}
