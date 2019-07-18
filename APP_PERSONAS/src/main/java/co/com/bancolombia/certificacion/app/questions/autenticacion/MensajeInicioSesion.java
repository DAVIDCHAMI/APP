package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class MensajeInicioSesion implements Question<Boolean> {

    public static MensajeInicioSesion esIgualA() {
        return new MensajeInicioSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of("").viewedBy(actor).asString().equalsIgnoreCase("CONSULTAR MIS PRODUCTOS");
    }
}
