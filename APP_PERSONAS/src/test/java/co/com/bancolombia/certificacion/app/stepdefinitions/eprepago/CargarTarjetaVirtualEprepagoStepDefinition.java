package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.exceptions.eprepago.NoSeRealizoRecargaEprepagoException;
import co.com.bancolombia.certificacion.app.questions.eprepago.RecargaTarjetaEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.CargarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.bancolombia.certificacion.app.exceptions.eprepago.NoSeRealizoRecargaEprepagoException.MENSAJE_RECARGA_EPREPAGO_NO_REALIZADA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CargarTarjetaVirtualEprepagoStepDefinition {

    @Cuando("^quiere cargar una tarjeta ePrepago activa (.*)$")
    public void cargarTarjetaEprepagoActiva(String valorRecarga) {
        theActorInTheSpotlight().attemptsTo(
                CargarEprepago.enLaAppBancolombia(valorRecarga)
        );
    }

    @Entonces("^el deberia de ver un mensaje de carga de tarjeta ePrepago exitosa$")
    public void deberiaVerMensajeCargaTarjetaEprepagoExitosa() {
        theActorInTheSpotlight().should(seeThat(RecargaTarjetaEprepago.exitosa())
                .orComplainWith(NoSeRealizoRecargaEprepagoException.class, MENSAJE_RECARGA_EPREPAGO_NO_REALIZADA));
    }
}