package co.com.bancolombia.tasks.builder;

import co.com.bancolombia.tasks.GetDepositBalanceAfter;
import co.com.bancolombia.tasks.GetDepositBalanceBefore;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * The type Get balance factory.
 */
public class GetBalanceFactory {

    private GetBalanceFactory() {
    }

    /**
     * Deposit before get deposit balance before.
     *
     * @return the get deposit balance before
     */
    public static GetDepositBalanceBefore depositBefore() {
        return instrumented(GetDepositBalanceBefore.class);
    }

    /**
     * Deposit after get deposit balance after.
     *
     * @return the get deposit balance after
     */
    public static GetDepositBalanceAfter depositAfter() {
        return instrumented(GetDepositBalanceAfter.class);
    }

}
