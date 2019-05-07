package co.com.bancolombia.certificacion.app.models.usuario;


import co.com.bancolombia.certificacion.app.models.producto.Producto;

import java.util.List;

/**
 * The type Usuario.
 */
public class Usuario {

    private String username;
    private String password;
    private String secondPassword;
    private String documentNumber;
    private String documenType;
    private String firstQuestion;
    private String keyStatus;
    private List<Producto> products;

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
    public void setNombreUsuario(String username) {
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
    public void setClave(String password) {
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
    public void setSegundaClave(String secondPassword) {
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
    public void setNumeroDocumento(String documentNumber) {
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
    public void setTipoDocumento(String documenType) {
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
    public void setPrimeraPregunta(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    /**
     * Gets producto.
     *
     * @return the producto
     */
    public List<Producto> getProducts() {
        return products;
    }

    /**
     * Sets producto.
     *
     * @param products the producto
     */
    public void setProducts(List<Producto> products) {
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
    public void setEstadoClave(String keyStatus) {
        this.keyStatus = keyStatus;
    }
}