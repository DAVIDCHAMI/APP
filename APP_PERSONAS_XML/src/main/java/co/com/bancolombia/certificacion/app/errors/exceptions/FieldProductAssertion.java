package co.com.bancolombia.certificacion.app.errors.exceptions;


import co.com.bancolombia.certificacion.app.utilities.constant.ConstantExceptions;

import java.text.MessageFormat;


/**
 * The type Field product assertion.
 */
public class FieldProductAssertion extends AssertionError {


    /**
     * The constant NOT_WORKS.
     */
    public static final String NOT_WORKS = "No funciono el metodo";

    /**
     * Instantiates a new Field product assertion.
     *
     * @param itemID the item id
     */
    public FieldProductAssertion(String itemID) {
        super(MessageFormat.format(ConstantExceptions.PRODUCT_NOEXIST, itemID));
    }

    /**
     * Instantiates alEndPoint new Inicio sesion excepciones.
     *
     * @param message            the message
     * @param testErrorException the test error exception
     */
    public FieldProductAssertion(String message, Throwable testErrorException) {
        super(message, testErrorException);

    }


}
