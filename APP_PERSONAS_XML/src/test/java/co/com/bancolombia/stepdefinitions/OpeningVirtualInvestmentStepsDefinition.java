package co.com.bancolombia.stepdefinitions;

import co.com.bancolombia.models.entities.CurrentTermsAndConditionsEntity;
import co.com.bancolombia.models.entities.CurrentTransferEntity;
import co.com.bancolombia.models.entities.VirtualInvestmentEntity;
import co.com.bancolombia.models.nousar.CreateDepositEntity;
import co.com.bancolombia.models.nousar.CreateTermsAndConditionsEntity;
import co.com.bancolombia.questions.factory.ChannelLogFactory;
import co.com.bancolombia.questions.factory.DataBaseFactory;
import co.com.bancolombia.questions.factory.DataBaseFinacleFactory;
import co.com.bancolombia.questions.factory.XmlFactory;
import co.com.bancolombia.tasks.builder.GetBalanceFactory;
import co.com.bancolombia.tasks.virtualinvestment.OpeningVirtualInvestmentXmlTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class OpeningVirtualInvestmentStepsDefinition {



    @And("I opening the Virtual Investment Bancolombia$")
    public void iTriesLoadHisCard() {
        theActorInTheSpotlight().attemptsTo(
                OpeningVirtualInvestmentXmlTask.inApp()
        );
    }

    @Then("I verify opening the virtual investment result$")
    public void iCanSeeTheConfirmation() {
        Serenity.recordReportData().withTitle("Request opening virtual investment").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                seeThat(XmlFactory.verifyResultXmlOpeningVirtualInvestment(), is(true)),
                seeThat(DataBaseFinacleFactory.verifyOpeningVirtualInvestmentInFinacle(), is(true))
        );
    }

    @And("^he can see the verification in the LogCanal-COMFFLGWWW_TRN0326$")
    public void heCanSeeTheVerificationInTheLogCanalCOMFFLGWWW() {
        theActorInTheSpotlight().should(
                seeThat(ChannelLogFactory.theChannelLog0326(), is(true))
        );
    }

    @And("^Previous consultations opening the virtual investment$")
    public void previousConsultationsOpeningVirtualInvestment(List<String> data) {
        CreateDepositEntity.setDepositValues(data);
        theActorInTheSpotlight().attemptsTo(
                GetBalanceFactory.depositBefore()
        );
    }

    @And("^Subsequent consultations opening the virtual investment$")
    public void subsequentConsultationsOpeningVirtualInvestment() {
        theActorInTheSpotlight().attemptsTo(
                GetBalanceFactory.depositAfter()
        );
    }

    @And("^I accept terms and conditions virtual investment$")
    public void iAcceptTermsAndConditions(List<String> versionTyC) {
        CurrentTermsAndConditionsEntity.setTermsAndConditions(versionTyC);
    }

    @And("^I know the range and the annual effective rate virtual investment$")
    public void iKnowTheRangeAndTheAnnualEffectiveRate(List<String> periodicityAndRate) {
        VirtualInvestmentEntity.setVirtualInvestment(periodicityAndRate);
    }

    @And("^I verify the results of the consultations to the back iseries TRN0326$")
    public void iVerifyTheResultsOfTheConsultationsToTheBackIseries() {
        theActorInTheSpotlight().should(
                seeThat(ChannelLogFactory.theChannelLog0326(), is(true))
        );
    }

}
