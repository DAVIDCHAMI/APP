package co.com.bancolombia.certificacion.app.interactions.comunes;

import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RecibirCorreo implements Interaction {

    public static Performable AlertasNotificacioes(){
        return instrumented(RecibirCorreo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (Verificar.elementoVisible(actor, IMG_CORREO_VACIO)){
        }
    }
}
