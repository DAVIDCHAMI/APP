package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.tasks.eprepago.DescargarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargarTarjetaVirtualEprepagoStepDefinition {

    @Cuando("^quiere descargar una tarjeta ePrepago activa$")
    public void descargarTarjetaEPrepagoActiva() {
        theActorInTheSpotlight().attemptsTo(
                DescargarEprepago.enLaAppBancolombia()
        );
    }

    @Entonces("^el deberia de ver un mensaje descarga ePrepago exitosa$")
    public void deberiaDeVerMensajeDescargaEPrepagoExitosa() {
    }
}