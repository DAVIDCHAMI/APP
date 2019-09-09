package co.com.bancolombia.certificacion.app.questions.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarInscripcion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        /*
        string numeroProducto = obtenerValorEntero(Text.of(LBL_NUMERO_PRODUCTO).viewedBy(actor).asString());
        string nombreBanco = actor.recall(NOMBRE_BANCO);
        string tipoCuenta = actor.recall(TIPO_CUENTA);
        string tipoDocumento = actor.recall(TIPO_DOCUMENTO);
        string numeroDocumento = actor.recall(NUMERO_DOCUMENTO);
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
    */
        return null;
    }
}