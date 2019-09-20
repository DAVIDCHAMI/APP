package co.com.bancolombia.certificacion.app.questions.pagos;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LBL_VERIFICACION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.PAGO_EXITOSO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_TARJETA_CREDITO;

public class VerificarPago implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Producto productoDebitado = actor.recall(MODELO_DETALLE_PRODUCTO);
        TarjetaCredito tarjetaCredito = actor.recall(MODELO_TARJETA_CREDITO);
        return LBL_VERIFICACION.of(PAGO_EXITOSO).resolveFor(actor).isPresent() &&
                LBL_VERIFICACION.of(tarjetaCredito.getNumero()).resolveFor(actor).isPresent() &&
                LBL_VERIFICACION.of(tarjetaCredito.getValorPago()).resolveFor(actor).isPresent() &&
                LBL_VERIFICACION.of(productoDebitado.getNumero()).resolveFor(actor).isPresent();
    }

    public static VerificarPago exitoso(){
        return new VerificarPago();
    }
}
