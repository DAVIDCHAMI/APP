package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarAvancesProductoDestino implements Task {
    private String tipoAvance;
    private TarjetaCredito tarjetaCredito;

    public RealizarAvancesProductoDestino(TarjetaCredito tarjetaCredito, String tipoAvance) {
        this.tipoAvance = tipoAvance;
        this.tarjetaCredito = tarjetaCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int cantidadTarjetas;
        String nombreTarjeta;
        if("envia dinero".equals(tipoAvance)){
            actor.attemptsTo(
                    Click.on(BTN_MIS_PRODUCTOS));
            nombreTarjeta = tarjetaCredito.getNumeroTarjetaDestino();
            cantidadTarjetas= LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).size();
            for (int i = 0; i < cantidadTarjetas ; i++) {
                if(!"".equals(LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).get(i).getText()) && LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(nombreTarjeta.toUpperCase().trim())) {
                        LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).get(i).click();
                        break;
                    }
                }
        } else {
            actor.attemptsTo(Click.on(BTN_REALIZAR_AVANCES));
            cantidadTarjetas= LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).size();
            for (int i = 0; i < cantidadTarjetas ; i++) {
                if(!"".equals(LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).get(i).getText()) && LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(tarjetaCredito.getNumeroTarjeta().toUpperCase().trim())) {
                        LISTADO_TARJETAS_DESTINO_AVANCE.resolveAllFor(actor).get(i).click();
                        break;
                }
            }
        }
        actor.attemptsTo(
            Click.on(BTN_REALIZAR_AVANCE)
        );
    }

    public static RealizarAvancesProductoDestino deTarjetasCreditoProductoDestino(TarjetaCreditoBuilder datosExcel, String tipoAvance){
        return instrumented(RealizarAvancesProductoDestino.class,datosExcel.build(), tipoAvance);
    }
}