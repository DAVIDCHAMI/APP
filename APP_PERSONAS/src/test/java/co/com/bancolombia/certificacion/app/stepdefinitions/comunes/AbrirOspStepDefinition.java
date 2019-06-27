package co.com.bancolombia.certificacion.app.stepdefinitions.comunes;

import co.com.bancolombia.certificacion.app.interactions.ElegirBoton;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AbrirOspStepDefinition {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que (.*) quiere probar en los 2 SO$")
    public void queJuanQuiereProbarEnLosSO(String actor) {
        theActorCalled(actor).attemptsTo(
                ElegirBoton.deOsp()
        );
    }

    @Cuando("^El selecciona el boton$")
    public void elSeleccionaElBoton() {
    }

    @Entonces("^El deberia de ver otra ventana$")
    public void elDeberiaDeVerOtraVentana() {
    }

}
