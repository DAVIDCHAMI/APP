package co.com.bancolombia.stepdefinitions;


import co.com.bancolombia.questions.factory.XmlFactory;
import co.com.bancolombia.tasks.TransactionDataTask;
import co.com.bancolombia.tasks.authentication.AuthenticationXmlTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * The type User authentication stepdefinitions.
 */
public class UserAuthenticationSteps {

    @Before
    public void initialConfiguration() {
        /*
         *OnStage Prepara el escenario antes de llamar a los actores
         *OnlineCast Proporcionar soporte para la gestión de actores
         */
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) Upload the Transaction Data$")
    public void iUploadTheTransactionData(String actor, List<String> data) {
        theActorCalled(actor).wasAbleTo(TransactionDataTask.data(data));
    }

    /**
     * I try to authenticate myself using my credentials.
     *
     * @throws Exception the exception
     */
    @When("I try to authenticate myself using my credentials$")
    public void iTryToAuthenticateMyselfUsingMyCredentials(List<String> data) {
        theActorInTheSpotlight().attemptsTo(AuthenticationXmlTask.inApp(data));
    }
    
    /**
     * Can use the application.
     *
     * @throws Throwable the throwable
     */
    @Then("^I verify the authentication result$")
    public void iVerifyTheAuthenticationResult(){
        Serenity.recordReportData().withTitle("Report Request Authentication").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                seeThat(XmlFactory.verifyResultXmlAunthentication(), is(true))
        );
    }
    
    /**
     * Can use the application.
     *
     * @throws Throwable the throwable
     */
    @And("^I verify the authentication$")
    public void iVerifyTheAuthenticate(){
        Serenity.recordReportData().withTitle("Request Authentication").andContents(Serenity.sessionVariableCalled("Request"));
        theActorInTheSpotlight().should(
                seeThat(XmlFactory.verifyResultXmlAunthentication(), is(true))
        );
    }
}