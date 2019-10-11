package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.tasks.eprepago.DescargarSaldo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargarTarjetaVirtualEprepagoStepDefinition {

    @Cuando("^quiere descargar el valor total de una tarjeta virtual (.*) activa$")
    public void descargarTarjetaVirtualEPrepagoActiva(String eprepago) {
        theActorInTheSpotlight().attemptsTo(
                DescargarSaldo.totalDeLaTarjeta(eprepago)
        );
    }

    @Entonces("^el deberia de ver un mensaje descarga ePrepago exitosa$")
    public void deberiaDeVerMensajeDescargaTarjetaVritualEPrepagoExitosa() {
    }
}