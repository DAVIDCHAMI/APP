package co.com.bancolombia.certificacion.app.integration;

import co.com.bancolombia.certificacion.app.models.Deposit;
import co.com.bancolombia.certificacion.app.models.EPrepago;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadDepositos;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadInversionVirtual;
import co.com.bancolombia.certificacion.app.models.nousar.CreateDepositEntity;
import co.com.bancolombia.certificacion.app.models.nousar.CreateLoadEPrepagoEntity;
import co.com.bancolombia.certificacion.app.models.nousar.CreateTermsAndConditionsEntity;
import co.com.bancolombia.certificacion.app.models.products.VirtualInvestment;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilidades.UtilityManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.backend.iseries.personas.clavedinamica.BackClaveDinamica;
import co.com.bancolombia.backend.iseries.transversal.control.terminoscondiciones.BackTerminosCondiciones;
import co.com.bancolombia.backend.iseries.transversal.crediagil.BackCrediAgil;
import co.com.bancolombia.backend.iseries.transversal.log.canal.BackLogCanal;
import co.com.bancolombia.backend.iseries.transversal.log.trace.BackTrace;
import co.com.bancolombia.backend.iseries.transversal.movimientos.dao.BackMovimientos;
import co.com.bancolombia.backend.iseries.transversal.movimientos.dto.Movimiento;
import co.com.bancolombia.backend.iseries.transversal.movimientos.dto.ValorEquivalenciaMovimiento;
import co.com.bancolombia.backend.iseries.transversal.productos.eprepago.BackTarjetaEPrepago;
import co.com.bancolombia.backend.iseries.transversal.saldos.BackSaldosDeposito;
import co.com.bancolombia.backend.iseries.transversal.sistema.BackSistema;
import co.com.bancolombia.backend.iseries.transversal.tef.BackTef;
import co.com.bancolombia.backend.iseries.transversal.tef.dto.LogTef;
import co.com.bancolombia.backend.modelo.control.canalsti.LogCanal;
import co.com.bancolombia.backend.modelo.productos.CrediAgil;
import co.com.bancolombia.backend.modelo.productos.CuentaDeposito;
import co.com.bancolombia.backend.modelo.productos.Producto;
import co.com.bancolombia.backend.modelo.transversal.Saldo;
import co.com.bancolombia.backend.modelo.transversal.Tef;
import co.com.bancolombia.backend.modelo.transversal.TerminosyCondiciones;
import co.com.bancolombia.backend.modelo.transversal.Transaccion;
import co.com.bancolombia.backend.modelo.usuario.Usuario;
import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;
import net.serenitybdd.core.Serenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.backend.utilidades.enums.CanalesSistemas.*;
import static co.com.bancolombia.certificacion.app.utilidades.UtilityManager.*;

/**
 * The type Backend integration.
 */
public class BackendFacade {
    /**
     * The constantes deposit.
     */
    public static final Deposit deposit = new Deposit();
    private static final Logger LOGGER = LogManager.getLogger(BackendFacade.class.getName());

    /**
     * Verify credi agil detail credi agil.
     *
     * @return the credi agil
     * @throws SQLException the sql exception
     */
    public static CrediAgil verifyCrediAgilDetail() throws SQLException {
        User user = CargarEntidadUsuario.getUser();
        BackCrediAgil crediAgil = new BackCrediAgil();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        return crediAgil.consultarDetalleCrediagil(usuario);
    }

    /**
     * Balance deposit before.
     *
     * @throws SQLException the sql exception
     */
    public static void balanceDepositBefore() throws SQLException {
        Deposit cuentaDeposito = CargarEntidadDepositos.getDeposit();
        CuentaDeposito depositos = new CuentaDeposito();
        depositos.setTipo(castTypeAccountLetter(cuentaDeposito.getTypeAccount()));
        depositos.setNumero(cuentaDeposito.getAccount());
        BackSaldosDeposito saldosDeposito = new BackSaldosDeposito();
        deposit.setBalanceBefore(Double.valueOf(saldosDeposito.consultarSaldo(depositos).getSaldoTotal()));
    }

    /**
     * Balance deposit after.
     *
     * @throws SQLException the sql exception
     */
    public static void balanceDepositAfter() throws SQLException {
        Deposit cuentaDeposito = CargarEntidadDepositos.getDeposit();
        CuentaDeposito depositos = new CuentaDeposito();
        depositos.setTipo(castTypeAccountLetter(cuentaDeposito.getTypeAccount()));
        depositos.setNumero(cuentaDeposito.getAccount());
        BackSaldosDeposito saldosDeposito = new BackSaldosDeposito();
        deposit.setBalanceAfter(Double.valueOf(saldosDeposito.consultarSaldo(depositos).getSaldoTotal()));
    }

    /**
     * Verify channel log boolean.
     *
     * @return the boolean
     */
    public boolean verifyChannelLog() {
        User user = CargarEntidadUsuario.getUser();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        BackTrace backTrace = new BackTrace();
        String trace = "";
        String numDocu = user.getDocumentNumber();
        String codTrans = configuracionTransaccion.getTransactionCode();
        String horaConsulta = "";
        LogCanal logCanal = new LogCanal();
        String ruta = configuracionTransaccion.getLogCanalPath();

        logCanal.setRutaEvidencia(configuracionTransaccion.getEvidencePath());
        logCanal.setCodigoTransaccion(codTrans);
        logCanal.setDocumento(numDocu);
        logCanal.setTipoDocumento(user.getDocumenType());
        logCanal.setCodigoError(configuracionTransaccion.getErrorCode());
        logCanal.setCasoId(configuracionTransaccion.getIdCase());
        logCanal.setFecha(DateManager.obtenerFechaSistema("yyyyMMdd"));
        logCanal.setTipoCanal(configuracionTransaccion.getTypeLogCanal());
        boolean resultInput = false;
        boolean resultOutput = false;
        try {
            horaConsulta = DateManager.obtenerFechaSistema("hhmmss");
            Usuario usuario = new Usuario();
            usuario.setDocumento(user.getDocumentNumber());
            Transaccion transaccion = new Transaccion();
            transaccion.setCodigoTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode());
            transaccion.setHoraTransaccion(horaConsulta);
            trace = backTrace.consultarTrace(usuario, transaccion, WWW);
            logCanal.setTrace(trace);
            BackLogCanal backLogCanal = new BackLogCanal(logCanal, ruta, configuracionTransaccion.getEvidenceName());
            resultInput = backLogCanal.verificarLogCanal("TramaInput");
            resultOutput = backLogCanal.verificarLogCanal("TramaOutput");
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return resultInput && resultOutput;
    }

    /**
     * Consultar clave dinamica string.
     *
     * @return the string
     */
    public String consultarClaveDinamica() {
        User user = CargarEntidadUsuario.getUser();
        String claveDinamica = "";
        BackClaveDinamica backClaveDinamica = new BackClaveDinamica();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionHour());
        try {
            claveDinamica = backClaveDinamica.consultarClaveDinamica(usuario, transaccion, BLP);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return claveDinamica;
    }

    /**
     * Consultar clave dinamica ii string.
     *
     * @return the string
     */
    public String consultarClaveDinamicaII() {
        User user = CargarEntidadUsuario.getUser();
        String claveDinamica = "";
        BackClaveDinamica backClaveDinamica = new BackClaveDinamica();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        try {
            claveDinamica = backClaveDinamica.consultarClaveDinamicaAlterna(usuario);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return claveDinamica;
    }

    /**
     * Verify topes personalizados pccffppcli boolean.
     *
     * @return the boolean
     */
    public boolean verifyTopesPersonalizadosPCCFFPPCLI() {
        boolean result = false;
        User user = CargarEntidadUsuario.getUser();
        BackTarjetaEPrepago ePrepago = new BackTarjetaEPrepago();
        try {
            boolean registroPCCFFPPCLI = ePrepago.verificarRegistroEprepagoTarj(user.getDocumentNumber());
            if (registroPCCFFPPCLI) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Verify movtf logtf boolean.
     *
     * @return the boolean
     * @throws SQLException the sql exception
     */
    public static Boolean verifyMovtfLogtf() throws SQLException {
        EPrepago ePrepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        BackSistema backIdSistema = new BackSistema();
        BackTef backTef = new BackTef();
        boolean result = false;

        Producto productoOrigen = new Producto();
        productoOrigen.setNumero(ePrepago.getOriginAccount().replace("-",""));
        Producto productoDestino = new Producto();
        Transaccion transaccion = new Transaccion();
        LogTef verifyTEF = new LogTef();
        Tef verifyMOVTEF = new Tef();

        transaccion.setCodigoTransaccion(configuracionTransaccion.getTransactionCode());

        String registroMovtf = backIdSistema.consultarIdSistema(productoOrigen, productoDestino, transaccion);
        Transaccion transaccionTef = new Transaccion();
        transaccionTef.setCodigoSistema(registroMovtf);

        if (registroMovtf != null){
            verifyMOVTEF = backTef.consultarMovTef(transaccionTef, EPP);
            verifyTEF = backTef.consultarLogTf(registroMovtf, AdministradorConstante.CHANNEL_EPP);
        }

        if (verifyTEF != null && verifyMOVTEF != null) {
            result = true;
        }
        return result;
    }

    /**
     * Validate terms and condition boolean.
     *
     * @return the boolean
     */
    public Boolean validateTermsAndCondition() {
        boolean result = false;
        User user = CargarEntidadUsuario.getUser();
        EPrepago ePrepago = CreateTermsAndConditionsEntity.getTyCEPrepago();
        BackTerminosCondiciones backTerminosCondiciones = new BackTerminosCondiciones();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        try {
            TerminosyCondiciones terminosyCondiciones = backTerminosCondiciones.verificarTerminosyCondiciones(usuario);
            String fechaSistema = DateManager.obtenerFechaSistema("YYMMdd");
            if (ePrepago.getTyc().equals(terminosyCondiciones.getVersionTermCond()) && fechaSistema.equals(terminosyCondiciones.getFecha())) {
                result = true;
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;

    }
    
    /**
     * Verify the debit of the balance.
     *
     * @return the boolean
     */
    public static boolean verifyTheDebitOfTheBalance(){
        boolean result = false;
        BackSaldosDeposito verifySaldosDeposito = new BackSaldosDeposito();
        Deposit deposito = CargarEntidadDepositos.getDeposit();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        VirtualInvestment investment = CargarEntidadInversionVirtual.getVirtualInvestment();
        Transaccion transaccion = new Transaccion();
        DecimalFormat formatter = new DecimalFormat("##0");

        if (AdministradorConstante.TRANSACTION_CODE_OPENING_VIRTUAL_INVESTMENT.equals(configuracionTransaccion.getTransactionCode())||
                AdministradorConstante.TRANSACTION_CODE_SIMULATION_VIRTUAL_INVESTMENT.equals(configuracionTransaccion.getTransactionCode())) {

            transaccion.setValorTransaccion(investment.getInvestmentValue());
        }else{transaccion.setValorTransaccion(deposito.getBalance().toString());}


        transaccion.setOrientacionCaso(configuracionTransaccion.getOrientationCase());

        Saldo saldosAntesDebito = new Saldo();
        saldosAntesDebito.setSaldoDisponible(formatter.format(deposit.getBalanceBefore()));
        Saldo saldosDespuesDebito = new Saldo();
        saldosDespuesDebito.setSaldoDisponible(formatter.format(deposit.getBalanceAfter()));

        boolean verificarDEBITO = verifySaldosDeposito.validarDebitoDeposito(saldosAntesDebito, saldosDespuesDebito, transaccion);
        if (verificarDEBITO) {
            result = true;
        }
        return result;
    }
    
    /**
     * Verify the Credit of the balance.
     *
     * @return the boolean
     */
    public static boolean verifyTheCreditOfTheBalance(){
        boolean result = false;
        BackSaldosDeposito verifySaldosDeposito = new BackSaldosDeposito();
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        Transaccion transaccion = new Transaccion();
        DecimalFormat formatter = new DecimalFormat("##0");
        transaccion.setValorTransaccion(datosEprepago.getAmount().substring(1));
        transaccion.setOrientacionCaso(configuracionTransaccion.getOrientationCase());
        Saldo saldosAntesDebito = new Saldo();
        saldosAntesDebito.setSaldoDisponible(formatter.format(deposit.getBalanceBefore()));
        Saldo saldosDespuesDebito = new Saldo();
        saldosDespuesDebito.setSaldoDisponible(formatter.format(deposit.getBalanceAfter()));

        boolean verificarCREDIT = verifySaldosDeposito.validarCreditoDeposito(saldosAntesDebito, saldosDespuesDebito, transaccion);
        if (verificarCREDIT) {
            result = true;
        }
        return result;
    }
    
    /**
     * Verify the movement of the balance.
     *
     * @return the boolean
     */
    public static boolean verifyTheMovementsDebitDeposit() throws SQLException {
        boolean result = false;

        Deposit cuentaDeposito = CargarEntidadDepositos.getDeposit();
        BackMovimientos verifyMovimientos = new BackMovimientos();
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionHour());

        //CuentaDeposito cuentaDeposito = CreateDepositEntity.getDepositValues();
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        String naturaleza="";
        ValorEquivalenciaMovimiento datosMovimientos= null;

        if (AdministradorConstante.CODE_TRANSATION_LOAD.equals(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode())){
             datosMovimientos = new ValorEquivalenciaMovimiento(AdministradorConstante.LOAD_MOVEMENTS_CODE
                    , AdministradorConstante.DESCRIPTION_CARGA_APP);
            datosMovimientos.setStrMovCodTrn(AdministradorConstante.LOAD_MOVEMENTS_CODE);
            datosMovimientos.setStrMovDescrip(AdministradorConstante.DESCRIPTION_CARGA_APP);
            naturaleza = AdministradorConstante.NATURE_DEBIT;
        }

        if (AdministradorConstante.CODE_TRANSATION_DISBURSEMENT.equals(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode())){
             datosMovimientos = new ValorEquivalenciaMovimiento(AdministradorConstante.LOAD_MOVEMENTS_CODE
                    , AdministradorConstante.DESCRIPTION_DESCARGA_APP);
            datosMovimientos.setStrMovCodTrn(AdministradorConstante.DISBURSEMENT_MOVEMENTS_CODE);
            datosMovimientos.setStrMovDescrip(AdministradorConstante.DESCRIPTION_DESCARGA_APP);
            naturaleza = AdministradorConstante.NATURE_CREDIT;
        }

        Movimiento verificarMOVIMIENTO = verifyMovimientos.consultarMovimiento(cuentaDeposito.getAccount(),castTypeAccountNumber(cuentaDeposito.getTypeAccount()),
                datosEprepago.getAmount(),naturaleza,transaccion.getHoraTransaccion(),datosMovimientos);
        if (verificarMOVIMIENTO != null) {
            result = true;
        }
        return result;
    }

    /**
     * Verify the movement of the balance.
     *
     * @return the boolean
     */
    public static boolean verifyTheMovementsCreditDeposit() throws SQLException {
        boolean result = false;

        Deposit cuentaDeposito = CargarEntidadDepositos.getDeposit();
        BackMovimientos verifyMovimientos = new BackMovimientos();
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionHour());

        //CuentaDeposito cuentaDeposito = CreateDepositEntity.getDepositValues();
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        String naturaleza="";
        ValorEquivalenciaMovimiento datosMovimientos= null;

        if (AdministradorConstante.CODE_TRANSATION_LOAD.equals(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode())){
            datosMovimientos = new ValorEquivalenciaMovimiento(AdministradorConstante.LOAD_MOVEMENTS_CODE
                    , AdministradorConstante.DESCRIPTION_CARGA_APP);
            datosMovimientos.setStrMovCodTrn(AdministradorConstante.LOAD_MOVEMENTS_CODE);
            datosMovimientos.setStrMovDescrip(AdministradorConstante.DESCRIPTION_CARGA_APP);
            naturaleza = AdministradorConstante.NATURE_DEBIT;
        }

        if (AdministradorConstante.CODE_TRANSATION_DISBURSEMENT.equals(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode())){
            datosMovimientos = new ValorEquivalenciaMovimiento(AdministradorConstante.LOAD_MOVEMENTS_CODE
                    , AdministradorConstante.DESCRIPTION_DESCARGA_APP);
            datosMovimientos.setStrMovCodTrn(AdministradorConstante.DISBURSEMENT_MOVEMENTS_CODE);
            datosMovimientos.setStrMovDescrip(AdministradorConstante.DESCRIPTION_DESCARGA_APP);
            naturaleza = AdministradorConstante.NATURE_CREDIT;
        }

        Movimiento verificarMOVIMIENTO = verifyMovimientos.consultarMovimiento(cuentaDeposito.getAccount(),castTypeAccountNumber(cuentaDeposito.getTypeAccount()),
                datosEprepago.getAmount(),naturaleza,transaccion.getHoraTransaccion(),datosMovimientos);
        if (verificarMOVIMIENTO != null) {
            result = true;
        }
        return result;
    }

    /**
     * Verify channel log Plot 0220 boolean.
     *
     * @return the boolean
     */
    public static void consultChannelLogPlot220230() {
        Map<String, Object> dataForQuery = new HashMap<>();
        User user = CargarEntidadUsuario.getUser();
        BackTrace backTrace = new BackTrace();
        String trace = "";
        String horaConsulta = "";
        String trama0220 = "";
        String trama0230 = "";
        try {
            horaConsulta = DateManager.obtenerFechaSistema("hhmmss");
            Usuario usuario = new Usuario();
            usuario.setDocumento(user.getDocumentNumber());
            Transaccion transaccion = new Transaccion();
            transaccion.setCodigoTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getTransactionCode());
            transaccion.setHoraTransaccion(horaConsulta);
            trace = backTrace.consultarTrace(usuario, transaccion, WWW);
            Serenity.setSessionVariable("trace").to(trace);

            dataForQuery.put("TRACE", trace);
            String sql = QueryManager.CONSULTAS_APP.getString("SQL.COMFFLGWWW.tramaDatos_0220_0230");
            List<Map<String, Object>> listOfFounded = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
            trama0220 = listOfFounded.get(0).toString().replace("datos=","");
            trama0230 = listOfFounded.get(1).toString().replace("datos=","");
            Serenity.setSessionVariable("trama0220LogCanal").to(trama0220);
            Serenity.setSessionVariable("trama0230LogCanal").to(trama0230);
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
