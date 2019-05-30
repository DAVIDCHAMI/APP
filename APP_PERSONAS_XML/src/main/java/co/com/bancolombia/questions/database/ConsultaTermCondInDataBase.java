package co.com.bancolombia.questions.database;

import co.com.bancolombia.integration.BackendFacadeRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultaTermCondInDataBase implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacadeRegistration().verifyTermCond();
    }
}
