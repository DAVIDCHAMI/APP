package co.com.bancolombia.certificacion.app.questions.fabrica.logcanal;

import co.com.bancolombia.certificacion.app.questions.logcanal.LogCanalParaTRN0369;
import net.serenitybdd.screenplay.Question;

public class FabricaLogCanal {

    private FabricaLogCanal() {
    }

    public static Question<Boolean> elLogCanal0369() { return new LogCanalParaTRN0369();}


}
