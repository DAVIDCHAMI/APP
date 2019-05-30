package co.com.bancolombia.questions.database.channellog;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.integration.BackendFacade;
import co.com.bancolombia.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.models.entities.CurrentUserEntity;
import co.com.bancolombia.models.transaction.TransactionConfig;
import co.com.bancolombia.models.user.User;
import co.com.bancolombia.utilities.constant.ConstantsChannelLog;
import co.com.bancolombia.utilities.constant.ConstantsManager;
import co.com.bancolombia.utilities.managers.StringManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static co.com.bancolombia.utilities.UtilityChannelLog.validateField;

/**
 * The type Channel log in data base.
 */
public class ChannelLogInDataBaseTRN0326 implements Question<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger(ChannelLogInDataBaseTRN0326.class);

    @Override
    public Boolean answeredBy(Actor actor) {

        BackendFacade.consultChannelLogPlot220230();
        String trama0220 = Serenity.sessionVariableCalled("trama0220LogCanal");
        String trama0230 = Serenity.sessionVariableCalled("trama0230LogCanal");
        Boolean resultFinal = false;
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        User user = CurrentUserEntity.getUser();

        if (trama0220 != "" && trama0230 !=  ""){
            Boolean resultInput = true;
            Boolean resultOutput = true;

            /**
             * This is the Input plot.
             */
            resultInput = validateField(ConstantsChannelLog.DOCUMENTO + ConstantsManager.TRAMAINPUT, trama0220.substring(5,20), StringManager.formatoDocumento(user.getDocumentNumber()),resultInput);
            resultInput = validateField(ConstantsChannelLog.TRACE + ConstantsManager.TRAMAINPUT, trama0220.substring(301,313),Serenity.sessionVariableCalled("trace"),resultInput);
            resultInput = validateField(ConstantsChannelLog.CODIGOTRN + ConstantsManager.TRAMAINPUT, trama0220.substring(313,317),transactionConfig.getTransactionCode(),resultInput);
            resultInput = validateField(ConstantsChannelLog.DOCUMENTO + ConstantsManager.TRAMAINPUT, trama0220.substring(317,332), StringManager.formatoDocumento(user.getDocumentNumber()),resultInput);
            resultInput = validateField(ConstantsChannelLog.TIPODOCUMENTO + ConstantsManager.TRAMAINPUT, trama0220.substring(332,333), user.getDocumenType(),resultInput);
            resultInput = validateField(ConstantsChannelLog.FECHA + ConstantsManager.TRAMAINPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultInput);

            /**
             * This is the Output plot.
             */
            resultOutput = validateField(ConstantsChannelLog.DOCUMENTO + ConstantsManager.TRAMAOUTPUT, trama0220.substring(5,20), StringManager.formatoDocumento(user.getDocumentNumber()),resultOutput);
            resultOutput = validateField(ConstantsChannelLog.CODIGOERROR + ConstantsManager.TRAMAOUTPUT, trama0220.substring(69,72), transactionConfig.getErrorCode(),resultOutput);
            resultOutput = validateField(ConstantsChannelLog.TRACE + ConstantsManager.TRAMAOUTPUT, trama0220.substring(301,313),Serenity.sessionVariableCalled("trace"),resultOutput);
            resultOutput = validateField(ConstantsChannelLog.CODIGOTRN + ConstantsManager.TRAMAOUTPUT, trama0220.substring(313,317),transactionConfig.getTransactionCode(),resultOutput);
            resultOutput = validateField(ConstantsChannelLog.DOCUMENTO + ConstantsManager.TRAMAOUTPUT, trama0220.substring(317,332), StringManager.formatoDocumento(user.getDocumentNumber()),resultOutput);
            resultOutput = validateField(ConstantsChannelLog.TIPODOCUMENTO + ConstantsManager.TRAMAOUTPUT, trama0220.substring(332,333), user.getDocumenType(),resultOutput);
            resultOutput = validateField(ConstantsChannelLog.FECHA + ConstantsManager.TRAMAOUTPUT, trama0220.substring(359,367), DateManager.obtenerFechaSistema("YYYYMMdd"),resultOutput);

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
