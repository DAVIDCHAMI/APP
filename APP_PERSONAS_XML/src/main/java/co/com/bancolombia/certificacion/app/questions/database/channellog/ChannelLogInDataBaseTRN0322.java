package co.com.bancolombia.certificacion.app.questions.database.channellog;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.integration.BackendFacade;
import co.com.bancolombia.certificacion.app.utilidades.constantes.LogCanalConstante;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.certificacion.app.utilidades.administradores.StringManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.certificacion.app.utilidades.UtilityChannelLog.validateField;

/**
 * The type Channel log in data base.
 */
public class ChannelLogInDataBaseTRN0322 implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ChannelLogInDataBaseTRN0322.class);

    @Override
    public Boolean answeredBy(Actor actor) {

        BackendFacade.consultChannelLogPlot220230();
        String trama0220 = Serenity.sessionVariableCalled("trama0220LogCanal");
        String trama0230 = Serenity.sessionVariableCalled("trama0230LogCanal");
        Boolean resultFinal = false;
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        User user = CargarEntidadUsuario.getUser();

        if (trama0220 != "" && trama0230 !=  ""){
            Boolean resultInput = true;
            Boolean resultOutput = true;

            /**
             * This is the Input plot.
             */
            resultInput = validateField(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(5,20), StringManager.formatoDocumento(user.getDocumentNumber()),resultInput);
            resultInput = validateField(LogCanalConstante.TRACE + AdministradorConstante.TRAMAINPUT, trama0220.substring(301,313),Serenity.sessionVariableCalled("trace"),resultInput);
            resultInput = validateField(LogCanalConstante.CODIGOTRN + AdministradorConstante.TRAMAINPUT, trama0220.substring(313,317), configuracionTransaccion.getTransactionCode(),resultInput);
            resultInput = validateField(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(317,332), StringManager.formatoDocumento(user.getDocumentNumber()),resultInput);
            resultInput = validateField(LogCanalConstante.TIPODOCUMENTO + AdministradorConstante.TRAMAINPUT, trama0220.substring(332,333), user.getDocumenType(),resultInput);
            resultInput = validateField(LogCanalConstante.FECHA + AdministradorConstante.TRAMAINPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultInput);

            /**
             * This is the Output plot.
             */
            resultOutput = validateField(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(5,20), StringManager.formatoDocumento(user.getDocumentNumber()),resultOutput);
            resultOutput = validateField(LogCanalConstante.CODIGOERROR + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(69,72), configuracionTransaccion.getErrorCode(),resultOutput);
            resultOutput = validateField(LogCanalConstante.TRACE + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(301,313),Serenity.sessionVariableCalled("trace"),resultOutput);
            resultOutput = validateField(LogCanalConstante.CODIGOTRN + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(313,317), configuracionTransaccion.getTransactionCode(),resultOutput);
            resultOutput = validateField(LogCanalConstante.DOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(317,332), StringManager.formatoDocumento(user.getDocumentNumber()),resultOutput);
            resultOutput = validateField(LogCanalConstante.TIPODOCUMENTO + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(332,333), user.getDocumenType(),resultOutput);
            resultOutput = validateField(LogCanalConstante.FECHA + AdministradorConstante.TRAMAOUTPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultOutput);

            if (resultInput && resultOutput){
                resultFinal=true;
            }
            Serenity.recordReportData().withTitle("ResultLogCanal").andContents(Serenity.sessionVariableCalled("LogCanal"));
        }else{
            LOGGER.info("Valores de la trama input y output sin registros");
        }
        return resultFinal;
    }

}
