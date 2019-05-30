package co.com.bancolombia.certificacion.app.questions.database;

import co.com.bancolombia.certificacion.app.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.certificacion.app.models.transaction.TransactionConfig;
import co.com.bancolombia.certificacion.app.integration.BackendFacadeEprepago;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConsultObjectBooleanCABFFPPMAE implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        if(ConstantsManager.TRANSACTIONCODE_ACTIVATION_EPREPAGO.equals(transactionConfig.getTransactionCode())){
            result = BackendFacadeEprepago.verifyEprepagoStateActivation();
        }
        if(ConstantsManager.TRANSACTIONCODE_INACTIVATION_EPREPAGO.equals(transactionConfig.getTransactionCode())){
            result = BackendFacadeEprepago.verifyEprepagoStateInactivation();
        }
        return result;
    }
}
