package co.com.bancolombia.stepdefinitions;

import co.com.bancolombia.questions.factory.ChannelLogFactory;
import co.com.bancolombia.questions.factory.DataBaseFactory;
import co.com.bancolombia.questions.factory.XmlFactory;
import co.com.bancolombia.tasks.virtualinvestment.SimulationVirtualXmlTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class SimulationVirtualInvestmentStepsDefinition {

    @And("I simulation the Virtual Investment Bancolombia$")
    public void iSimulationTheVirtualInvestmentBancolombia(List<String> data) {
        theActorInTheSpotlight().attemptsTo(
                SimulationVirtualXmlTask.inApp(data)
        );
    }

    @Then("I verify simulation the virtual investment result$")
    public void iCanSeeTheConfirmation() {
        Serenity.recordReportData().withTitle("Request consult the rates of the virtual investment").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                seeThat(XmlFactory.verifyResultXmlSimulateVirtualInvestment(), is(true))
        );
    }

    @And("^he can see the verification in the LogCanal-COMFFLGWWW_TRN0325$")
    public void heCanSeeTheVerificationInTheLogCanalCOMFFLGWWW() {
        theActorInTheSpotlight().should(
              //  seeThat(ChannelLogFactory.verifyChannelLogTRN0325(), is(true))
        );
    }

    @And("^I verify that the balance in the SCIFFSALDO is not debited$")
    public void iVerifThaTheBalanceInTheSCIFFSALDOIsNotDebited() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultDebitSCIFFSALDO(), is(false))
        );
    }
}
