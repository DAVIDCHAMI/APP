package co.com.bancolombia.certificacion.app.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CLAVE_DINAMICA_DESDE_CORREO;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.retornarClaveDinamica;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LeerClaveDinamica implements Interaction {

    public static Performable desdeCorreo() {
        return instrumented(LeerClaveDinamica.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RecibirCorreo.AlertasNotificacioes(),
                Click.on(ITEM_CORREO_RECIBIDO),
                WaitUntil.the(TXT_CUERPO_MENSAJE, isVisible())
        );
        String claveDinamicaCorreo = retornarClaveDinamica(TXT_CUERPO_MENSAJE.resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BTN_ELIMINAR_CORREO)
        );
        actor.remember(CLAVE_DINAMICA_DESDE_CORREO, claveDinamicaCorreo);
    }
}
