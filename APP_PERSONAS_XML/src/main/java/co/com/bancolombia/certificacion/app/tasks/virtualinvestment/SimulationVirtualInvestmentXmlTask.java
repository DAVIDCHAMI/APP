package co.com.bancolombia.certificacion.app.tasks.virtualinvestment;

import co.com.bancolombia.certificacion.app.interactions.virtualinvestment.PrepararYenviarConsultaTasasInversionVirtualXml;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


/**
 * The type Authenticate task.
 */
public class SimulationVirtualInvestmentXmlTask implements Task {

    /**
     * In app authenticate task.
     *
     * @return the authenticate task
     */
    public static SimulationVirtualInvestmentXmlTask inApp() {
        return instrumented(SimulationVirtualInvestmentXmlTask.class);
    }

    @Override
    @Step("{0} Consult the rates")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PrepararYenviarConsultaTasasInversionVirtualXml.prepararYenviarXml()
        );
    }
}
