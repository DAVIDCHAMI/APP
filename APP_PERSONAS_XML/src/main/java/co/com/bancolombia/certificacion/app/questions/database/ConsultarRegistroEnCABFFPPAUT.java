package co.com.bancolombia.certificacion.app.questions.database;

import co.com.bancolombia.certificacion.app.integration.BackendFacade;
import co.com.bancolombia.certificacion.app.integration.BackendFacadeMovements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class ConsultarRegistroEnCABFFPPAUT implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(BackendFacade.class.getName());



    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        try {
            result = BackendFacadeMovements.verifyTheMovementsEprepago();
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }
}
