package co.com.bancolombia.questions.database.finacle;


import co.com.bancolombia.integration.BackendFacadeFinacle;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The type Channel log in data base.
 */
public class OpeningInvestmentVirtual implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(OpeningInvestmentVirtual.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        BackendFacadeFinacle.consultTitleClientFinacle();
        String dataOracle = Serenity.sessionVariableCalled("dataOracle");
        Boolean resultFinal = false;
        if (dataOracle != ""){
            resultFinal = true;
        }else{
            LOGGER.info("Sin registros en la consulta");
        }
        return resultFinal;

    }

}
