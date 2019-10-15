package co.com.bancolombia.certificacion.app.stepdefinitions.crediagil;

import co.com.bancolombia.certificacion.app.exceptions.crediagil.DesembolsoNoRealizadoException;
import co.com.bancolombia.certificacion.app.questions.crediagil.DesembolsoCrediagil;
import co.com.bancolombia.certificacion.app.tasks.crediagil.Desembolsar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.crediagil.DesembolsoNoRealizadoException.DESEMBOLSO_NO_REALIZADO;
import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DesembolsoCrediagilStepDefinition {

    @Cuando("^realiza el desembolso de su crediagil por valor (.*) a la cuenta (.*) numero (.*)$")
    public void realizarDesembolsoCrediagil(String valorDesembolso, String tipoCuenta, String numeroCuenta) {
        theActorInTheSpotlight().attemptsTo(
                Desembolsar.crediagil(valorDesembolso, elProducto().conTipoCuenta(tipoCuenta).conNumero(numeroCuenta))
        );
    }

    @Entonces("^deberia de ver el mensaje de desembolso realizado correctamente$")
    public void deberiaVerMensajeDesembolsoCorrecto() {
        theActorInTheSpotlight().should(seeThat(
                DesembolsoCrediagil.exitoso())
                .orComplainWith(DesembolsoNoRealizadoException.class, DESEMBOLSO_NO_REALIZADO));
    }
}
