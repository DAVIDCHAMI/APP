package co.com.bancolombia.certificacion.app.utilities;


import co.com.bancolombia.certificacion.app.utilities.constant.ConstantTypeClass;

/**
 * The type Utility manager.
 */
public class UtilityManager {

    private UtilityManager() {
        throw new IllegalStateException(ConstantTypeClass.UTILITY_CLASS);
    }

    /**
     * Format deposit account string.
     *
     * @param depositAccount the deposit account
     * @return the string
     */
    public static String depositAccountFormat(String depositAccount) {
        String depositAccountCeros = String.format("%011d", Long.parseLong(depositAccount));
        return depositAccountCeros.replaceFirst("(\\d{3})(\\d{6})(\\d{2})", "$1-$2-$3");

    }

    /**
     * Cast type account letter string.
     *
     * @param typeAccount the type account
     * @return the string
     */
    public static String castTypeAccountLetter(String typeAccount) {
        String typeAccountUpper = typeAccount.toUpperCase();
        String castTypeAccount = "";
        if (typeAccountUpper.contains("AHORRO")) {
            castTypeAccount = "S";
        } else if (typeAccountUpper.contains("CORRIENTE")) {
            castTypeAccount = "D";
        }
        return castTypeAccount;

    }

    /**
     * Cast type account number string.
     *
     * @param typeAccount the type account
     * @return the string
     */
    public static String castTypeAccountNumber(String typeAccount) {
        String typeAccountUpper = typeAccount.toUpperCase();
        String castTypeAccount = "";
        if (typeAccountUpper.contains("AHORROS")) {
            castTypeAccount = "7";
        } else if (typeAccountUpper.contains("CORRIENTE")) {
            castTypeAccount = "1";
        }
        return castTypeAccount;

    }

    /**
     * Format search product string.
     *
     * @param numberFormat the number format
     * @param typeFormat   the type format
     * @return the string
     */
    public static String searchProductFormat(String numberFormat, String typeFormat) {
        return String.format("%s - %s", typeFormat, numberFormat);
    }

}
