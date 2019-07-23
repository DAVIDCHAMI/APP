package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos.DetalleProductosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;

public class VerificarDetalleProducto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String tipoCuenta = LBL_TIPO_CUENTA.resolveFor(actor).getText();
        String numeroCuenta = LBL_NUMERO_CUENTA.resolveFor(actor).getText();

        if(actor.recall(TIPO_CUENTA).equals(tipoCuenta) && actor.recall(NUMERO_CUENTA).equals(numeroCuenta) && !LBL_SALDO_DISPONIBLE.resolveFor(actor).getText().equals("")){
            return true;
        }
        return false;
    }

    public static VerificarDetalleProducto esExitoso(){
        return new VerificarDetalleProducto();
    }
}