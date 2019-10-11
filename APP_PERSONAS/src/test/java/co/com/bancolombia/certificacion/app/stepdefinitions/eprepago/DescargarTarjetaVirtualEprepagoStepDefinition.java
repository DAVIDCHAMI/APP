package co.com.bancolombia.certificacion.app.stepdefinitions.eprepago;

import co.com.bancolombia.certificacion.app.questions.eprepago.DescargaTarjetaVirtuaEprepago;
import co.com.bancolombia.certificacion.app.tasks.eprepago.DescargarSaldo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargarTarjetaVirtualEprepagoStepDefinition {

    @Cuando("^quiere descargar el valor total de una tarjeta virtual (.*) activa$")
    public void descargarTarjetaVirtualEPrepagoActiva(String eprepago, List<Map<String, String>>productoDestino) {
        theActorInTheSpotlight().attemptsTo(
                DescargarSaldo.totalDeLaTarjetaCon(elProducto().conProductoDebitar(productoDestino), eprepago)
        );
    }

    @Entonces("^el deberia de ver un mensaje descarga ePrepago exitosa$")
    public void deberiaVerMensajeDescargaTarjetaVritualEPrepagoExitosa() {
        theActorInTheSpotlight().should(seeThat(DescargaTarjetaVirtuaEprepago.esExitosa()));
    }
}