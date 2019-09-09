package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.questions.eprepago.ActivacionEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.ActivarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_ACTIVACION_EPREPAGO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActivarEprepagoStepDefinition {

  //  List<String> listaCamposEprepago = new ArrayList<>();

    @Cuando("^quiero activar una tarjeta (.*)$")
    public void quieroActivarUnaTarjetaEprepago(String opcionCategoria){
        theActorInTheSpotlight().attemptsTo(ActivarEprepago.enLaAppBancolombia(opcionCategoria));
    //    listaCamposEprepago = theActorInTheSpotlight().recall(MODELO_ACTIVACION_EPREPAGO);

    }

    @Entonces("^Debo ver el mensaje de activacion exitosa$")
    public void deboVerElMensajeDeActivacionExitosa(){
        theActorInTheSpotlight().should(seeThat(ActivacionEprepago.esExitosa()));
    }


}
