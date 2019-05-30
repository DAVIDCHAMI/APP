package co.com.bancolombia.certificacion.app.models.transaction;


import co.com.bancolombia.certificacion.app.models.products.Product;

/**
 * The type Transfer.
 */
public class Transfer {

    private Product originProduct;
    private Product destinationProduct;
    private String amount;
    private String transferType;
    private String bank;
    private String description;
    private String additionalInformation;


    /**
     * Gets origin product.
     *
     * @return the origin product
     */
    public Product getOriginProduct() {
        return originProduct;
    }

    /**
     * Sets origin product.
     *
     * @param originProduct the origin product
     */
    public void setOriginProduct(Product originProduct) {
        this.originProduct = originProduct;
    }

    /**
     * Gets destination product.
     *
     * @return the destination product
     */
    public Product getDestinationProduct() {
        return destinationProduct;
    }

    /**
     * Sets destination product.
     *
     * @param destinationProduct the destination product
     */
    public void setDestinationProduct(Product destinationProduct) {
        this.destinationProduct = destinationProduct;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Gets transfer type.
     *
     * @return the transfer type
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets transfer type.
     *
     * @param transferType the transfer type
     */
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    /**
     * Gets bank.
     *
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets bank.
     *
     * @param bank the bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets additional information.
     *
     * @return the additional information
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets additional information.
     *
     * @param additionalInformation the additional information
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}
