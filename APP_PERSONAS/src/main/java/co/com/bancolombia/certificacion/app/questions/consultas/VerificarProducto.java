package co.com.bancolombia.certificacion.app.questions.consultas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.TEXTO_SIN_MOVIMIENTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_CUENTA;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIPO_CUENTA;

public class VerificarProducto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CUENTA_ESPECIFICA_PRODUCTO.of(actor.recall(TIPO_CUENTA),actor.recall(NUMERO_CUENTA))).viewedBy(actor).asBoolean()
                && Visibility.of(TEXTO_SIN_MOVIMIENTO).viewedBy(actor).asBoolean();
    }

    public static VerificarProducto sinMovimientos() {
        return new VerificarProducto();
    }

}
