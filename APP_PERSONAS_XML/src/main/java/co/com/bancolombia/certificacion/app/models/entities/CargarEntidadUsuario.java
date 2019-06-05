package co.com.bancolombia.certificacion.app.models.entities;


import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;

import java.util.List;

/**
 * The type Current user entity.
 */
public class CargarEntidadUsuario {

    private static User user = new User();

    private CargarEntidadUsuario() {
        throw new IllegalStateException(TipoClaseConstante.ENTITY_CLASS);
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public static User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param data the data
     */
    public static void conEstos(List<String> data) {
        user.setDocumentNumber(data.get(0));
        user.setDocumenType(data.get(1));
        user.setUsername(data.get(2));
        user.setPassword(data.get(3));
        user.setSecondPassword(data.get(4));
        if (data.size() > 5) {
            user.setEmail(data.get(5));
            user.setKeyStatus(data.get(6));
        }
    }
}