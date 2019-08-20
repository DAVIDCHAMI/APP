package co.com.bancolombia.certificacion.app.questions.consultas;

import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_LISTA_MOVIMIENTOS;

public class VerificarProductos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<Movimiento> movimientos = actor.recall(MODELO_LISTA_MOVIMIENTOS);
        return movimientos != null;
    }

    public static VerificarProductos deMoviemientos() {
        return new VerificarProductos();
    }
}