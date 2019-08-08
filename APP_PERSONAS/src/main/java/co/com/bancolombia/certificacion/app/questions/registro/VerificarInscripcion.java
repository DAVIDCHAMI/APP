package co.com.bancolombia.certificacion.app.questions.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionProductoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.String.UtileriaString.obtenerValorEntero;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;

public class VerificarInscripcion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroProducto = obtenerValorEntero(Text.of(LBL_NUMERO_PRODUCTO).viewedBy(actor).asString());
        String nombreBanco = actor.recall(NOMBRE_BANCO);
        String tipoCuenta = actor.recall(TIPO_CUENTA);
        String tipoDocumento = actor.recall(TIPO_DOCUMENTO);
        String numeroDocumento = actor.recall(NUMERO_DOCUMENTO);
        return (numeroProducto.equals(actor.recall(NUMERO_CUENTA)) &&
                Visibility.of(IMG_CONFIRMACION).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_TIPO_PRODUCTO.of(tipoCuenta)).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_TIPO_DOCUMENTO.of(tipoDocumento)).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_NUMERO_DOCUMENTO.of(numeroDocumento)).viewedBy(actor).asBoolean() &&
                Visibility.of(LBL_BANCO.of(nombreBanco)).viewedBy(actor).asBoolean()
        );
    }

    public static VerificarInscripcion deProductos() {
        return new VerificarInscripcion();
    }
}