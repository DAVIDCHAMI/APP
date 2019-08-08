package co.com.bancolombia.certificacion.app.stepdefinitions.ayuda;

import co.com.bancolombia.certificacion.app.questions.ayuda.Despliege;
import co.com.bancolombia.certificacion.app.tasks.ayuda.Acceder;
import co.com.bancolombia.certificacion.app.tasks.ayuda.RecorrerConoceNuestra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AyudaStepDefinition {

    @Cuando("^quiere ingresar a la opción (.*)$")
    public void quiereIngresarOpcion(String opcionAyuda) {
        theActorInTheSpotlight().attemptsTo(
                Acceder.menu(opcionAyuda),
                RecorrerConoceNuestra.app()
        );
    }

    @Entonces("^deberia de ver la pantalla (.*)$")
    public void deberiaVerMensaje(String mensajePantalla) {
        theActorInTheSpotlight().should(
                seeThat(Despliege.vista(mensajePantalla))
        );
    }
}
