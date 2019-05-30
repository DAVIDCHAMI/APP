package co.com.bancolombia.models.entities.detaildeposit;


import co.com.bancolombia.models.products.DepositAccount;
import co.com.bancolombia.utilities.constant.ConstantTypeClass;

import java.util.List;

/**
 * The type Detail query deposit account entity.
 */
public class DepositAccountEntityQueryDetail {

    private static DepositAccount depositAccount = new DepositAccount();

    private DepositAccountEntityQueryDetail() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets detalle consulta cuenta deposito.
     *
     * @return the detalle consulta cuenta deposito
     */
    public static DepositAccount getDepositAccount() {
        return depositAccount;
    }

    /**
     * Sets detalle consulta cuenta deposito.
     *
     * @param data the data
     */
    public static void setDepositAccount(List<String> data) {
        depositAccount.setAccountNumberFormat(data.get(0));
        depositAccount.setProductType(data.get(1));

    }


}
