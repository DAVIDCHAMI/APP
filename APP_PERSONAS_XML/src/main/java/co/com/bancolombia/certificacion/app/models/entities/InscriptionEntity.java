package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.transaction.Inscription;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.models.products.DepositAccount;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantTypeClass;

import java.util.List;

/**
 * The type Inscription entity.
 */
public class InscriptionEntity {

    /**
     * The constant inscription.
     */
    private static Inscription inscription = new Inscription();

    private InscriptionEntity() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets insciption.
     *
     * @return the insciption
     */
    public static Inscription getInsciption() {
        return inscription;
    }

    /**
     * Sets insciption.
     *
     * @param data the data
     */
    public static void setInsciption(List<String> data) {
        DepositAccount depositAccount = new DepositAccount();
        User user = new User();

        inscription.setBankName(data.get(0));
        depositAccount.setProductType(data.get(1));
        depositAccount.setAccountNumberFormat(data.get(2));
        inscription.setCustomName(data.get(3));
        user.setDocumenType(data.get(4));
        user.setDocumentNumber(data.get(5));

        inscription.setUser(user);
        inscription.setDepositAccount(depositAccount);
    }
}
