package co.com.bancolombia.certificacion.app.tasks.billetera;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.IMG_TARJETA_LISTA_ELEGIR;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.ArchivosUtilidades.abrirCodigoQr;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarPago implements Task {

    public static Performable conCodigoQrEstatico(){
        return instrumented(RealizarPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMG_TARJETA_LISTA_ELEGIR)
        );
        abrirCodigoQr("qr_estatico_uno");

    }
}
