package co.com.bancolombia.questions.database;


import co.com.bancolombia.integration.BackendFacadeRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultawwwffusrsvInDataBase implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacadeRegistration().verifyUserVirtual();
    }
}
