package co.com.bancolombia.certificacion.app.models.entitidades;


import co.com.bancolombia.certificacion.app.models.usuario.Usuario;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante.AUTENTICACION_CODIGO_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_ENTIDAD;

/**
 * The type Current usuario entity.
 */
public class EntidadUsuarioActual {

    private static Usuario usuario = new Usuario();

    private EntidadUsuarioActual() {
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

        //Se movio el vecto toca ajustarlo
        usuario.setTipoDocumento(data.get(5));
        usuario.setNumeroDocumento(data.get(6));
        usuario.setSegundaClave(data.get(7));

        String codigoTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion().getCodigoTransaccion();

        if (AUTENTICACION_CODIGO_TRANSACCION.equalsIgnoreCase(codigoTransaccion)) {
           usuario.setPrimeraPregunta(data.get(3));
            usuario.setEstadoClave(data.get(4));
        }
    }

    public static void setUsuarioYClave(String nombreUsuario, String clave) {
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setClave(clave);
    }
}