package co.com.bancolombia.certificacion.app.questions.database;

import co.com.bancolombia.certificacion.app.integration.BackendFacadeEprepago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * The type Consult object boolean cabfftarj.
 */
public class ConsultarRegistroEnCABFFTARJ implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacadeEprepago().verifyExistenceEprepago(actor);
    }

}
