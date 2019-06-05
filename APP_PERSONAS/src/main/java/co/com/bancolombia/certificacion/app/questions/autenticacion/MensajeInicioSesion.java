package co.com.bancolombia.certificacion.app.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.app.userinterface.consulta.PaginaConsultarMisProductos.TITULO;

public class MensajeInicioSesion implements Question<Boolean> {


    public static MensajeInicioSesion esIgualA() {
        return new MensajeInicioSesion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(TITULO).viewedBy(actor).asString().equalsIgnoreCase("CONSULTAR MIS PRODUCTOS");
    }
}
