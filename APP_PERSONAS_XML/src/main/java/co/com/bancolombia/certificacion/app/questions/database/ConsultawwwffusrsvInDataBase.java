package co.com.bancolombia.certificacion.app.questions.database;


import co.com.bancolombia.certificacion.app.integration.BackendFacadeRegistration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultawwwffusrsvInDataBase implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return new BackendFacadeRegistration().verifyUserVirtual();
    }
}
