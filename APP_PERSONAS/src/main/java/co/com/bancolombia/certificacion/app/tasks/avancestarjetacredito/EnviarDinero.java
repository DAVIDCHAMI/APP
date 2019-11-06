package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import java.util.concurrent.TimeUnit;
import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnviarDinero implements Task {
    public  EnviarDinero(TarjetaCredito dtos){this.ingresarDatos =dtos;}
    private TarjetaCredito ingresarDatos;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(BTN_TARJETACREDITO));
        if(CONTENEDOR_TARJETAS.resolveFor(actor).withTimeoutOf(20, TimeUnit.SECONDS).isVisible())
        {
            int size=CONTENEDOR_TARJETAS.resolveAllFor(actor).size();
            for (int i = 0; i < size ; i++)
            {
                if(!"".equals(CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText()))
                {
                    if(CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(ingresarDatos.getNumeroTarjeta().toUpperCase().trim()))
                    {
                        CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).click();
                        break;
                    }
                }
            }
        }
        actor.attemptsTo(
                Scroll.to(CODIGO_SEGURIDAD),
                Enter.theValue(ingresarDatos.getCodeSecurity()).into(CODIGO_SEGURIDAD),
                Click.on(BUTTON_SIGUEINTE)
        );
    }
    public static EnviarDinero SeleccionaProductoOrigen(TarjetaCreditoBuilder datosExcel)
    {
        return instrumented(EnviarDinero.class,datosExcel.build());
    }
}
