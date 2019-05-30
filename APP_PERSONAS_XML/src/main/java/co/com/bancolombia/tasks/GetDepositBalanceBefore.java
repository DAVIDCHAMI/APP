package co.com.bancolombia.tasks;

import co.com.bancolombia.integration.BackendFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * The type Get deposit balance before.
 */
public class GetDepositBalanceBefore implements Task {

    private static final Logger LOGGER = LogManager.getLogger(GetDepositBalanceBefore.class.getName());

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            BackendFacade.balanceDepositBefore();
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
}
