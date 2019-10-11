package co.com.bancolombia.certificacion.app.questions.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.LBL_PRODUCTO_ORIGEN_EPREPAGO;

public class Verificar implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_PRODUCTO_ORIGEN_EPREPAGO.resolveFor(actor).waitUntilVisible().isVisible();
    }

    public static Verificar elementoVisible(){return new Verificar();}
}