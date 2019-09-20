package co.com.bancolombia.certificacion.app.stepdefinitions.cheque;

import co.com.bancolombia.certificacion.app.exceptions.cheque.NoRegistraContraordenChequeException;
import co.com.bancolombia.certificacion.app.questions.cheque.VerificarContraorden;
import co.com.bancolombia.certificacion.app.tasks.cheque.ContraordenarCheque;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.exceptions.cheque.NoRegistraContraordenChequeException.NO_INCRIBE_CONTRAORDEN;
import static co.com.bancolombia.certificacion.app.models.builders.ChequeBuilder.cheque;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContraordenarChequeStepDefinition {

    @Y("el actor contraordena su cheque con informacion")
    public void contraOrdenarChequeconTipoyNumero(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(ContraordenarCheque.conInfo(
                cheque()
                        .contipoCuenta(datos)
                        .conTipoCheque(datos)
                        .conNumeroCheque(datos)
                )
        );
    }

    @Entonces("El deberia ver contraordenación de su cheque exitoso")
    public void deberiaVerContraodenarCheque() {
        theActorInTheSpotlight().should(seeThat(VerificarContraorden.deCheque()).orComplainWith(NoRegistraContraordenChequeException.class,NO_INCRIBE_CONTRAORDEN));
    }
}