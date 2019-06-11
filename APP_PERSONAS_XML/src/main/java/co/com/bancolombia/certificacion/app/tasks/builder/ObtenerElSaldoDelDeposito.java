package co.com.bancolombia.certificacion.app.tasks.builder;

import co.com.bancolombia.certificacion.app.tasks.ObtenerSaldoDelDepositoDespues;
import co.com.bancolombia.certificacion.app.tasks.ObtenerSaldoDelDepositoAntes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * The type Get balance factory.
 */
public class ObtenerElSaldoDelDeposito {

    private ObtenerElSaldoDelDeposito() {
    }

    /**
     * Deposit before get deposit balance before.
     *
     * @return the get deposit balance before
     */
    public static ObtenerSaldoDelDepositoAntes depositoAntes() {
        return instrumented(ObtenerSaldoDelDepositoAntes.class);
    }

    /**
     * Deposit after get deposit balance after.
     *
     * @return the get deposit balance after
     */
    public static ObtenerSaldoDelDepositoDespues depositoDespues() {
        return instrumented(ObtenerSaldoDelDepositoDespues.class);
    }

}
