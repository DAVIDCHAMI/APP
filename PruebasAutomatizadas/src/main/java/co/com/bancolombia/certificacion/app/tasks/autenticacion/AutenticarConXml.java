package co.com.bancolombia.certificacion.app.tasks.autenticacion;

import co.com.bancolombia.certificacion.app.interactions.autenticacion.PrepararYEnviar;
import co.com.bancolombia.certificacion.app.models.entitidades.UsuarioActualEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;


/**
 * The type Authenticate task.
 */
public class AutenticarConXml implements Task {
    private List<String> data;

    /**
     * Instantiates a new Authentication task.
     *
     * @param data the data
     */
    public AutenticarConXml(List<String> data) {
        this.data = data;
    }

    /**
     * In app authenticate task.
     *
     * @param data the data
     * @return the authenticate task
     */
    public static AutenticarConXml enAppCon(List<String> data) {
        return instrumented(AutenticarConXml.class, data);
    }

    @Override
    @Step("{0} Log In")
    public <T extends Actor> void performAs(T actor) {
        UsuarioActualEntity.setUsuario(data);

        actor.attemptsTo(
                PrepararYEnviar.autenticacionXml()
        );
    }
}
