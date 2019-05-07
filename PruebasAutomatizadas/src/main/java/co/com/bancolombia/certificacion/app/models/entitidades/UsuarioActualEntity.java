package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.usuario.Usuario;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.AUTENTICACION_TIPO_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilities.constantes.TipoClaseConstante.CLASE_ENTIDAD;

/**
 * The type Current usuario entity.
 */
public class UsuarioActualEntity {

    private static Usuario usuario = new Usuario();

    private UsuarioActualEntity() {
        throw new IllegalStateException(CLASE_ENTIDAD);
    }

    /**
     * Gets usuario.
     *
     * @return the usuario
     */
    public static Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets usuario.
     *
     * @param data the transaccionCon
     */
    public static void setUsuario(List<String> data) {
        usuario.setNumeroDocumento(data.get(0));
        usuario.setTipoDocumento(data.get(1));
        usuario.setNombreUsuario(data.get(2));
        usuario.setClave(data.get(3));
        usuario.setSegundaClave(data.get(4));

        String tipoTransaccion = ConfiguracionTransaccionActualEntity.getConfiguracionTransaccion().getTipoTransaccion();

        if (AUTENTICACION_TIPO_TRANSACCION.equalsIgnoreCase(tipoTransaccion)) {
           usuario.setPrimeraPregunta(data.get(5));
            usuario.setEstadoClave(data.get(6));
        }
    }
}