package co.com.bancolombia.certificacion.app.questions.database;

import co.com.bancolombia.certificacion.app.integration.BackendFacade;
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