package co.com.bancolombia.certificacion.app.models.transaccion;


import co.com.bancolombia.certificacion.app.models.productos.CuentaDeposito;
import co.com.bancolombia.certificacion.app.models.usuario.User;

/**
 * The type Inscripcion cuenta.
 */
public class Inscripcion {

    private String bankName;
    private String customName;
    private User user;
    private CuentaDeposito depositAccount;

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
    public CuentaDeposito getDepositAccount() {
        return depositAccount;
    }

    /**
     * Sets deposit account.
     *
     * @param depositAccount the deposit account
     */
    public void setDepositAccount(CuentaDeposito depositAccount) {
        this.depositAccount = depositAccount;
    }

    /**
     * Gets usuario.
     *
     * @return the usuario
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets usuario.
     *
     * @param user the usuario
     */
    public void setUser(User user) {
        this.user = user;
    }
}
