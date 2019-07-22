package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.*;

public class VerificarCuentasDeposito implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if (OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(CREDITOS).resolveFor(actor).isVisible()
                || OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(CREDIAGIL).resolveFor(actor).isVisible()
                || OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(INVERSIONES).resolveFor(actor).isVisible()
                || OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(E_PREPAGO).resolveFor(actor).isVisible()
                || OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS.of(TARJETAS_CREDITO).resolveFor(actor).isVisible()) {
            return false;
        }else{
            return true;
        }
    }

    public static VerificarCuentasDeposito comoUnicoProducto() {
        return new VerificarCuentasDeposito();
    }
}
