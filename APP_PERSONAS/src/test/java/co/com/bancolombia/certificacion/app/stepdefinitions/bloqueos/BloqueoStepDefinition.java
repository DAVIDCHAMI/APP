package co.com.bancolombia.certificacion.app.stepdefinitions.bloqueos;

import co.com.bancolombia.certificacion.app.tasks.bloqueos.Bloquear;
import cucumber.api.java.es.Cuando;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BloqueoStepDefinition {

    @Cuando("^quiere bloquear la tarjeta (.*) con número (.*)$")
    public void bloquearTarjeta(String tipoTarjeta, String numeroTarjeta) {
        theActorInTheSpotlight().attemptsTo(
                Bloquear.tarjeta(elProducto().conTipoCuenta(tipoTarjeta).conNumero(numeroTarjeta))
        );
    }

    @Cuando("^quiere bloquear la clave$")
    public void bloquearClave() {
        theActorInTheSpotlight().attemptsTo(
                Bloquear.clave()
        );
    }

    @Cuando("^quiere bloquear la clave y tarjetas$")
    public void bloquearClaveTarjteas() {
        theActorInTheSpotlight().attemptsTo(
                Bloquear.claveTarjetas()
        );
    }

    @Cuando("^quiere bloquear la clave dinámica$")
    public void bloquearClaveDinamica() {
        theActorInTheSpotlight().attemptsTo(
                Bloquear.claveDinamica()
        );
    }
}
