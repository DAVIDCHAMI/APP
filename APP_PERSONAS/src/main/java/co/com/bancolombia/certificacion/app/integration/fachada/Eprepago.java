package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.backend.iseries.transversal.productos.eprepago.BackTarjetaEPrepago;
import co.com.bancolombia.backend.modelo.productos.TarjetaEPrepago;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import net.serenitybdd.screenplay.Actor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.SQLException;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;

public class Eprepago {

    public Eprepago() { throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD); }

    private static final Logger LOGGER = LogManager.getLogger(Eprepago.class.getName());

    public static TarjetaEPrepago verificoElDetalleDeLaEprepago(Actor actor) {
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(datosPrincipales.getUsuario().getNumeroDocumento());
        usuario.setTipoDocumento(datosPrincipales.getUsuario().getTipoDocumento());
        usuario.setUsername(datosPrincipales.getUsuario().getNombreUsuario());
        usuario.setPassword(datosPrincipales.getUsuario().getClave());
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

    public static boolean verificoEstadoDeLaActivacionDeLaEprepago(Actor actor) {
        boolean result = false;
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(datosPrincipales.getUsuario().getNumeroDocumento());
        usuario.setTipoDocumento(datosPrincipales.getUsuario().getTipoDocumento());
        usuario.setUsername(datosPrincipales.getUsuario().getNombreUsuario());
        usuario.setPassword(datosPrincipales.getUsuario().getClave());
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

    public static boolean verificoEstadoDeLaInactivacionDeLaEprepago(Actor actor) {
        boolean result = false;
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
        usuario.setDocumento(datosPrincipales.getUsuario().getNumeroDocumento());
        usuario.setTipoDocumento(datosPrincipales.getUsuario().getTipoDocumento());
        usuario.setUsername(datosPrincipales.getUsuario().getNombreUsuario());
        usuario.setPassword(datosPrincipales.getUsuario().getClave());
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

    public static TarjetaEPrepago verificoElRegistroDeLaEprepago(Actor actor) {
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago validarRegistroEprepago = null;
        try {
            validarRegistroEprepago = ePrepago.verifcarRegistroEprepago(datosPrincipales.getUsuario().getNumeroDocumento());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return validarRegistroEprepago;
    }

    public static boolean verificoRegistroDeLaEprepago(Actor actor) {
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        boolean validarRegistroEprepago = false;
        try {
            validarRegistroEprepago = ePrepago.verificarRegistroEprepagoTarj(datosPrincipales.getUsuario().getNumeroDocumento());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return validarRegistroEprepago;
    }

    public boolean verificoExistenciaDeLaEprepago(Actor actor) {
        boolean result = false;
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago existenceEprepago = null;

        try {
            co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
            usuario.setDocumento(datosPrincipales.getUsuario().getNumeroDocumento());
            usuario.setTipoDocumento(datosPrincipales.getUsuario().getTipoDocumento());
            existenceEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (existenceEprepago != null
                    && AdministradorConstante.ALTERNO.equalsIgnoreCase(datosPrincipales.getOrientacionCaso())
                    && AdministradorConstante.LABEL_NO_EXISTE.equalsIgnoreCase(datosPrincipales.getResultadoEsperado())) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

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
