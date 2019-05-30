package co.com.bancolombia.models.entities;


import co.com.bancolombia.models.Deposit;
import co.com.bancolombia.utilities.constant.ConstantTypeClass;

import java.util.List;

/**
 * The type Current Deposit entity.
 */

public class CurrentDepositEntity {


    private static Deposit deposit = new Deposit();
    private CurrentDepositEntity() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets deposit.
     *
     * @return  deposit
     */
    public static Deposit getDeposit() {
        return deposit;
    }

    /**
     * Sets deposit.
     *
     * @param data the data
     */
    public static void setDeposit(List<String> data){
        deposit.setAccount(data.get(0));
        deposit.setTypeAccount(data.get(1));
        deposit.setBalance(Double.parseDouble(data.get(2)));
    }
}
