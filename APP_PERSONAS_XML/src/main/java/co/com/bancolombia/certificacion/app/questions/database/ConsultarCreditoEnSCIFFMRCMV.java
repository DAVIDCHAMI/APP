package co.com.bancolombia.certificacion.app.questions.database;

import co.com.bancolombia.certificacion.app.integration.BackendFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class ConsultarCreditoEnSCIFFMRCMV implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ConsultarCreditoEnSCIFFMRCMV.class.getName());

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado = false;
        String registro = BackendFacade.verificarElMovimientoCreditoDeLaCuenta();
        if (registro != ""){
            resultado = true;
        }else {
            LOGGER.info("Sin registros en la consulta");
        }
        return resultado;
    }
}
