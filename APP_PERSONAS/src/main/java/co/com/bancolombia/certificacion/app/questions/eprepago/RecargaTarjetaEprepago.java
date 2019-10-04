package co.com.bancolombia.certificacion.app.questions.eprepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.CargarTarjetaVirtualEprepagoPage.LBL_RECARGA_EXITOSA_EPREPAGO;

public class RecargaTarjetaEprepago implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_RECARGA_EXITOSA_EPREPAGO.resolveFor(actor).isVisible();
    }

    public static RecargaTarjetaEprepago exitosa(){return new RecargaTarjetaEprepago();}
}