package co.com.bancolombia.certificacion.app.questions.eprepago;

import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.ActivacionInactivacionEprepagoPage.OPT_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.OPCION_INACTIVAR_EPREPAGO;

public class CancelarInactivacionEprepago implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (Verificar.elementoVisible(actor, OPT_EPREPAGO.of(OPCION_INACTIVAR_EPREPAGO))){
            return true;
        }
        return false;
    }

    public static CancelarInactivacionEprepago esExitosa(){
        return new CancelarInactivacionEprepago();
    }
}
