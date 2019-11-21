package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarAvances implements Task {
    private String tipoAvance;
    private TarjetaCredito tarjetaCredito;
    private String numeroTarjeta= tarjetaCredito.getNumeroTarjeta();

    public RealizarAvances(TarjetaCredito tarjetaCredito, String tipoAvance){
        this.tipoAvance = tipoAvance;
        this.tarjetaCredito =tarjetaCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int cantidadTarjetas;
            if("envia dinero".equals(tipoAvance)){
                actor.attemptsTo(Click.on(BTN_TARJETA_CREDITO));
                cantidadTarjetas= LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).size();
                for (int i = 0; i < cantidadTarjetas ; i++) {
                    if(!"".equals(LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText()) && LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText().toUpperCase().trim().equals(numeroTarjeta.toUpperCase().trim())) {
                            LST_CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).click();
                            break;
                        }
                    }
            } else {
                actor.attemptsTo(Click.on(BTN_REALIZAR_AVANCES));
                cantidadTarjetas= LISTADO_TARJETAS_CREDITO.resolveAllFor(actor).size();
                for (int i = 0; i < cantidadTarjetas ; i++) {
                    if(!"".equals(LISTADO_TARJETAS_CREDITO.resolveAllFor(actor).get(i).getText()) && LISTADO_TARJETAS_CREDITO.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(tarjetaCredito.getNumeroTarjeta().toUpperCase().trim())) {
                            LISTADO_TARJETAS_CREDITO.resolveAllFor(actor).get(i).click();
                            break;
                    }
                }
            }
        actor.attemptsTo(
                Enter.theValue(tarjetaCredito.getCodigoSeguridad()).into(TXT_CODIGO_SEGURIDAD),
                Click.on(BTN_SIGUIENTE),
                Enter.theValue(tarjetaCredito.getMontoAvance()).into(TXT_MONTO_AVANCE),
                Click.on(BOTON_SIGUIENTE_AVANCE)
        );
    }

    public static RealizarAvances deTarjetasCredito(TarjetaCreditoBuilder datosExcel, String tipoAvance){
        return instrumented(RealizarAvances.class,datosExcel.build(), tipoAvance);
    }
}