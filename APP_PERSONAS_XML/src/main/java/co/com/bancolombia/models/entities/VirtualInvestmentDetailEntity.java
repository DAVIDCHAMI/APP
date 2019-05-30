package co.com.bancolombia.models.entities;


import co.com.bancolombia.models.products.VirtualInvestment;
import co.com.bancolombia.utilities.constant.ConstantTypeClass;

import java.util.List;

/**
 * The type Virtual investment detail entity.
 */
public class VirtualInvestmentDetailEntity {

    private static VirtualInvestment virtualInvestmentDetail = new VirtualInvestment();

    private VirtualInvestmentDetailEntity() {
        throw new IllegalStateException(ConstantTypeClass.ENTITY_CLASS);
    }

    /**
     * Gets detalle inversion virtual.
     *
     * @return the detalle inversion virtual
     */
    public static VirtualInvestment getVirtualInvestmentDetail() {
        return virtualInvestmentDetail;
    }

    /**
     * Sets detalle inversion virtual.
     *
     * @param data the data
     */
    public static void setVirtualInvestmentDetail(List<String> data) {
        virtualInvestmentDetail.setInvestmentNumber(data.get(0));
    }
}
