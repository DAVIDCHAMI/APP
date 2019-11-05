package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.concurrent.TimeUnit;
import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarAvance implements Task {
    public RealizarAvance(TarjetaCredito dtos){this.ingresarDatos =dtos;}
    private TarjetaCredito ingresarDatos;
    @Override
    public <T extends Actor> void performAs(T actor)
    {
            actor.attemptsTo(Click.on(BTN_REALIZAR_AVANCES),Esperar.unTiempo(10000));
            if(LIST_CREDIT_CARDS.resolveFor(actor).withTimeoutOf(20, TimeUnit.SECONDS).isVisible())
            {
                int cantidad = LIST_CREDIT_CARDS.resolveAllFor(actor).size();
                for (int i = 0; i < cantidad ; i++)
                {
                   if(LIST_CREDIT_CARDS.resolveAllFor(actor).get(i).getText().trim().toUpperCase().contains(ingresarDatos.getNumeroTarjeta().trim().toUpperCase()))
                   {
                       LIST_CREDIT_CARDS.resolveAllFor(actor).get(i).click();
                       break;
                   }
                }
            }
            actor.attemptsTo(Enter.theValue(ingresarDatos.getCodeSecurity()).into(SECURITY_CODE));
            actor.attemptsTo(Click.on(BUTTON_SIGUEINTE));
    }
    public static Performable realizar_avances(TarjetaCreditoBuilder datos) {return instrumented(RealizarAvance.class, datos.build());}
}
