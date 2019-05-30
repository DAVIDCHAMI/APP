package co.com.bancolombia.questions.database;

import co.com.bancolombia.integration.BackendFacadeEprepago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * The type Consult object boolean cabfftarj.
 */
public class ConsultObjectBooleanCABFFTARJ implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacadeEprepago().verifyExistenceEprepago(actor);
    }

}
