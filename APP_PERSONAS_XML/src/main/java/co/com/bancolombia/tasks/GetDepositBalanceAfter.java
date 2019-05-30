package co.com.bancolombia.tasks;

import co.com.bancolombia.integration.BackendFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The type Get deposit balance after.
 */
public class GetDepositBalanceAfter implements Task {

    private static final Logger LOGGER = LogManager.getLogger(GetDepositBalanceAfter.class.getName());

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            BackendFacade.balanceDepositAfter();
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
}
