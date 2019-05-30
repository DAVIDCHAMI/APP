package co.com.bancolombia.stepdefinitions;

import co.com.bancolombia.questions.factory.ChannelLogFactory;
import co.com.bancolombia.questions.factory.XmlFactory;
import co.com.bancolombia.tasks.virtualinvestment.ConsultTheRatesVirtualInvestmentXmlTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class ConsultTheRatesVirtualInvestmentStepsDefinition {

    @And("I consult the rates of the Virtual Investment Bancolombia$")
    public void iTriesLoadHisCard() {
        theActorInTheSpotlight().attemptsTo(
                ConsultTheRatesVirtualInvestmentXmlTask.inApp()
        );
    }

    @Then("I verify the rates virtual investment result$")
    public void iCanSeeTheConfirmation() {
        Serenity.recordReportData().withTitle("Request consult the rates of the virtual investment").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                seeThat(XmlFactory.verifyResultXmlConsultTheRatesVirtualInvestment(), is(true))
        );
    }

    @And("^he can see the verification in the LogCanal-COMFFLGWWW_TRN0322$")
    public void heCanSeeTheVerificationInTheLogCanalCOMFFLGWWW() {
        theActorInTheSpotlight().should(
                seeThat(ChannelLogFactory.theChannelLog0322(), is(true))
        );
    }
}
