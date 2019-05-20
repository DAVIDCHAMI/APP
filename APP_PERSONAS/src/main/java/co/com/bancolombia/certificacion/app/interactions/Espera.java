package co.com.bancolombia.certificacion.app.interactions;


import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Espera implements Interaction {


    private int tiempo;

    /**
     * Instantiates a new Wait interaction.
     *
     * @param tiempo the tiempo
     */
    protected Espera(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * Wait class wait interaction.
     *
     * @param tiempo the tiempo
     * @return the wait interaction
     */
    public static Espera unTiempo(int tiempo) {
        return instrumented(Espera.class, tiempo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(tiempo);
    }
}
