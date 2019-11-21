package co.com.bancolombia.certificacion.app.tasks.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarAvancesCuentasInscritasProductoDestino implements Task {
    private String tipoAvance;
    private TarjetaCredito tarjetaCredito;
    private String numeroTarjeta = tarjetaCredito.getNumeroTarjetaDestino();

    public RealizarAvancesCuentasInscritasProductoDestino(TarjetaCredito tarjetaCredito, String tipoAvance){
        this.tipoAvance = tipoAvance;
        this.tarjetaCredito =tarjetaCredito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int cantidadTarjetas;
        if(tipoAvance.equals("envia dinero")){
                    actor.attemptsTo(Click.on(BTN_CUENTAS_INSCRITAS));
            cantidadTarjetas= LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).size();
            for (int i = 0; i < cantidadTarjetas ; i++) {
                if(!"".equals(LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).get(i).getText()) && LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).get(i).getText().toUpperCase().trim().equals(numeroTarjeta.toUpperCase().trim())) {
                        LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).get(i).click();
                        break;
                    }
                }
        } else {
            actor.attemptsTo(Click.on(BTN_CUENTAS_INSCRITAS));
            cantidadTarjetas= LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).size();
            for (int i = 0; i < cantidadTarjetas ; i++) {
                if(!"".equals(LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).get(i).getText()) && LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(numeroTarjeta.toUpperCase().trim())) {
                        LISTADO_TARJETAS_INSCRITAS_AVANCE.resolveAllFor(actor).get(i).click();
                        break;
                    }
                }
        }
        actor.attemptsTo(
                Click.on(BTN_REALIZAR_AVANCE)
        );
    }

    public static RealizarAvancesCuentasInscritasProductoDestino deTarjetasCreditoProductoDestino(TarjetaCreditoBuilder datosExcel, String tipoAvance){
        return instrumented(RealizarAvancesCuentasInscritasProductoDestino.class,datosExcel.build(), tipoAvance);
    }
}
