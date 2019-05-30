package co.com.bancolombia.models.product;


import co.com.bancolombia.errors.exceptions.FieldProductAssertion;
import co.com.bancolombia.models.products.DepositAccount;
import co.com.bancolombia.models.products.InvestmentFund;
import co.com.bancolombia.models.products.Product;
import co.com.bancolombia.utilities.constant.ConstantFound;

import java.util.Map;

/**
 * The type Product factory.
 */
public class ProductFactory implements ProductFactoryMethod {

    private static DepositAccount createDepositAcount(String number, String accountType) {
        DepositAccount currentAccount = new DepositAccount();
        currentAccount.setNumber(number);
        currentAccount.setProductType(accountType);
        currentAccount.setTypeAccountInLetter(accountType);
        currentAccount.setTypeAccountInNumber(accountType);
        currentAccount.setAccountNumberFormat(number);
        return currentAccount;
    }

    private static InvestmentFund createInvestmentFund(String number, String accountType) {
        InvestmentFund currentInvestmentFunds = new InvestmentFund();
        currentInvestmentFunds.setNumber(number);
        currentInvestmentFunds.setProductType(accountType);
        currentInvestmentFunds.setFundCode(accountType);
        return currentInvestmentFunds;
    }

    @Override
    public Product createProduct(String numberProduct, String productType) {
        productType = productType.toUpperCase();
        if (productType.contains("AHORROS") || productType.contains("CORRIENTE")) {
            return createDepositAcount(numberProduct, productType);
        } else if (isExist(ConstantFound.LIBRARY_BY_CODE, productType)) {
            return createInvestmentFund(numberProduct, productType);
        } else {
            throw new FieldProductAssertion(productType);
        }
    }

    private boolean isExist(Map<String, String> list, String productType) {
        String type = list.get(productType);
        return type != null;
    }

}
