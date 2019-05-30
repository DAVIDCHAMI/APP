package co.com.bancolombia.certificacion.app.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * The type Wait interaction.
 */
public class WaitInteraction implements Interaction {

    private int var;

    /**
     * Instantiates a new Wait interaction.
     *
     * @param var the var
     */
    protected WaitInteraction(int var) {
        this.var = var;
    }

    /**
     * Wait class wait interaction.
     *
     * @param var the var
     * @return the wait interaction
     */
    public static WaitInteraction waitClass(int var) {
        return instrumented(WaitInteraction.class, var);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(var);

    }

}
