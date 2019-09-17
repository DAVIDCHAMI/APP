package co.com.bancolombia.certificacion.app.questions.cheque;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_CHEQUE;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.NUMERO_CUENTA;

public class VerificarContraorden implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCheque=actor.recall(NUMERO_CHEQUE);
        String numeroCuenta=actor.recall(NUMERO_CUENTA);
        return Visibility.of(LBL_CONTRAORDEN_EXITOSA).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_COMPROBANTE).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_NUMERO_CHEQUE.of(numeroCheque)).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_CUENTA_ASOCIADA.of(numeroCuenta)).viewedBy(actor).asBoolean();
    }

    public static VerificarContraorden deCheque(){
        return new VerificarContraorden();
    }
}