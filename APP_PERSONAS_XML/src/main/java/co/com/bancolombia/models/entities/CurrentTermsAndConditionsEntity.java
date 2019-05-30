package co.com.bancolombia.models.entities;


import co.com.bancolombia.models.TermsAndConditions;
import co.com.bancolombia.utilities.constant.ConstantTypeClass;

import java.util.List;

/**
 * The type Current user entity.
 */
public class CurrentTermsAndConditionsEntity {

    private static TermsAndConditions termsAndConditions = new TermsAndConditions();

    private CurrentTermsAndConditionsEntity() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public static TermsAndConditions getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets user.
     *
     * @param data the data
     */
    public static void setTermsAndConditions(List<String> data) {
        termsAndConditions.setTyc(data.get(0));
    }
}