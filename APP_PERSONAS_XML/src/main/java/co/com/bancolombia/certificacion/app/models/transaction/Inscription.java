package co.com.bancolombia.certificacion.app.models.transaction;


import co.com.bancolombia.certificacion.app.models.products.DepositAccount;
import co.com.bancolombia.certificacion.app.models.user.User;

/**
 * The type Inscripcion cuenta.
 */
public class Inscription {

    private String bankName;
    private String customName;
    private User user;
    private DepositAccount depositAccount;

    /**
     * Gets bankName.
     *
     * @return the bankName
     */


    public String getBankName() {
        return bankName;
    }

    /**
     * Sets bankName.
     *
     * @param bankName the bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Gets nombre personalizado.
     *
     * @return the nombre personalizado
     */
    public String getCustomName() {
        return customName;
    }

    /**
     * Sets nombre personalizado.
     *
     * @param customName the nombre personalizado
     */
    public void setCustomName(String customName) {
        this.customName = customName;
    }


    /**
     * Gets deposit account.
     *
     * @return the deposit account
     */
    public DepositAccount getDepositAccount() {
        return depositAccount;
    }

    /**
     * Sets deposit account.
     *
     * @param depositAccount the deposit account
     */
    public void setDepositAccount(DepositAccount depositAccount) {
        this.depositAccount = depositAccount;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }
}
