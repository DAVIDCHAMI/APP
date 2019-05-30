package co.com.bancolombia.tasks.transfers;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.interactions.transfers.PrepareAndSubmitTransferBancolombiaXml;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class TransferBancolombiaXmlTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        		PrepareAndSubmitTransferBancolombiaXml.prepareAndSubmitXml()
        );
		
	}
	
    /**
     * In app transfer bancolombia task.
     *
     * @return the transfer bancolombia task
     */
    public static TransferBancolombiaXmlTask inApp() {
        return instrumented(TransferBancolombiaXmlTask.class);
    }

}
