package co.com.bancolombia.certificacion.app.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Activar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                
        );
    }

    public static Activar laHuella(){
        return instrumented(Activar.class);
    }
}