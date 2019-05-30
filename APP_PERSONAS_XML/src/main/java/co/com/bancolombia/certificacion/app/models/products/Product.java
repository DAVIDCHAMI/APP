package co.com.bancolombia.certificacion.app.models.products;


/**
 * The type Product.
 */
public class Product {

    private String number;
    private String productType;
    private String bankCode;
    private String bankName;
    private String productName;

    /**
     * Instantiates a new Product.
     */
    public Product() {
    }

    /**
     * Instantiates a new Product.
     *
     * @param number      the number
     * @param productType the product type
     */
    protected Product(String number, String productType) {
        this.number = number;
        this.productType = productType;
    }



    /**
     * Gets number.
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param numero the numero
     */
    public void setNumber(String numero) {
        this.number = numero;
    }

    /**
     * Gets product type.
     *
     * @return the product type
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets product type.
     *
     * @param tipoProducto the tipo producto
     */
    public void setProductType(String tipoProducto) {
        this.productType = tipoProducto;
    }

    /**
     * Gets bank code.
     *
     * @return the bank code
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets bank code.
     *
     * @param codigoBanco the codigo banco
     */
    public void setBankCode(String codigoBanco) {
        this.bankCode = codigoBanco;
    }

    /**
     * Gets bank name.
     *
     * @return the bank name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets bank name.
     *
     * @param nombreBanco the nombre banco
     */
    public void setBankName(String nombreBanco) {
        this.bankName = nombreBanco;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

}
