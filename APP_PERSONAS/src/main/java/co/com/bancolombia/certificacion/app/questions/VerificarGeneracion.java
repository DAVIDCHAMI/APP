package co.com.bancolombia.certificacion.app.questions;

import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_VERIFICACION;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GenerarCodigoQrPage.IMG_CODIGO_QR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CEROS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.INFO_CODIGO_QR;

public class VerificarGeneracion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Transferencia datos = actor.recall(INFO_CODIGO_QR);
        if ("".equals(datos.getMonto()))
            datos.setMonto(CEROS);
        return IMG_CODIGO_QR.resolveFor(actor).isVisible() &&
                LBL_VERIFICACION.of(datos.getProductoOrigen().getNumero()).resolveFor(actor).isVisible() &&
                LBL_VERIFICACION.of(datos.getMonto()).resolveFor(actor).isVisible();
    }

    public static VerificarGeneracion qr(){
        return new VerificarGeneracion();
    }
}
