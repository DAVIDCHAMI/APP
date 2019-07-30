package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.saldos;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.NoPoseeSoloCuentasDepositoException;
import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.SoloTieneUnProductoException;
import co.com.bancolombia.certificacion.app.questions.consultas.VerificarProducto;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.RevisarProductos;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarCuentasDeposito;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.ConsultarProductos;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.GuardarDatos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.NoPoseeSoloCuentasDepositoException.MENSAJE_NO_TIENE_UNICAMENTE_CUENTAS_DEPOSITO;
import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.SoloTieneUnProductoException.MENSAJE_SOLO_TIENE_UN_PRODUCTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarProductosAsociadosStepDefinition {

    @Cuando("quiero revisar mis movimientos con tipo de cuenta (.*) y número cuenta (.*)$")
    public void revisarMisMovimientosEnApp(String tipoCuenta, String numeroCuenta) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarProductos.conInformacion(tipoCuenta, numeroCuenta)
        );
    }

    @Y("el ingresa a sus productos$")
    public void ingresaSusProductos() {
        theActorInTheSpotlight().attemptsTo(
                GuardarDatos.deProductos()
        );
    }

    @Entonces("^El deberia ver unicamente cuentas deposito$")
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

    @Entonces("^El deberia de ver el mensaje No has realizado ningún movimiento con la tarjeta.$")
    public void deberiaVerLosMovimientosNingunMovimientoConLaTarjeta() {
        theActorInTheSpotlight().should(seeThat(
                VerificarProducto.sinMovimientos()
                )
        );
    }
}
