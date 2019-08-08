package co.com.bancolombia.certificacion.app.stepdefinitions.ayuda;

import co.com.bancolombia.certificacion.app.exceptions.PantallaSinDespleglegar;
import co.com.bancolombia.certificacion.app.questions.ayuda.Despliege;
import co.com.bancolombia.certificacion.app.questions.ayuda.Visualizar;
import co.com.bancolombia.certificacion.app.tasks.ayuda.Acceder;
import co.com.bancolombia.certificacion.app.tasks.ayuda.RecorrerConoceNuestra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.bancolombia.certificacion.app.exceptions.PantallaSinDespleglegar.NO_PRESENTA_MENSAJE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AyudaStepDefinition {

    @Cuando("^quiere ingresar a la opción (.*)$")
    public void quiereIngresarOpcion(String opcionAyuda) {
        theActorInTheSpotlight().attemptsTo(
                Acceder.menu(opcionAyuda)
        );
    }

    @Y("^revisa avanza en onbording$")
    public void avanzaronboarding() {
        theActorInTheSpotlight().attemptsTo(
                RecorrerConoceNuestra.app()
        );
    }

    @Entonces("^deberia de ver la pantalla (.*)$")
    public void deberiaVerMensaje(String mensajePantalla) {
        theActorInTheSpotlight().should(
                seeThat(Despliege.vista(mensajePantalla)).orComplainWith(
                        PantallaSinDespleglegar.class, NO_PRESENTA_MENSAJE)
        );
    }

    @Entonces("^deberia de visualizar el enlace con título (.*)$")
    public void deberiaVisualzoarMensajeEnlace(String tituloPantalla) {
        theActorInTheSpotlight().should(
                seeThat(Visualizar.enlaceWeb(tituloPantalla)).orComplainWith(
                        PantallaSinDespleglegar.class, NO_PRESENTA_MENSAJE)
        );
    }
}
