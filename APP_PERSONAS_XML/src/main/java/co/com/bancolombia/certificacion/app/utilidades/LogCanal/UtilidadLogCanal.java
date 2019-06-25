package co.com.bancolombia.certificacion.app.utilidades.LogCanal;


import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import net.serenitybdd.core.Serenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The type Utility manager.
 */
public class UtilidadLogCanal {

    private static final Logger LOGGER = LogManager.getLogger("LOG CANAL COMFFLGWWW");
    private static String reporLogChannel = "";
    private static String resultadoCampo = "Resultado ";
    private static String respuestaOK = "  : OK";
    private static String respuestaERR = "  : ERROR";
    private static String logCanal = "LogCanal";

    private UtilidadLogCanal() {
        throw new IllegalStateException(TipoClaseConstante.UTILITY_CLASS);
    }

    /**
     * Format search factoria string.
     *
     * @param field the name campo
     * @param valueObtained   the value obtained
     * @param valueExpected   the value expected
     * @param result   the result boolean
     *
     * @return the boolean
     */

    public static boolean validateField(String field, String valueObtained, String valueExpected , Boolean result) {

        LOGGER.info("Valor Obtenido Campo " + field + " : " + valueObtained);
        LOGGER.info("Valor Esperado Campo " + field + " : " + valueExpected);
        reporLogChannel += "Valor Obtenido Campo " + field + " : " + valueObtained + "\n" +
                "Valor Esperado Campo " + field + " : " + valueExpected + "\n";

        try {
            if(result){
                if (valueObtained.equalsIgnoreCase(valueExpected)) {
                    LOGGER.info(resultadoCampo + respuestaOK);
                    reporLogChannel += resultadoCampo + respuestaOK + "\n\n";
                    Serenity.setSessionVariable(logCanal).to(reporLogChannel);
                    result = true;
                }else{
                    LOGGER.info(resultadoCampo + respuestaERR);
                    reporLogChannel += resultadoCampo + respuestaERR + "\n\n";
                    Serenity.setSessionVariable(logCanal).to(reporLogChannel);
                    result = false;
                }
            }else {
                if (valueObtained.equalsIgnoreCase(valueExpected)) {
                    LOGGER.info(resultadoCampo + respuestaOK);
                    reporLogChannel += resultadoCampo + respuestaOK + "\n\n";
                    Serenity.setSessionVariable(logCanal).to(reporLogChannel);
                    result = false;
                }else if (!valueObtained.equalsIgnoreCase(valueExpected)){
                    LOGGER.info(resultadoCampo + respuestaERR);
                    reporLogChannel += resultadoCampo + respuestaERR + "\n\n";
                    Serenity.setSessionVariable(logCanal).to(reporLogChannel);
                    result = false;
                }
            }
        }catch (Exception e) {
            LOGGER.info(resultadoCampo + field + respuestaERR);
            reporLogChannel += resultadoCampo + respuestaERR + "\n\n";
            Serenity.setSessionVariable(logCanal).to(reporLogChannel);
            result = false;
        }
        return result;
    }

}
