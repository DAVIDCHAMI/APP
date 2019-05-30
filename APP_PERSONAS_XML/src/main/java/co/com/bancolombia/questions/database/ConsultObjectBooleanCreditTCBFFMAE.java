package co.com.bancolombia.questions.database;

import co.com.bancolombia.integration.BackendFacadeEprepago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultObjectBooleanCreditTCBFFMAE implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        result = BackendFacadeEprepago.verifyTheCreditOfTheCardEprepago();
        return result;
    }
}
