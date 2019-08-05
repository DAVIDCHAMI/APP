package co.com.bancolombia.certificacion.app.questions.fabrica.autenticacion;

import co.com.bancolombia.certificacion.app.questions.autenticacion.ExistenciaCliente;
import net.serenitybdd.screenplay.Question;


public class FabricaAutenticacion {

    private FabricaAutenticacion() {
    }

    public static Question<Boolean> elArchivoEnIseriesWWWFFUSRSV() { return new ExistenciaCliente(); }

}
