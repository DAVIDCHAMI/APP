package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.saldos;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.NoPoseeSoloCuentasDepositoException;
import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.SoloTieneUnProductoException;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.RevisarProductos;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarCuentasDeposito;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.NoPoseeSoloCuentasDepositoException.MENSAJE_NO_TIENE_UNICAMENTE_CUENTAS_DEPOSITO;
import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.SoloTieneUnProductoException.MENSAJE_SOLO_TIENE_UN_PRODUCTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarProductosAsociadosStepDefinition {

    @Entonces("^El deberia de ver unicamente cuentas deposito$")
    public void deberiaVerUnicamenteCuentasDeposito() {
        theActorInTheSpotlight().should(seeThat(
                VerificarCuentasDeposito.comoUnicoProducto()).orComplainWith(
                NoPoseeSoloCuentasDepositoException.class, MENSAJE_NO_TIENE_UNICAMENTE_CUENTAS_DEPOSITO
                )
        );
    }

    @Entonces("^El deberia de ver los productos asoiados a su cuenta$")
    public void deberiaVerProductosAsociadosSuCuenta() {
        theActorInTheSpotlight().should(seeThat(
                RevisarProductos.pertenecientesAlUsuario()).orComplainWith(
                SoloTieneUnProductoException.class, MENSAJE_SOLO_TIENE_UN_PRODUCTO
                )
        );
    }
}
