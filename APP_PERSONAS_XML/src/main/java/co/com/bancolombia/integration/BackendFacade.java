package co.com.bancolombia.integration;

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
import co.com.bancolombia.models.Deposit;
import co.com.bancolombia.models.EPrepago;
import co.com.bancolombia.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.models.entities.CurrentUserEntity;
import co.com.bancolombia.models.entities.VirtualInvestmentEntity;
import co.com.bancolombia.models.nousar.CreateDepositEntity;
import co.com.bancolombia.models.nousar.CreateLoadEPrepagoEntity;
import co.com.bancolombia.models.nousar.CreateTermsAndConditionsEntity;
import co.com.bancolombia.models.products.VirtualInvestment;
import co.com.bancolombia.models.transaction.TransactionConfig;
import co.com.bancolombia.models.user.User;
import co.com.bancolombia.utilities.constant.ConstantsManager;
import co.com.bancolombia.utilities.managers.QueryManager;
import net.serenitybdd.core.Serenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.backend.utilidades.enums.CanalesSistemas.*;
import static co.com.bancolombia.utilities.UtilityManager.castTypeAccountLetter;

/**
 * The type Backend integration.
 */
public class BackendFacade {
    /**
     * The constant deposit.
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
        User user = CurrentUserEntity.getUser();
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
        CuentaDeposito cuentaDeposito = CreateDepositEntity.getDepositValues();
        cuentaDeposito.setTipo(castTypeAccountLetter(cuentaDeposito.getTipo()));
        BackSaldosDeposito saldosDeposito = new BackSaldosDeposito();
        deposit.setBalanceBefore(Double.valueOf(saldosDeposito.consultarSaldo(cuentaDeposito).getSaldoTotal()));
    }

    /**
     * Balance deposit after.
     *
     * @throws SQLException the sql exception
     */
    public static void balanceDepositAfter() throws SQLException {
        CuentaDeposito cuentaDeposito = CreateDepositEntity.getDepositValues();
        BackSaldosDeposito saldosDeposito = new BackSaldosDeposito();
        deposit.setBalanceAfter(Double.valueOf(saldosDeposito.consultarSaldo(cuentaDeposito).getSaldoTotal()));
    }

    /**
     * Verify channel log boolean.
     *
     * @return the boolean
     */
    public boolean verifyChannelLog() {
        User user = CurrentUserEntity.getUser();
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        BackTrace backTrace = new BackTrace();
        String trace = "";
        String numDocu = user.getDocumentNumber();
        String codTrans = transactionConfig.getTransactionCode();
        String horaConsulta = "";
        LogCanal logCanal = new LogCanal();
        String ruta = transactionConfig.getLogCanalPath();

        logCanal.setRutaEvidencia(transactionConfig.getEvidencePath());
        logCanal.setCodigoTransaccion(codTrans);
        logCanal.setDocumento(numDocu);
        logCanal.setTipoDocumento(user.getDocumenType());
        logCanal.setCodigoError(transactionConfig.getErrorCode());
        logCanal.setCasoId(transactionConfig.getIdCase());
        logCanal.setFecha(DateManager.obtenerFechaSistema("yyyyMMdd"));
        logCanal.setTipoCanal(transactionConfig.getTypeLogCanal());
        boolean resultInput = false;
        boolean resultOutput = false;
        try {
            horaConsulta = DateManager.obtenerFechaSistema("hhmmss");
            Usuario usuario = new Usuario();
            usuario.setDocumento(user.getDocumentNumber());
            Transaccion transaccion = new Transaccion();
            transaccion.setCodigoTransaccion(CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionCode());
            transaccion.setHoraTransaccion(horaConsulta);
            trace = backTrace.consultarTrace(usuario, transaccion, WWW);
            logCanal.setTrace(trace);
            BackLogCanal backLogCanal = new BackLogCanal(logCanal, ruta, transactionConfig.getEvidenceName());
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
        User user = CurrentUserEntity.getUser();
        String claveDinamica = "";
        BackClaveDinamica backClaveDinamica = new BackClaveDinamica();
        Usuario usuario = new Usuario();
        usuario.setDocumento(user.getDocumentNumber());
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionHour());
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
        User user = CurrentUserEntity.getUser();
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
        User user = CurrentUserEntity.getUser();
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
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        BackSistema backIdSistema = new BackSistema();
        BackTef backTef = new BackTef();
        boolean result = false;

        Producto productoOrigen = new Producto();
        productoOrigen.setNumero(ePrepago.getOriginAccount().replace("-",""));
        Producto productoDestino = new Producto();
        Transaccion transaccion = new Transaccion();
        LogTef verifyTEF = new LogTef();
        Tef verifyMOVTEF = new Tef();

        transaccion.setCodigoTransaccion(transactionConfig.getTransactionCode());

        String registroMovtf = backIdSistema.consultarIdSistema(productoOrigen, productoDestino, transaccion);
        Transaccion transaccionTef = new Transaccion();
        transaccionTef.setCodigoSistema(registroMovtf);

        if (registroMovtf != null){
            verifyMOVTEF = backTef.consultarMovTef(transaccionTef, EPP);
            verifyTEF = backTef.consultarLogTf(registroMovtf, ConstantsManager.CHANNEL_EPP);
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
        User user = CurrentUserEntity.getUser();
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
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        Transaccion transaccion = new Transaccion();
        DecimalFormat formatter = new DecimalFormat("##0");
        transaccion.setValorTransaccion(datosEprepago.getAmount().substring(1));
        transaccion.setOrientacionCaso(transactionConfig.getOrientationCase());

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


    public static boolean verifyTheDebitOfTheBalanceV(){
        boolean result = false;
        BackSaldosDeposito verifySaldosDeposito = new BackSaldosDeposito();
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        VirtualInvestment investment = VirtualInvestmentEntity.getVirtualInvestment();
        Transaccion transaccion = new Transaccion();
        DecimalFormat formatter = new DecimalFormat("##0");

        if (ConstantsManager.TRANSACTION_CODE_OPENING_VIRTUAL_INVESTMENT.equals(transactionConfig.getTransactionCode())||
                ConstantsManager.TRANSACTION_CODE_SIMULATION_VIRTUAL_INVESTMENT.equals(transactionConfig.getTransactionCode())) {

            transaccion.setValorTransaccion(investment.getInvestmentValue());
        }else{transaccion.setValorTransaccion(datosEprepago.getAmount().substring(1));}


        transaccion.setOrientacionCaso(transactionConfig.getOrientationCase());

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
        TransactionConfig transactionConfig = CurrentTrasactionConfigEntity.getTransactionConfig();
        Transaccion transaccion = new Transaccion();
        DecimalFormat formatter = new DecimalFormat("##0");
        transaccion.setValorTransaccion(datosEprepago.getAmount().substring(1));
        transaccion.setOrientacionCaso(transactionConfig.getOrientationCase());
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
    public static boolean verifyTheMovementsDeposit() throws SQLException {
        boolean result = false;

        BackMovimientos verifyMovimientos = new BackMovimientos();
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionHour());
        CuentaDeposito cuentaDeposito = CreateDepositEntity.getDepositValues();
        EPrepago datosEprepago = CreateLoadEPrepagoEntity.getLoadEPrepago();
        String naturaleza="";
        ValorEquivalenciaMovimiento datosMovimientos= null;

        if (ConstantsManager.CODE_TRANSATION_LOAD.equals(CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionCode())){
             datosMovimientos = new ValorEquivalenciaMovimiento(ConstantsManager.LOAD_MOVEMENTS_CODE
                    ,ConstantsManager.DESCRIPTION_CARGA_APP);
            datosMovimientos.setStrMovCodTrn(ConstantsManager.LOAD_MOVEMENTS_CODE);
            datosMovimientos.setStrMovDescrip(ConstantsManager.DESCRIPTION_CARGA_APP);
            naturaleza = ConstantsManager.NATURE_DEBIT;
        }

        if (ConstantsManager.CODE_TRANSATION_DISBURSEMENT.equals(CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionCode())){
             datosMovimientos = new ValorEquivalenciaMovimiento(ConstantsManager.LOAD_MOVEMENTS_CODE
                    ,ConstantsManager.DESCRIPTION_DESCARGA_APP);
            datosMovimientos.setStrMovCodTrn(ConstantsManager.DISBURSEMENT_MOVEMENTS_CODE);
            datosMovimientos.setStrMovDescrip(ConstantsManager.DESCRIPTION_DESCARGA_APP);
            naturaleza = ConstantsManager.NATURE_CREDIT;
        }

        Movimiento verificarMOVIMIENTO = verifyMovimientos.consultarMovimiento(cuentaDeposito.getNumero(),cuentaDeposito.getTipoNum(),
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
        User user = CurrentUserEntity.getUser();
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
            transaccion.setCodigoTransaccion(CurrentTrasactionConfigEntity.getTransactionConfig().getTransactionCode());
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
