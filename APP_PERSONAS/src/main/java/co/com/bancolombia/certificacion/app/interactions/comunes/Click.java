package co.com.bancolombia.certificacion.app.interactions.comunes;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Click implements Interaction {
    private Target target;

    public Click(Target target){
        this.target = target;
    }

    public static Performable clickOnMobileObject(Target target){
        return instrumented(Click.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String platform = ElementFinder.getPlatformCapability();
        actor.attemptsTo(
                Check.whether(("iOS").equalsIgnoreCase(platform)).andIfSo(
                        net.serenitybdd.screenplay.actions.Click.on(target)
                ).otherwise(
                        JavaScriptClick.on(target)
                )
        );
    }
}
