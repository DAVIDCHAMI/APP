package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;

import static co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder.tarjetaCredito;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;
import static co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.EnviarDinero.medianteOpcionEnviarDinero;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvance.*;

public class AvancesTarjetasCreditoStepDefinition
{

    @Cuando("^selecciona la tarjeta de credito$")
    public void seleccionaLaTarjetaDeCredito(List<Map<String, String>> datos)
    {
       // theActorInTheSpotlight().attemptsTo((realizar_avances(AvancesTarjetaCreditoBuilder.con(datos))));
        theActorInTheSpotlight().attemptsTo(realizar_avances(tarjetaCredito().conDatosDeTarjeta(datos)));
    }

    @Y("^ingresa a la opcion tarjeta de credito$")
    public void ingresaALaOpcionTarjetaDeCredito(List<Map<String, String>> datos)
    {
        //theActorInTheSpotlight().attemptsTo(medianteOpcionEnviarDinero(AvancesTarjetaCreditoBuilder.con(arg2)));
        theActorInTheSpotlight().attemptsTo(medianteOpcionEnviarDinero(tarjetaCredito().conDatosDeTarjeta(datos)));
    }
}
