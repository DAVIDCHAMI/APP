package co.com.bancolombia.certificacion.app.questions.database.channellog;

import co.com.bancolombia.certificacion.app.integration.BackendFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * The type Channel log in data base.
 */
public class ChannelLogInDataBase implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacade().verifyChannelLog();
    }
}
