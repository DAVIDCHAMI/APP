package co.com.bancolombia.certificacion.app.questions.basededatos.iseries.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.VerificarCampos.clearReport;

public class ConsultarPertenenciaTarjetasCredito implements Question<Boolean> {

    public ConsultarPertenenciaTarjetasCredito(){}

    @Override
    public Boolean answeredBy(Actor actor) {
        clearReport();
        Boolean resultFinal = false;
    return resultFinal;
    }
}
