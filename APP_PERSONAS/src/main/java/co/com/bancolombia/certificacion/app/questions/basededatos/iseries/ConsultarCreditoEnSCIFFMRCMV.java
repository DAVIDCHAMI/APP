package co.com.bancolombia.certificacion.app.questions.basededatos.iseries;

import co.com.bancolombia.certificacion.app.integration.fachada.Depositos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsultarCreditoEnSCIFFMRCMV implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ConsultarCreditoEnSCIFFMRCMV.class.getName());

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado = false;
        String registro = Depositos.verificarElMovimientoCreditoDeLaCuenta();
        if (registro != ""){
            resultado = true;
        }else {
            LOGGER.info("Sin registros en la consulta");
        }
        return resultado;
    }
}
