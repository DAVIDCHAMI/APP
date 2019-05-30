package co.com.bancolombia.tasks.virtualinvestment;

import co.com.bancolombia.interactions.virtualinvestment.PrepareAndSubmitSimulationVirtualInvestmentXml;
import co.com.bancolombia.models.entities.VirtualInvestmentEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SimulationVirtualXmlTask implements Task {


    private List<String> data;

    /**
     * Instantiates simulation task.
     *
     * @param data the data
     */
    public SimulationVirtualXmlTask(List<String> data) {
        this.data = data;
    }



    /**
     * In app authenticate task.
     *
     * @return the authenticate task
     */


    public static SimulationVirtualXmlTask inApp(List<String> data) {
        return instrumented(SimulationVirtualXmlTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        VirtualInvestmentEntity.setVirtualInvestment(data);
        actor.attemptsTo(
                PrepareAndSubmitSimulationVirtualInvestmentXml.prepareAndSubmitXml());
    }
}
