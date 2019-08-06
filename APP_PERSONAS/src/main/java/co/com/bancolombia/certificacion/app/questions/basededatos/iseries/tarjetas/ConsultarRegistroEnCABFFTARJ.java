package co.com.bancolombia.certificacion.app.questions.basededatos.iseries.tarjetas;

import co.com.bancolombia.certificacion.app.integration.fachada.Eprepago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultarRegistroEnCABFFTARJ implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return new Eprepago().verificoExistenciaDeLaEprepago(actor);
    }

}
