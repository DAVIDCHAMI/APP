package co.com.bancolombia.certificacion.app.questions.administrarfacturas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.administrarfacturas.ProgramarPagarFacturasPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.SERVICIO;

public class VerificarEliminacionFactura implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String empresaServicio=actor.recall(SERVICIO);
        return Visibility.of(LBL_ELIMINACION_EXITOSA).viewedBy(actor).asBoolean() && Visibility.of(LBL_EMPRESA_SERIVICIO.of(empresaServicio)).viewedBy(actor).asBoolean()  ;
    }
    public static VerificarEliminacionFactura inscritas(){
        return new VerificarEliminacionFactura();
    }
}
