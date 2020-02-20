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
<<<<<<< HEAD
        actor.attemptsTo(
                Check.whether(elementoVisible(actor, LNK_SALTAR)).andIfSo(
                        Click.on(LNK_SALTAR)
                )
        );
=======
        /*
        try {
            actor.attemptsTo(
                    Check.whether(elementoVisible(actor, LNK_SALTAR)).andIfSo(
                            Click.on(LNK_SALTAR),
                            Check.whether(elementoVisible(actor, CHK_TERMINOS_CONDICIONES_BILLETERA)).andIfSo(
                                    Click.on(CHK_TERMINOS_CONDICIONES_BILLETERA),
                                    Click.on(LNK_COMENZAR)
                            ).otherwise(
                                    Click.on(LNK_COMENZAR)
                            )
                    )
            );
        }catch(SerenityManagedException e){
            e.printStackTrace();
        }*/
>>>>>>> develop
    }

    public static Saltar onBoarding() {
        return instrumented(Saltar.class);
    }
}