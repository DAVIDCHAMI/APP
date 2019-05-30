package co.com.bancolombia.certificacion.app.models.products;


import co.com.bancolombia.certificacion.app.utilities.constant.ConstantFound;

import java.util.Map;

/**
 * The type Investment fund.
 */
public class InvestmentFund extends Product {

    private String fundCode;


    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setFundCode(String fundCode) {
        this.fundCode = castTypeFundCode(fundCode);
    }

    private String castTypeFundCode(String typeFund) {
        typeFund = typeFund.toUpperCase();
        Map<String, String> map = ConstantFound.LIBRARY_BY_CODE;
        String type = map.get(typeFund);
        if (type == null) {
            throw new NullPointerException("NO EXISTE ESTE FONDO");
        } else {
            return type;
        }
    }


}
