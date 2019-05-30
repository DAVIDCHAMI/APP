package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.transaction.TransactionConfig;
import co.com.bancolombia.certificacion.app.models.products.DepositAccount;
import co.com.bancolombia.certificacion.app.models.products.VirtualInvestment;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantTypeClass;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager.EXPIRATION;
import static co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager.MONTHLY;


/**
 * The type Virtual investment entity.
 */
public class VirtualInvestmentEntity {

    private static VirtualInvestment virtualInvestment = new VirtualInvestment();

    private VirtualInvestmentEntity() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets inversion virtual.
     *
     * @return the inversion virtual
     */
    public static VirtualInvestment getVirtualInvestment() {
        return virtualInvestment;
    }

    /**
     * Sets inversion virtual.
     *
     * @param data the data
     */
    public static void setVirtualInvestment(List<String> data) {
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        DepositAccount depositAccount = new DepositAccount();

        if (ConstantsManager.TRANSACTION_CODE_OPENING_VIRTUAL_INVESTMENT.equals(transactionConfig.getTransactionCode())||
                ConstantsManager.TRANSACTION_CODE_SIMULATION_VIRTUAL_INVESTMENT.equals(transactionConfig.getTransactionCode())){
            virtualInvestment.setInvestmentValue(data.get(0));
            virtualInvestment.setPeriodicityPaymentInterest(data.get(1));
            virtualInvestment.setDaysTerm(data.get(2));
            virtualInvestment.setAnnualEffectiveRate(data.get(3));


        }else{
            virtualInvestment.setInvestmentValue(data.get(0));
            virtualInvestment.setDaysTerm(data.get(1));
            virtualInvestment.setPeriodicityPaymentInterest(data.get(2));
            virtualInvestment.setPeriodicityPaymentInterestNumber(castPeriodicity(data.get(2)));
            depositAccount.setAccountNumberFormat(data.get(3));
            depositAccount.setProductType(data.get(4));
        }
        virtualInvestment.setDepositAccount(depositAccount);

    }

    private static int castPeriodicity(String periodicity) {
        int result = 0;
        if (periodicity.equalsIgnoreCase(MONTHLY)) {
            result = 1;
        } else if (periodicity.equalsIgnoreCase(EXPIRATION)) {
            result = 2;
        }
        return result;
    }
}
