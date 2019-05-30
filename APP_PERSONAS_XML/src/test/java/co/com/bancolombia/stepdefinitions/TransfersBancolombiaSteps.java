package co.com.bancolombia.stepdefinitions;


import co.com.bancolombia.models.entities.CurrentTransferEntity;
import co.com.bancolombia.models.nousar.CreateDepositEntity;
import co.com.bancolombia.questions.factory.XmlFactory;
import co.com.bancolombia.tasks.builder.GetBalanceFactory;
import co.com.bancolombia.tasks.transfers.TransferBancolombiaXmlTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;

public class TransfersBancolombiaSteps {
	
    @And("I transfer to Bancolombia Accounts$")
    public void iTriesLoadHisCard() {
        theActorInTheSpotlight().attemptsTo(
        		TransferBancolombiaXmlTask.inApp()
        );
    }
    
    @And("^Previous consultations transfer bancolombia$")
    public void previousConsultationsLoadEprepago(List<String> data) {
        CreateDepositEntity.setDepositValues(data);
        CurrentTransferEntity.setTransfer(data);
        theActorInTheSpotlight().attemptsTo(
                GetBalanceFactory.depositBefore()
        );
    }

    @And("^Subsequent consultations transfer bancolombia$")
    public void subsequentConsultationsLoadEprepago() {
        theActorInTheSpotlight().attemptsTo(
                GetBalanceFactory.depositAfter()
        );
    }

    @Then("^I verify the transfer bancolombia result$")
    public void iCanSeeTheConfirmation() {
        Serenity.recordReportData().withTitle("Request Transfers Bancolombia").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                seeThat(XmlFactory.verifyResultXmlTransfersBancolombia(), is(true))
        );
        Serenity.recordReportData().withTitle("Response Transfers Bancolombia").andContents(Serenity.sessionVariableCalled("Response"));
    }
    
}
