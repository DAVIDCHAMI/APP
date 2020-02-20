package co.com.bancolombia.certificacion.app.interactions.comunes;

import net.serenitybdd.core.exceptions.SerenityManagedException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.RegistroBilletera.CHK_TERMINOS_CONDICIONES_BILLETERA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.LNK_COMENZAR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.comunes.GeneralPage.LNK_SALTAR;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoHabilitado;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Saltar implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(elementoVisible(actor, LNK_SALTAR)).andIfSo(
                        Click.on(LNK_SALTAR)
                )
        );
    }

    public static Saltar onBoarding() {
        return instrumented(Saltar.class);
    }
}