package co.com.bancolombia.certificacion.app.questions.fabrica.logcanal;

import co.com.bancolombia.certificacion.app.questions.logcanal.LogCanalParaTRN0345;
import co.com.bancolombia.certificacion.app.questions.logcanal.LogCanalParaTRN0360;
import co.com.bancolombia.certificacion.app.questions.logcanal.LogCanalParaTRN0369;
import net.serenitybdd.screenplay.Question;

public class FabricaLogCanal {

    private FabricaLogCanal() {
    }

    public static Question<Boolean> elLogCanal0369() {
        return new LogCanalParaTRN0369();
    }

    public static Question<Boolean> elLogCanal0360() {
        return new LogCanalParaTRN0360();
    }

    public static Question<Boolean> elLogCanal0345() {
        return new LogCanalParaTRN0345();
    }


}
