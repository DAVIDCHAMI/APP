package co.com.bancolombia.questions.database;

import co.com.bancolombia.integration.BackendFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultObjectBooleanDebitSCIFFSALDO implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        boolean result = false;
        result = BackendFacade.verifyTheDebitOfTheBalanceV();
        return result;
    }
}