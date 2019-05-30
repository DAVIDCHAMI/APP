package co.com.bancolombia.certificacion.app.models.user;


import co.com.bancolombia.certificacion.app.models.products.Product;

import java.util.List;

/**
 * The type User.
 */
public class User {

    private String username;
    private String password;
    private String secondPassword;
    private String documentNumber;
    private String documenType;
    private String firstQuestion;
    private String keyStatus;
    private String email;
    private List<Product> products;

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets second password.
     *
     * @return the second password
     */
    public String getSecondPassword() {
        return secondPassword;
    }

    /**
     * Sets second password.
     *
     * @param secondPassword the second password
     */
    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }

    /**
     * Gets document number.
     *
     * @return the document number
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets document number.
     *
     * @param documentNumber the document number
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Gets documen type.
     *
     * @return the documen type
     */
    public String getDocumenType() {
        return documenType;
    }

    /**
     * Sets documen type.
     *
     * @param documenType the documen type
     */
    public void setDocumenType(String documenType) {
        this.documenType = documenType;
    }

    /**
     * Gets first question.
     *
     * @return the first question
     */
    public String getFirstQuestion() {
        return firstQuestion;
    }

    /**
     * Sets first question.
     *
     * @param firstQuestion the first question
     */
    public void setFirstQuestion(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    /**
     * Gets products.
     *
     * @return the products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Sets products.
     *
     * @param products the products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Gets key status.
     *
     * @return the key status
     */
    public String getKeyStatus() {
        return keyStatus;
    }

    /**
     * Sets key status.
     *
     * @param keyStatus the key status
     */
    public void setKeyStatus(String keyStatus) {
        this.keyStatus = keyStatus;
    }

    /**
     * Gets email.
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}