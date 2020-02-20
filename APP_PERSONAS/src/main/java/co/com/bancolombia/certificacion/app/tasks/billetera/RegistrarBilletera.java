package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.interactions.billetera.Aceptar;
import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.BTN_ACTIVAR_BILLETERA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.LBL_TARJETAS_LISTADAS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.RegistroBilletera.BTN_CONTINUAR_BILLETERA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarBilletera implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CONTINUAR_BILLETERA, isVisible()),
                Click.on(BTN_CONTINUAR_BILLETERA),
                Saltar.onBoarding(),
                Aceptar.TerminosCondiciones(),
                WaitUntil.the(LBL_TARJETAS_LISTADAS, isVisible()),
                Click.on(BTN_ACTIVAR_BILLETERA)
        );
    }

    public static Performable enApp(){
        return instrumented(RegistrarBilletera.class);
    }
}