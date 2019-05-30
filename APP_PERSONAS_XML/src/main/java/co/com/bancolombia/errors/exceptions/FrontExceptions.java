package co.com.bancolombia.errors.exceptions;

/**
 * The type Front exceptions.
 */
public class FrontExceptions extends Exception {


    /**
     * Instantiates a new Front end exceptions.
     */
    public FrontExceptions() {
        super();
    }

    /**
     * Instantiates a new Front end exceptions.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public FrontExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new Front end exceptions.
     *
     * @param message the message
     * @param cause   the cause
     */
    public FrontExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Front end exceptions.
     *
     * @param message the message
     */
    public FrontExceptions(String message) {
        super(message);
    }

    /**
     * Instantiates a new Front end exceptions.
     *
     * @param cause the cause
     */
    public FrontExceptions(Throwable cause) {
        super(cause);
    }

}
