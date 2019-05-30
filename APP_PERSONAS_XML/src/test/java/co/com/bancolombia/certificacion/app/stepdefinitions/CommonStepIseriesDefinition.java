package co.com.bancolombia.certificacion.app.stepdefinitions;

import co.com.bancolombia.certificacion.app.questions.factory.DataBaseFactory;

import co.com.bancolombia.certificacion.app.tasks.database.iseries.ConsultFilesIseriesTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;

public class CommonStepIseriesDefinition {


    /**
     * Sets the stage.
     */
    @Before
    public void initialConfiguration() {
        /*
         *OnStage Prepara el escenario antes de llamar a los actores
         *OnlineCast Proporcionar soporte para la gestión de actores
         */
        OnStage.setTheStage(new OnlineCast());
    }

    @And("^he performs the prior consultation of the transaction request ePrepago$")
    public void hePerformsThePriorConsultationOfTheTransactionRequestEPrepago() {
        theActorInTheSpotlight().should(
        		GivenWhenThen.seeThat(DataBaseFactory.verifyResultObjectCABFFTARJ(), is(false))
        		); 
    }

    /*
    @And("^he can see the verification in the PCCFFMOVTF and PCCFFLOGTF$")
    public void heCanSeeTheVerificationInThePCCFFMOVTFAndPCCFFLOGTF() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultObjectPCCMOVTFLOGTF(), is(false))
        );
    }
    */
    
    @And("^he can see the verification in the LogCanal-COMFFLGWWW$")
    public void heCanSeeTheVerificationInTheLogCanalCOMFFLGWWW() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyChannelLog(), is(true))
        );
    }

    @And("^I verify the credit of the balance the eprepago card in the TCBFFMAE$")
    public void iVverifyTheCreditOfTheBalanceTheEprepagoCardInTheTCBFFMAE() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultCreditTCBFFMAE(), is(true))
        );
    }

    @And("^I verify the debit of the balance in the SCIFFSALDO$")
    public void iVverifyTheDebitOfTheBalanceInTheSCIFFSALDO() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultDebitSCIFFSALDO(), is(true))
        );
    }
    
    
    @And("^he can see the verification in the PCCFFPPCLI$")
    public void heCanSeeTheVerificationInThePCCFFPPCLI() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultObjectPCCFFPPCLI(), is(true))
        ); 
    }
    
    
    @And("^he can't see the request label$")
    public void heCantSeeTheRequestLabel() {
        theActorInTheSpotlight().should(seeThat(DataBaseFactory.verifyResultObjectCABFFTARJ(), is(true)));
    }

    @And("^he can see the verification the state in the file: CABFFPPMAE$")
    public void heCanSeeTheVerificationTheStateInTheFileCABFFPPMAE() {
        theActorInTheSpotlight().should(seeThat(DataBaseFactory.verifyResultObjectCABFFPPMAE(), is(true)));
    }

    @And("^he can see the verification the movements in the SCIFFMRCMV$")
    public void heCanSeeTheVerificationTheMovementsInTheSCIFFMRCMV() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultObjectSCIFFMRCMV(), is(false))
        );
    }

    @And("^he can see the verification the movements in the CABFFPPAUT$")
    public void heCanSeeTheVerificationTheMovementsInTheCABFFPPAUT() {
        theActorInTheSpotlight().should(
                seeThat(DataBaseFactory.verifyResultObjectCABFFPPAUT(), is(false))
        );
    }

    @And("^I verify the results in the files of back iseries$")
    public void IVerifyTheResultsInTheFilesOfBackIseries(List<String> files) {
        theActorInTheSpotlight().attemptsTo(ConsultFilesIseriesTask.inApp(files));
    }
    
}
