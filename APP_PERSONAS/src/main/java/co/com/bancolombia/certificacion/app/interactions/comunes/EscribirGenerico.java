package co.com.bancolombia.certificacion.app.interactions.comunes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirGenerico implements Interaction
{
    private String Cadena;
    private Target Objetivo;

    public EscribirGenerico(String cadena, Target objetivo)
    {
        this.Cadena= cadena;
        this.Objetivo = objetivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Type.theValue(Cadena).into(Objetivo)
        );
    }

    public static EscribirGenerico EenCampoTexto(String cadena, Target objetivo)
    {
        return instrumented(EscribirGenerico.class,cadena,objetivo);
    }
}
