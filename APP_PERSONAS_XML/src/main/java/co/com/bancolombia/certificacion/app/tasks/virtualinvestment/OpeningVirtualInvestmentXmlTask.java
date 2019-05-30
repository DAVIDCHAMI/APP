package co.com.bancolombia.certificacion.app.tasks.virtualinvestment;

import co.com.bancolombia.certificacion.app.interactions.virtualinvestment.PrepareAndSubmitOpeningVirtualInvestmentXml;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


/**
 * The type Authenticate task.
 */
public class OpeningVirtualInvestmentXmlTask implements Task {

    /**
     * In app authenticate task.
     *
     * @return the authenticate task
     */
    public static OpeningVirtualInvestmentXmlTask inApp() {
        return instrumented(OpeningVirtualInvestmentXmlTask.class);
    }

    @Override
    @Step("{0} Opening Virtual Investment")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PrepareAndSubmitOpeningVirtualInvestmentXml.prepareAndSubmitXml()
        );
    }
}
