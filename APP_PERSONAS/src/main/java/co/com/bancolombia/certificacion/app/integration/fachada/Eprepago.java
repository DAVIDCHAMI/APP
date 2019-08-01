package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.backend.iseries.transversal.productos.eprepago.BackTarjetaEPrepago;
import co.com.bancolombia.backend.modelo.productos.TarjetaEPrepago;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import net.serenitybdd.screenplay.Actor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Eprepago {

    private Eprepago() { throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD); }

    private static final Logger LOGGER = LogManager.getLogger(Eprepago.class.getName());

    public static TarjetaEPrepago verificoElDetalleDeLaEprepago() {
        Usuario user = EntidadUsuarioActual.getUsuario();
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(user.getNumeroDocumento());
        usuario.setTipoDocumento(user.getTipoDocumento());
        usuario.setUsername(user.getNombreUsuario());
        usuario.setPassword(user.getClave());
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago consultarDetalleEprepago = null;
        try {
            consultarDetalleEprepago = ePrepago.consultarDetalleEprepago(usuario,
                    AdministradorConstante.CODIGO_BANCO_EPREPAGO);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return consultarDetalleEprepago;
    }

    public static boolean verificoEstadoDeLaActivacionDeLaEprepago() {
        boolean result = false;
        Usuario user = EntidadUsuarioActual.getUsuario();
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(user.getNumeroDocumento());
        usuario.setTipoDocumento(user.getTipoDocumento());
        usuario.setUsername(user.getNombreUsuario());
        usuario.setPassword(user.getClave());
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago stateEprepago = null;
        try {
            stateEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (stateEprepago != null && AdministradorConstante.ESTADO_TARJETA_ACTIVA.equals(stateEprepago.getEstado())){
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public static boolean verificoEstadoDeLaInactivacionDeLaEprepago() {
        boolean result = false;
        Usuario user = EntidadUsuarioActual.getUsuario();
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(user.getNumeroDocumento());
        usuario.setTipoDocumento(user.getTipoDocumento());
        usuario.setUsername(user.getNombreUsuario());
        usuario.setPassword(user.getClave());
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago stateEprepago = null;
        try {
            stateEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (stateEprepago != null && AdministradorConstante.ESTADO_TARJETA_INACTIVA.equals(stateEprepago.getEstado())){
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    public static TarjetaEPrepago verificoElRegistroDeLaEprepago() {
        Usuario usuario = EntidadUsuarioActual.getUsuario();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago validarRegistroEprepago = null;
        try {
            validarRegistroEprepago = ePrepago.verifcarRegistroEprepago(usuario.getNumeroDocumento());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return validarRegistroEprepago;
    }

    public static boolean verificoRegistroDeLaEprepago() {
        Usuario usuario = EntidadUsuarioActual.getUsuario();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        boolean validarRegistroEprepago = false;
        try {
            validarRegistroEprepago = ePrepago.verificarRegistroEprepagoTarj(usuario.getNumeroDocumento());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return validarRegistroEprepago;
    }

    public boolean verificoExistenciaDeLaEprepago(Actor actor) {
        boolean result = false;
        Usuario user = EntidadUsuarioActual.getUsuario();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago existenceEprepago = null;

        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        try {
            co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
            usuario.setDocumento(user.getNumeroDocumento());
            usuario.setTipoDocumento(user.getTipoDocumento());
            existenceEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (existenceEprepago != null
                    && AdministradorConstante.ALTERNO.equalsIgnoreCase(configuracionTransaccion.getOrientacionCaso())
                    && AdministradorConstante.LABEL_NO_EXISTE.equalsIgnoreCase(configuracionTransaccion.getResultadoEsperado())) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    /*
    public static boolean verifyTheCreditOfTheCardEprepago(){
        boolean result = false;
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        DecimalFormat formatter = new DecimalFormat("##0");

        boolean verificarCreditoEprepago = validarCreditoEprepago(formatter.format(datosEprepago.getBalnceBefore()),
                formatter.format(datosEprepago.getBalanceAfter()),
                datosEprepago.getAmount().substring(1), configuracionTransaccion.getOrientacionCaso());

        if (verificarCreditoEprepago) {
            result = true;
        }
        return result;
    }
    */

    public static boolean validarCreditoEprepago(String saldoAntes, String saldoDespues, String monto, String orientacion) {
        BigDecimal saldoAnterior = new BigDecimal(saldoAntes);
        BigDecimal saldoPosterior = new BigDecimal(saldoDespues);
        BigDecimal valorTransaccion = new BigDecimal(monto);
        return AdministradorConstante.ACIERTO.equalsIgnoreCase(orientacion) ? saldoAnterior.add(valorTransaccion).equals(saldoPosterior) : saldoAnterior.equals(saldoPosterior);
    }

    public static boolean validarDebitoEprepago(String saldoAntes, String saldoDespues, String monto, String orientacion) {
        BigDecimal saldoAnterior = new BigDecimal(saldoAntes);
        BigDecimal saldoPosterior = new BigDecimal(saldoDespues);
        BigDecimal valorTransaccion = new BigDecimal(monto);
        return AdministradorConstante.ACIERTO.equalsIgnoreCase(orientacion) ? saldoAnterior.subtract(valorTransaccion).equals(saldoPosterior) : saldoAnterior.equals(saldoPosterior);
    }
}
