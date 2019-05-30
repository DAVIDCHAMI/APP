package co.com.bancolombia.integration;

import co.com.bancolombia.backend.iseries.personas.usuario.BackRegistroAPP;
import co.com.bancolombia.backend.modelo.usuario.Usuario;
import co.com.bancolombia.backend.modelo.usuario.UsuarioRegistro;
import co.com.bancolombia.models.entities.CurrentUserEntity;
import co.com.bancolombia.models.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class BackendFacadeRegistration {


    /**
     * The type Backend integration.
     */

    private static final Logger LOGGER = LogManager.getLogger(BackendFacadeRegistration.class.getName());

    /**
     * Verify email register.
     *
     * @return the email of gegister
     */


    public static UsuarioRegistro verifyEmailRegister() {
        User user = CurrentUserEntity.getUser();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        usuario.setTipoDocumento(user.getDocumenType());
        BackRegistroAPP registroAPP = new BackRegistroAPP();
        UsuarioRegistro consultaEmailRegister = null;

        try {
            consultaEmailRegister = registroAPP.consultarCorreoRegistro(usuario);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return consultaEmailRegister;

    }

    /**
     * Verify email register.
     *
     * @return the email of gegister
     */


    public Boolean verifyUserVirtual() {
        boolean result = false;
        User user = CurrentUserEntity.getUser();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        usuario.setTipoDocumento(user.getDocumenType());

        BackRegistroAPP registroAPP = new BackRegistroAPP();
        UsuarioRegistro consultarRegistroVirtual = null;
        try {
            consultarRegistroVirtual = registroAPP.consultarUsuarioVirtual(usuario);
            if (user.getKeyStatus().equals(consultarRegistroVirtual.getStatusUser())) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public Boolean verifyTermCond() {
        User user = CurrentUserEntity.getUser();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        usuario.setTipoDocumento(user.getDocumenType());
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
