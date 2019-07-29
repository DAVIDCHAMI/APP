package co.com.bancolombia.certificacion.app.questions.consultas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.LISTA_MOVIMIENTOS;

public class VerificarMovimientos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> movimientos = actor.recall(LISTA_MOVIMIENTOS);
        return movimientos != null;
    }

    public static VerificarMovimientos deCuentas() {
        return new VerificarMovimientos();
    }
}