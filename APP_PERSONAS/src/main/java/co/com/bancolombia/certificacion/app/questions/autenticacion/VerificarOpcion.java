package co.com.bancolombia.certificacion.app.questions.autenticacion;

import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.BTN_QUIERO_SER_CLIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.LBL_OPCION_NO_ERES_CLIENTE;

public class VerificarOpcion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Verificar.elementoVisible(actor, LBL_OPCION_NO_ERES_CLIENTE) &&
                Verificar.elementoVisible(actor, BTN_QUIERO_SER_CLIENTE);
    }

    public static VerificarOpcion aunNoEresCliente() {
        return new VerificarOpcion();
    }
}