package co.com.bancolombia.certificacion.app.questions.cheque;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.cheque.ChequePage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;

public class VerificarContraordenConRango implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCuenta = actor.recall(NUMERO_CUENTA);
        String rangoDesde = actor.recall(CHEQUE);
        String rangoHasta = actor.recall(NUMERO_CHEQUE);
        return Visibility.of(LBL_CONTRAORDEN_EXITOSA).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_COMPROBANTE).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_NUMERO_CHEQUE.of(rangoDesde, rangoHasta)).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_CUENTA_ASOCIADA.of(numeroCuenta)).viewedBy(actor).asBoolean();
    }
    public static VerificarContraordenConRango deChequeConRango(){return new VerificarContraordenConRango();}
}
