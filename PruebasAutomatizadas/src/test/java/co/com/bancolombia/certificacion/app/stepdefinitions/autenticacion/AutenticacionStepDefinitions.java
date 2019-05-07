package co.com.bancolombia.certificacion.app.stepdefinitions.autenticacion;

import co.com.bancolombia.certificacion.app.tasks.CargarDatos;
import co.com.bancolombia.certificacion.app.tasks.autenticacion.AutenticarConXml;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.bancolombia.certificacion.app.questions.factory.XmlFactory.verificacionResultadoAutenticacionXml;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

/**
 * The type User authentication stepdefinitions.
 */
public class AutenticacionStepDefinitions {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*)que subo los datos de la transaccion$")
    public void queSuboLosDatosDeLaTransaccion(String actor, List<String> data) {
        theActorCalled(actor).wasAbleTo(CargarDatos.transaccionCon(data));
    }

    @Cuando("^trato de autenticarme usando mis credenciales$")
    public void tratoDeAutenticarmeUsandoMisCredenciales(List<String> data) {
        theActorInTheSpotlight().attemptsTo(AutenticarConXml.enAppCon(data));
    }

    @Entonces("^verifico el resultado de la autenticacion$")
    public void verificoElResultadoDeLaAutenticacion() {
        Serenity.recordReportData().withTitle("Reporte Solicitud de autenticacion").andContents(Serenity.sessionVariableCalled("Request"));

        theActorInTheSpotlight().should(
                seeThat(verificacionResultadoAutenticacionXml(), is(true))
        );
        Serenity.recordReportData().withTitle("Report Response Authentication").andContents(Serenity.sessionVariableCalled("Response"));
    }
}