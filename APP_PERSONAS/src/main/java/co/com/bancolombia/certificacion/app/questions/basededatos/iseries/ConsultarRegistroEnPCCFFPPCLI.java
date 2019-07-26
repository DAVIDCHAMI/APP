package co.com.bancolombia.certificacion.app.questions.basededatos.iseries;

import co.com.bancolombia.certificacion.app.integration.fachada.Transversales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * The type Consult object boolean pccffppcli.
 */
public class ConsultarRegistroEnPCCFFPPCLI implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return new Transversales().verifyTopesPersonalizadosPCCFFPPCLI();
    }


}
