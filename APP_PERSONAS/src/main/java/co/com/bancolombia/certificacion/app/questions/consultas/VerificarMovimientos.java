package co.com.bancolombia.certificacion.app.questions.consultas;

import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.LISTA_MOVIMIENTOS;

public class VerificarMovimientos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<Movimiento> movimientos = actor.recall(LISTA_MOVIMIENTOS);
         return movimientos != null;
    }

    public static VerificarMovimientos deCuentas() {
        return new VerificarMovimientos();
    }
}