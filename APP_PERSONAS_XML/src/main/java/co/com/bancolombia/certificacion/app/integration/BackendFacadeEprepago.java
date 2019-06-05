package co.com.bancolombia.certificacion.app.integration;

import co.com.bancolombia.certificacion.app.models.EPrepago;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.nousar.CreateLoadEPrepagoEntity;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.backend.iseries.transversal.productos.eprepago.BackTarjetaEPrepago;
import co.com.bancolombia.backend.modelo.productos.TarjetaEPrepago;
import co.com.bancolombia.backend.modelo.usuario.Usuario;
import net.serenitybdd.screenplay.Actor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class BackendFacadeEprepago {

    private static final Logger LOGGER = LogManager.getLogger(BackendFacade.class.getName());

    /**
     * Verify eprepago detail tarjeta e prepago.
     *
     * @return the tarjeta e prepago
     */
    public static TarjetaEPrepago verifyEprepagoDetail() {
        User user = CargarEntidadUsuario.getUser();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        usuario.setTipoDocumento(user.getDocumenType());
        usuario.setUsername(user.getUsername());
        usuario.setPassword(user.getPassword());
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

    /**
     * Verify eprepago state activation tarjeta e prepago.
     *
     * @return the boolean
     */
    public static boolean verifyEprepagoStateActivation() {
        boolean result = false;
        User user = CargarEntidadUsuario.getUser();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        usuario.setTipoDocumento(user.getDocumenType());
        usuario.setUsername(user.getUsername());
        usuario.setPassword(user.getPassword());
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago stateEprepago = null;
        try {
            stateEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (stateEprepago != null && AdministradorConstante.STATE_CARD_ACTIVE.equals(stateEprepago.getEstado())){
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Verify eprepago state activation tarjeta e prepago.
     *
     * @return the boolean
     */
    public static boolean verifyEprepagoStateInactivation() {
        boolean result = false;
        User user = CargarEntidadUsuario.getUser();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        usuario.setTipoDocumento(user.getDocumenType());
        usuario.setUsername(user.getUsername());
        usuario.setPassword(user.getPassword());
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago stateEprepago = null;
        try {
            stateEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (stateEprepago != null && AdministradorConstante.STATE_CARD_INACTIVE.equals(stateEprepago.getEstado())){
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Verify eprepago registry tarjeta e prepago.
     *
     * @return the tarjeta e prepago
     */
    public static TarjetaEPrepago verifyEprepagoRegistry() {
        User user = CargarEntidadUsuario.getUser();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago validarRegistroEprepago = null;
        try {
            validarRegistroEprepago = ePrepago.verifcarRegistroEprepago(user.getDocumentNumber());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return validarRegistroEprepago;
    }

    /**
     * Verify eprepago register boolean.
     *
     * @return the boolean
     */
    public static boolean verifyEprepagoRegister() {
        User user = CargarEntidadUsuario.getUser();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        boolean validarRegistroEprepago = false;
        try {
            validarRegistroEprepago = ePrepago.verificarRegistroEprepagoTarj(user.getDocumentNumber());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return validarRegistroEprepago;
    }

    /**
     * Verify existence eprepago boolean.
     *
     * @param actor the actor
     * @return the boolean
     */
    public boolean verifyExistenceEprepago(Actor actor) {
        boolean result = false;
        User user = CargarEntidadUsuario.getUser();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        TarjetaEPrepago existenceEprepago = null;

        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        try {
            Usuario usuario = new Usuario();
            usuario.setDocumento(user.getDocumentNumber());
            usuario.setTipoDocumento(user.getDocumenType());
            existenceEprepago = ePrepago.consultarDetalleEprepago(usuario, AdministradorConstante.CODIGO_BANCO_EPREPAGO);
            if (existenceEprepago != null
                    && AdministradorConstante.ALTERNATE.equalsIgnoreCase(configuracionTransaccion.getOrientationCase())
                    && AdministradorConstante.LABEL_NOT_EXIST.equalsIgnoreCase(configuracionTransaccion.getExpectedResult())) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Verify the credit of the card eprepago.
     *
     * @return the boolean
     */
    public static boolean verifyTheCreditOfTheCardEprepago(){
        boolean result = false;
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        DecimalFormat formatter = new DecimalFormat("##0");

        boolean verificarCreditoEprepago = validarCreditoEprepago(formatter.format(datosEprepago.getBalnceBefore()),
                formatter.format(datosEprepago.getBalanceAfter()),
                datosEprepago.getAmount().substring(1), configuracionTransaccion.getOrientationCase());

        if (verificarCreditoEprepago) {
            result = true;
        }
        return result;
    }

    /**
     * Verify the balances the credit the card eprepago.
     *
     * @return the boolean
     */
    public static boolean validarCreditoEprepago(String saldoAntes, String saldoDespues, String monto, String orientacion) {
        BigDecimal saldoAnterior = new BigDecimal(saldoAntes);
        BigDecimal saldoPosterior = new BigDecimal(saldoDespues);
        BigDecimal valorTransaccion = new BigDecimal(monto);
        return AdministradorConstante.SUCCESS.equalsIgnoreCase(orientacion) ? saldoAnterior.add(valorTransaccion).equals(saldoPosterior) : saldoAnterior.equals(saldoPosterior);
    }

    /**
     * Verify the balances the debit the card eprepago.
     *
     * @return the boolean
     */
    public static boolean validarDebitoEprepago(String saldoAntes, String saldoDespues, String monto, String orientacion) {
        BigDecimal saldoAnterior = new BigDecimal(saldoAntes);
        BigDecimal saldoPosterior = new BigDecimal(saldoDespues);
        BigDecimal valorTransaccion = new BigDecimal(monto);
        return AdministradorConstante.SUCCESS.equalsIgnoreCase(orientacion) ? saldoAnterior.subtract(valorTransaccion).equals(saldoPosterior) : saldoAnterior.equals(saldoPosterior);
    }


}
