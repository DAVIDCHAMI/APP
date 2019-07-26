package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.backend.iseries.personas.usuario.BackRegistroAPP;
import co.com.bancolombia.backend.modelo.usuario.UsuarioRegistro;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class Registro {

    private static final Logger LOGGER = LogManager.getLogger(Registro.class.getName());

    public static UsuarioRegistro verifoEmailRegistrado() {
        Usuario user = EntidadUsuarioActual.getUsuario();
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(user.getNumeroDocumento());
        usuario.setTipoDocumento(user.getTipoDocumento());
        BackRegistroAPP registroAPP = new BackRegistroAPP();
        UsuarioRegistro consultaEmailRegister = null;

        try {
            consultaEmailRegister = registroAPP.consultarCorreoRegistro(usuario);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return consultaEmailRegister;

    }

    public Boolean verificoUsuarioVirtual() {
        boolean result = false;
        Usuario user = EntidadUsuarioActual.getUsuario();
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(user.getNumeroDocumento());
        usuario.setTipoDocumento(user.getTipoDocumento());

        BackRegistroAPP registroAPP = new BackRegistroAPP();
        UsuarioRegistro consultarRegistroVirtual = null;
        try {
            consultarRegistroVirtual = registroAPP.consultarUsuarioVirtual(usuario);
            if (user.getEstadoClave().equals(consultarRegistroVirtual.getStatusUser())) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public Boolean verificoTerminosYCondiciones() {
        Usuario user = EntidadUsuarioActual.getUsuario();
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(user.getNumeroDocumento());
        usuario.setTipoDocumento(user.getTipoDocumento());
        BackRegistroAPP registroAPP = new BackRegistroAPP();
        boolean result = false;
        try {
            boolean consultaTermConditional = registroAPP.consultarTerminosyCondicionesRegistro(usuario);
            if (consultaTermConditional) result = true;
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }
}
