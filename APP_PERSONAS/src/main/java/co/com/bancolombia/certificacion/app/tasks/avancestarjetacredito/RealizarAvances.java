package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarAvances implements Task {
    private String tipoAvance;
    private TarjetaCredito tarjetaCredito;
    private int cantidadTarjetas;

    public RealizarAvances(TarjetaCredito tarjetaCredito, String tipoAvance){
        this.tipoAvance = tipoAvance;
        this.tarjetaCredito =tarjetaCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            if(tipoAvance.equals("envia dinero")){
                actor.attemptsTo(Click.on(BTN_TARJETA_CREDITO),
                        WaitUntil.the(LST_CONTENEDOR_TARJETAS, isVisible()));
                cantidadTarjetas= LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).size();
                for (int i = 0; i < cantidadTarjetas ; i++)
                {
                    if(!"".equals(LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText()))
                    {
                        if(LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(tarjetaCredito.getNumeroTarjeta().toUpperCase().trim()))
                        {
                            LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).click();
                            break;
                        }
                    }
                }
            }
            else {
                actor.attemptsTo(Click.on(BTN_REALIZAR_AVANCES));
                cantidadTarjetas= LIST_CREDIT_CARDS.resolveAllFor(actor).size();
                for (int i = 0; i < cantidadTarjetas ; i++)
                {
                    if(!"".equals(LIST_CREDIT_CARDS.resolveAllFor(actor).get(i).getText()))
                    {
                        if(LIST_CREDIT_CARDS.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(tarjetaCredito.getNumeroTarjeta().toUpperCase().trim()))
                        {
                            LIST_CREDIT_CARDS.resolveAllFor(actor).get(i).click();
                            break;
                        }
                    }
                }
            }
        actor.attemptsTo(
                Scroll.to(TXT_CODIGO_SEGURIDAD),
                Enter.theValue(tarjetaCredito.getCodigoSeguridad()).into(TXT_CODIGO_SEGURIDAD),
                Click.on(BTN_SIGUIENTE)
        );
    }
    public static RealizarAvances deTarjetasCredito(TarjetaCreditoBuilder datosExcel, String tipoAvance){
        return instrumented(RealizarAvances.class,datosExcel.build(), tipoAvance);
    }
}
