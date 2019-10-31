package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;
import co.com.bancolombia.certificacion.app.models.avancestarjetacredito.AvancesTarjetaCredito;
import co.com.bancolombia.certificacion.app.models.builders.AvancesTarjetaCreditoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import java.util.ArrayList;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static co.com.bancolombia.certificacion.app.questions.avancestarjetacredito.escogertarjeta.poseetarjeta;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnviarDinero implements Task
{
    public static List<String> data = new ArrayList<>();
    private AvancesTarjetaCredito Ingresardatos;
    public  EnviarDinero(AvancesTarjetaCredito dtos){this.Ingresardatos=dtos;}

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(BTN_TARJETACREDITO));

        actor.should(seeThat(poseetarjeta(data)));

        actor.attemptsTo(
                Scroll.to(CODIGO_SEGURIDAD),
                Enter.theValue(Ingresardatos.getCodigoSeguridad()).into(CODIGO_SEGURIDAD),
                Click.on(BUTTON_SIGUEINTE)
        );
    }

    public static EnviarDinero EnviarDinero(List datos, AvancesTarjetaCreditoBuilder datoss)
    {
        data = datos;
        return instrumented(EnviarDinero.class,datoss.build());
    }
}
