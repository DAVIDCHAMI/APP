package co.com.bancolombia.questions.database;

import co.com.bancolombia.integration.BackendFacadeEprepago;
import co.com.bancolombia.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.models.transaction.TransactionConfig;
import co.com.bancolombia.utilities.constant.ConstantsManager;
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
