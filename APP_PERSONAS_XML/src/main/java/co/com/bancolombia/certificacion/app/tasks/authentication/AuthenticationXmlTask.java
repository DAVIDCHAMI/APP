package co.com.bancolombia.certificacion.app.tasks.authentication;

import co.com.bancolombia.certificacion.app.interactions.authentication.PrepareAndSubmitAuthenticationXml;
import co.com.bancolombia.certificacion.app.models.entities.CurrentUserEntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import java.util.List;
import static net.serenitybdd.screenplay.Tasks.instrumented;


/**
 * The type Authenticate task.
 */
public class AuthenticationXmlTask implements Task {
    private List<String> data;

    /**
     * Instantiates a new Authentication task.
     *
     * @param data the data
     */
    public AuthenticationXmlTask(List<String> data) {
        this.data = data;
    }

    /**
     * In app authenticate task.
     *
     * @param data the data
     * @return the authenticate task
     */
    public static AuthenticationXmlTask inApp(List<String> data) {
        return instrumented(AuthenticationXmlTask.class, data);
    }

    @Override
    @Step("{0} Log In")
    public <T extends Actor> void performAs(T actor) {
        CurrentUserEntity.setUser(data);

        actor.attemptsTo(
        		PrepareAndSubmitAuthenticationXml.prepareAndSubmitXml()
        );
    }
}
