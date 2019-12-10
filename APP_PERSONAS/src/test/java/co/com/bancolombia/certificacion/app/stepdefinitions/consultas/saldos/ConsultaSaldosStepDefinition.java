package co.com.bancolombia.certificacion.app.stepdefinitions.consultas.saldos;

import co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ProductosDeUsuarioNoSonCorrectosException;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoriaVistaCarrusel;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductosVistaCarrusel;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarProductos;
import co.com.bancolombia.certificacion.app.questions.consultas.saldos.VerificarProductosElegidos;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarProductos;
import co.com.bancolombia.certificacion.app.tasks.consultas.saldos.RevisarSaldos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.bancolombia.certificacion.app.exceptions.consultas.saldos.ProductosDeUsuarioNoSonCorrectosException.MENSAJE_PRODUCTOS_MOSTRADOS_NO_SON_CORRECTOS;
import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultaSaldosStepDefinition {

    @Cuando("^consulto el saldo de mis (.*)$")
    public void consultoElSaldoDeMisCuentasDeposito(String opcionCategoria, List<String> cuenta) {
        theActorInTheSpotlight().attemptsTo(
                RevisarProductos.enSaldosMovimientos(elProducto()
                        .conTipoCuenta(cuenta)
                        .conNumero(cuenta), opcionCategoria)
        );
    }

    @Cuando("^consulto desde la vista carrusel el saldo de mis (.*) deposito$")
    public void consultoDesdeVistaCarruselElSaldoDeMisCuentasDeposito(String opcionCategoria) {
        theActorInTheSpotlight().attemptsTo(
                RevisarProductosVistaCarrusel.deCuentasDeposito(opcionCategoria)
        );
    }

    @Cuando("^consulto el saldo de las (.*) desde la vista carrusel$")
    public void consultoDesdeVistaCarruselElSaldoDeMisTC(String opcionCategoria) {
        theActorInTheSpotlight().attemptsTo(
                RevisarProductosVistaCarrusel.DeTarjetasCredito(opcionCategoria)
        );
    }

    @Cuando("^consulto el saldo de mi producto (.*)$")
    public void consultoElSaldoDeMiCrediagil(String opcionCategoria) {
        theActorInTheSpotlight().attemptsTo(
                RevisarSaldos.deCrediagil(opcionCategoria)
        );
    }

    @Entonces("^Verifico el resultado de la consulta del saldo$")
    public void verificoElResultadoDeLaConsultaDelSaldo() {
        theActorInTheSpotlight().should(seeThat(VerificarProductosElegidos.pertenecenAlUsuario())
                .orComplainWith(ProductosDeUsuarioNoSonCorrectosException.class, MENSAJE_PRODUCTOS_MOSTRADOS_NO_SON_CORRECTOS));
    }

    @Entonces("^Verifico el resultado de la consulta del saldo desde vista carrusel (.*)$")
    public void verificoElResultadoDeLaConsultaDelSaldoDesdeVistaCarrusel(String numeroProductos) {
        theActorInTheSpotlight().should(seeThat(VerificarProductos.desdeVistaCarrusel(numeroProductos))
                .orComplainWith(ProductosDeUsuarioNoSonCorrectosException.class, MENSAJE_PRODUCTOS_MOSTRADOS_NO_SON_CORRECTOS));
    }
}