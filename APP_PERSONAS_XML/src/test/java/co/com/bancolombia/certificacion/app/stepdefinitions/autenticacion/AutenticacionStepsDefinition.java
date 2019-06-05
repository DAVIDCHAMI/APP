package co.com.bancolombia.certificacion.app.stepdefinitions.autenticacion;


import co.com.bancolombia.certificacion.app.tasks.authentication.AutenticarPorXml;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatosAutenticacion;
import co.com.bancolombia.certificacion.app.tasks.cargadatos.CargarDatosTransaccion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.bancolombia.certificacion.app.questions.factory.FabricaXml.verificaElResultadoDeLaAuntenticacionPorXml;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

/**
 * The type User autenticacion stepdefinitions.
 */
public class AutenticacionStepsDefinition {

    @Before
    public void initialConfiguration() {
        /*
         *OnStage Prepara el escenario antes de llamar a los actores
         *OnlineCast Proporcionar soporte para la gestión de actores
         */
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que (.*) subo los datos para la prueba de autenticacion$")
    public void queYoSuboLosDatosParaLaPrueba(String actor, List<List<String>> datos){
        theActorCalled(actor).wasAbleTo(
                CargarDatosTransaccion.enApp(datos.get(0)),
                CargarDatosAutenticacion.enApp(datos.get(1))
        );
    }


    /**
     * I try to authenticate myself using my credentials.
     *
     * @throws Exception the exception
     */
    @Cuando("Intento autenticarme utilizando mis credenciales$")
    public void intentoAutenticarmeUtilizandoMisCredenciales() {
        theActorInTheSpotlight().attemptsTo(AutenticarPorXml.enApp());
    }

    /**
     * Can use the application.
     *
     * @throws Throwable the throwable
     */
    @Entonces("^Verifico el resultado de autentificacion$")
    public void verificoElResultadoDeAutentificacion(){
        theActorInTheSpotlight().should(
                seeThat(verificaElResultadoDeLaAuntenticacionPorXml(), is(true))
        );
    }



}