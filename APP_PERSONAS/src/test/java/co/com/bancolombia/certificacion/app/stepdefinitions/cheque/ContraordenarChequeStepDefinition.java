package co.com.bancolombia.certificacion.app.stepdefinitions.cheque;

import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ContraordenarChequeStepDefinition {

    @Y("el actor contraordena su cheque con tipo cuenta (.*) y numero cuenta (.*)")
    public void contraOrdenarChequeconTipoyNumero(String tipo, String numero){
        theActorInTheSpotlight().attemptsTo();
    }
}