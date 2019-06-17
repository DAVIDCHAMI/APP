package co.com.bancolombia.certificacion.app.errors.exceptions;


import co.com.bancolombia.certificacion.app.utilidades.constantes.ExcepcionesConstante;

import java.text.MessageFormat;


/**
 * The type Field factoria assertion.
 */
public class FieldProductAssertion extends AssertionError {


    /**
     * The constantes NOT_WORKS.
     */
    public static final String NOT_WORKS = "No funciono el metodo";

    /**
     * Instantiates a new Field factoria assertion.
     *
     * @param itemID the item id
     */
    public FieldProductAssertion(String itemID) {
        super(MessageFormat.format(ExcepcionesConstante.PRODUCT_NOEXIST, itemID));
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
