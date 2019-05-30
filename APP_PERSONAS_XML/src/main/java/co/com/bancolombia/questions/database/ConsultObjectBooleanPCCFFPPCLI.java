package co.com.bancolombia.questions.database;

import co.com.bancolombia.integration.BackendFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * The type Consult object boolean pccffppcli.
 */
public class ConsultObjectBooleanPCCFFPPCLI implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacade().verifyTopesPersonalizadosPCCFFPPCLI();
    }


}
