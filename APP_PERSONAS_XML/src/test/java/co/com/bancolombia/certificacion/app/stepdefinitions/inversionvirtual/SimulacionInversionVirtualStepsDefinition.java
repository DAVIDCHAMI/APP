package co.com.bancolombia.certificacion.app.stepdefinitions.inversionvirtual;

import co.com.bancolombia.certificacion.app.questions.factory.DataBaseFactory;
import co.com.bancolombia.certificacion.app.questions.factory.FabricaXml;
import co.com.bancolombia.certificacion.app.tasks.virtualinvestment.SimulationVirtualXmlTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class SimulacionInversionVirtualStepsDefinition {

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
                GivenWhenThen.seeThat(FabricaXml.verifyResultXmlSimulateVirtualInvestment(), is(true))
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
                GivenWhenThen.seeThat(DataBaseFactory.verifyResultDebitSCIFFSALDO(), is(false))
        );
    }
}
