package co.com.bancolombia.certificacion.app.questions.factory;

import co.com.bancolombia.certificacion.app.questions.database.finacle.VerificoLaAperturaEnFinacle;
import net.serenitybdd.screenplay.Question;

/**
 * The type Data base factory.
 */
public class DataBaseFinacleFactory {

    private DataBaseFinacleFactory() {
    }

    /**
     * Verify channel log question.
     *
     * @return the question
     */
    public static Question<Boolean> verificarLaAperturaDeInversionVirtualEnFinacle() {
        return new VerificoLaAperturaEnFinacle();
    }

}
