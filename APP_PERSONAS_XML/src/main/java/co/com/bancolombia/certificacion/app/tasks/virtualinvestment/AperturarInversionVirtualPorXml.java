package co.com.bancolombia.certificacion.app.tasks.virtualinvestment;

import co.com.bancolombia.certificacion.app.interactions.virtualinvestment.PrepararYenviarAperturaInversionVirtualXml;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


/**
 * The type Authenticate task.
 */
public class AperturarInversionVirtualPorXml implements Task {

    /**
     * In app authenticate task.
     *
     * @return the authenticate task
     */
    public static AperturarInversionVirtualPorXml inApp() {
        return instrumented(AperturarInversionVirtualPorXml.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PrepararYenviarAperturaInversionVirtualXml.prepararYenviarXml()
        );
    }
}
