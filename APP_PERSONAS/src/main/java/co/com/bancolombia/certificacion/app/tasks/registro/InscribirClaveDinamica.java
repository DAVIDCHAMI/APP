package co.com.bancolombia.certificacion.app.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InscribirClaveDinamica implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Enter.theValue().into(TXT_NOMBRE_PERSONALIZADO),
        Click.on(BTN_SIGUIENTE_CLAVE),
        Enter.theValue().into(TXT_CORREO)
);
    }

    public static InscribirClaveDinamica conDatos(List<String> datos) {
    return instrumented(InscribirClaveDinamica.class);
    }

}
