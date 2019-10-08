package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.tasks.eprepago.DescargarEprepago;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargarTarjetaVirtualEprepagoStepDefinition {

    @Cuando("^quiere descargar una tarjeta virtual ePrepago activa$")
    public void descargarTarjetaVirtualEPrepagoActiva(List<Map<String, String>> datos) {
        theActorInTheSpotlight().attemptsTo(
                DescargarEprepago.enLaAppBancolombia(datos)
        );
    }

    @Entonces("^el deberia de ver un mensaje descarga ePrepago exitosa$")
    public void deberiaDeVerMensajeDescargaTarjetaVritualEPrepagoExitosa() {
    }
}