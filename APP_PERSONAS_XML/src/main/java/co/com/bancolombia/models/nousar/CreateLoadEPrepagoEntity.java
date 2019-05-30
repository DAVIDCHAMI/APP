package co.com.bancolombia.models.nousar;

import co.com.bancolombia.models.EPrepago;

import java.util.List;

import static co.com.bancolombia.utilities.UtilityManager.depositAccountFormat;

/**
 * The type Create load e prepago entity.
 */
public class CreateLoadEPrepagoEntity {
    private static EPrepago ePrepagoValues;

    private CreateLoadEPrepagoEntity() {
    }

    /**
     * Gets load e prepago.
     *
     * @return the load e prepago
     */
    public static EPrepago getLoadEPrepago() {
        return ePrepagoValues;
    }

    /**
     * Sets load e prepago.
     *
     * @param data the data
     */
    public static void setLoadEPrepago(List<String> data) {
        EPrepago ePrepagoValues = new EPrepago();
        ePrepagoValues.setOriginAccount(depositAccountFormat(data.get(0)));
        ePrepagoValues.setAmount("0" + data.get(2));
        CreateLoadEPrepagoEntity.ePrepagoValues = ePrepagoValues;
    }

}
