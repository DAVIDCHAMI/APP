package co.com.bancolombia.certificacion.app.stepdefinitions.avancestarjetacredito;
import co.com.bancolombia.certificacion.app.models.builders.AvancesTarjetaCreditoBuilder;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Y;
import java.util.List;
import static co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.EnviarDinero.EnviarDinero;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito.RealizarAvance.*;
public class AvancesTarjetasCreditoStepDefinition
{

    @Cuando("^realizar avace Tarjeta$")
    public void realizarAvaceTarjeta(List<String> arg1)
    {
        theActorInTheSpotlight().attemptsTo((realizar_avances(AvancesTarjetaCreditoBuilder.con(arg1))));
    }

    @Y("^ingresa a la opcion tarjeta de credito$")
    public void ingresaALaOpcionTarjetaDeCredito(List<String> data)
    {
        theActorInTheSpotlight().attemptsTo(EnviarDinero(data,AvancesTarjetaCreditoBuilder.con(data)));
    }
}
