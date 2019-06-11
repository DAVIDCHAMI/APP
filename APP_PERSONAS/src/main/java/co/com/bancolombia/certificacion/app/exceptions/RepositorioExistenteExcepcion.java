package co.com.bancolombia.certificacion.app.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

/**
 * The type Repository already exists exception.
 */
public class RepositorioExistenteExcepcion extends SerenityManagedException {

    private static final String MENSAJE_CON_FORMATO = "El repositorio llamado %s ya existe";

    /**
     * Instantiates a new Repository already exists exception.
     *
     * @param nombreRepositorio     the name repository
     * @param excepcion the test error exception
     */
    public RepositorioExistenteExcepcion(String nombreRepositorio, Throwable excepcion) {
        super(String.format(MENSAJE_CON_FORMATO, nombreRepositorio), excepcion);
    }

}
