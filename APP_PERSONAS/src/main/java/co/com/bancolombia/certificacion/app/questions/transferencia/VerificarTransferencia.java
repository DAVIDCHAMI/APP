package co.com.bancolombia.certificacion.app.questions.transferencia;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.transferencia.TransferenciaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;

public class VerificarTransferencia implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String tipoOrigen = actor.recall(TIPO_ORIGEN_VERIFICACION);
        String cuentaOrigen = actor.recall(CUENTA_ORIGEN_VERIFICACION);
        String tipoDestino = actor.recall(TIPO_DESTINO_VERIFICACION);
        String cuentaDestino = actor.recall(CUENTA_DESTINO_VERIFICACION);
        System.out.println("tipoORGIGEN"+tipoOrigen +"tipoDes"+tipoDestino+"cuentaOrg"+cuentaOrigen+"cuentaDestin"+cuentaDestino);
        return Visibility.of(LBL_TRANFERENCIA_EXITOSA).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_CUENTA_ORIGEN.of(tipoOrigen, cuentaOrigen)).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_CUENTA_DESTINO.of(tipoDestino, cuentaDestino)).viewedBy(actor).asBoolean();
    }

    public static VerificarTransferencia exitosa() {
        return new VerificarTransferencia();
    }
}
