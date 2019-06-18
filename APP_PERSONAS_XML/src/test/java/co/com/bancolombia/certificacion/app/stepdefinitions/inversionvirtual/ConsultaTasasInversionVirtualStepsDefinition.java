package co.com.bancolombia.certificacion.app.stepdefinitions.inversionvirtual;

import co.com.bancolombia.certificacion.app.questions.fabrica.FabricaLogCanal;
import co.com.bancolombia.certificacion.app.questions.fabrica.FabricaXml;
import co.com.bancolombia.certificacion.app.tasks.inversionvirtual.ConsultarTasasInversionVirtualPorXml;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class ConsultaTasasInversionVirtualStepsDefinition {

    @And("I consult the rates of the Virtual Investment Bancolombia$")
    public void iTriesLoadHisCard() {
        theActorInTheSpotlight().attemptsTo(
                ConsultarTasasInversionVirtualPorXml.inApp()
        );
    }

    @Then("I verify the rates virtual investment result$")
    public void iCanSeeTheConfirmation() {
        Serenity.recordReportData().withTitle("Request consult the rates of the virtual investment").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(FabricaXml.verificaElResultadoDeLaConsultaDeTasasDeInversionVirtualPorXml(), is(true))
        );
    }

    @And("^he can see the verification in the LogCanal-COMFFLGWWW_TRN0322$")
    public void heCanSeeTheVerificationInTheLogCanalCOMFFLGWWW() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(FabricaLogCanal.elLogCanal0322(), is(true))
        );
    }
}
