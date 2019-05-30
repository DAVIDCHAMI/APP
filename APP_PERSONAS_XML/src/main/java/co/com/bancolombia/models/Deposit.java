package co.com.bancolombia.models;

/**
 * The type Deposit.
 */
public class Deposit {
    private String account;
    private Double balance;
    private Double balanceBefore;
    private Double balanceAfter;
    private String typeAccount;
    private Double balanceBeforeDestination;
    private Double balanceAfterDestination;
    private String typeAccountDestination;

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Gets balance before.
     *
     * @return the balance before
     */
    public Double getBalanceBefore() {
        return balanceBefore;
    }

    /**
     * Sets balance before.
     *
     * @param balanceBefore the balance before
     */
    public void setBalanceBefore(Double balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    /**
     * Gets balance after.
     *
     * @return the balance after
     */
    public Double getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * Sets balance after.
     *
     * @param balanceAfter the balance after
     */
    public void setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    /**
     * Gets type account.
     *
     * @return the type account
     */
    public String getTypeAccount() {
        return typeAccount;
    }

    /**
     * Sets type account.
     *
     * @param typeAccount the type account
     */
    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getBalanceBeforeDestination() {
        return balanceBeforeDestination;
    }

    public void setBalanceBeforeDestination(Double balanceBeforeDestination) {
        this.balanceBeforeDestination = balanceBeforeDestination;
    }

    public Double getBalanceAfterDestination() {
        return balanceAfterDestination;
    }

    public void setBalanceAfterDestination(Double balanceAfterDestination) {
        this.balanceAfterDestination = balanceAfterDestination;
    }

    public String getTypeAccountDestination() {
        return typeAccountDestination;
    }

    public void setTypeAccountDestination(String typeAccountDestination) {
        this.typeAccountDestination = typeAccountDestination;
    }
}
