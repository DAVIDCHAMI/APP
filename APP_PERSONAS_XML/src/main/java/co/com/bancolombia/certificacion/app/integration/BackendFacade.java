package co.com.bancolombia.certificacion.app.integration;

import co.com.bancolombia.backend.iseries.personas.clavedinamica.BackClaveDinamica;
import co.com.bancolombia.backend.iseries.transversal.control.terminoscondiciones.BackTerminosCondiciones;
import co.com.bancolombia.backend.iseries.transversal.crediagil.BackCrediAgil;
import co.com.bancolombia.backend.iseries.transversal.log.trace.BackTrace;
import co.com.bancolombia.backend.iseries.transversal.productos.eprepago.BackTarjetaEPrepago;
import co.com.bancolombia.backend.modelo.productos.CrediAgil;
import co.com.bancolombia.backend.modelo.transversal.TerminosyCondiciones;
import co.com.bancolombia.backend.modelo.transversal.Transaccion;
import co.com.bancolombia.backend.modelo.usuario.Usuario;
import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadDepositos;
import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadTransferencias;
import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.entidades.eprepago.CreateTermsAndConditionsEntity;
import co.com.bancolombia.certificacion.app.models.productos.CuentaDeposito;
import co.com.bancolombia.certificacion.app.models.productos.EPrepago;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.User;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;
import net.serenitybdd.core.Serenity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.backend.utilidades.enums.CanalesSistemas.BLP;
import static co.com.bancolombia.backend.utilidades.enums.CanalesSistemas.WWW;
import static co.com.bancolombia.certificacion.app.utilidades.UtilityManager.castTypeAccountLetter;
import static co.com.bancolombia.certificacion.app.utilidades.UtilityManager.castTypeAccountNumber;

/**
 * The type Backend integration.
 */
public class BackendFacade {
    /**
     * The constantes deposit.
     */
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
     */
    public static void balanceDepositBefore(){
        CuentaDeposito depositos = CargarEntidadDepositos.getCuentaDeposito();
        String saldoDisponible ="";
        String saldoCanje ="";
        String saldoTotal ="";

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put("CUENTA", depositos.getNumero());
        dataForQuery.put("TIPOCUENTA", castTypeAccountLetter(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFSALDO.consultarSaldo");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        saldoDisponible =  resultadoConsulta.get(0).get("sdsdodsp").toString();
        saldoCanje =  resultadoConsulta.get(0).get("sdfltdsp").toString();
        saldoTotal = Double.toString(Double.parseDouble(saldoDisponible) + Double.parseDouble(saldoCanje));
        Serenity.setSessionVariable("saldoDepositoAntes").to(saldoTotal);
    }

    /**
     * Balance deposit after.
     *
     * @throws SQLException the sql exception
     */
    public static void balanceDepositAfter(){
        CuentaDeposito depositos = CargarEntidadDepositos.getCuentaDeposito();
        String saldoDisponible ="";
        String saldoCanje ="";
        String saldoTotal ="";

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put("CUENTA", depositos.getNumero());
        dataForQuery.put("TIPOCUENTA", castTypeAccountLetter(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFSALDO.consultarSaldo");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        saldoDisponible =  resultadoConsulta.get(0).get("sdsdodsp").toString();
        saldoCanje =  resultadoConsulta.get(0).get("sdfltdsp").toString();
        saldoTotal = Double.toString(Double.parseDouble(saldoDisponible) + Double.parseDouble(saldoCanje));
        Serenity.setSessionVariable("saldoDepositoDespues").to(saldoTotal);
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
        transaccion.setHoraTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getHoraTransaccion());
        try {
            claveDinamica = backClaveDinamica.consultarClaveDinamica(usuario, transaccion, BLP);
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
    public static boolean verificarElDebitoDeLaCuenta(){
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        String valor = CargarEntidadTransferencias.getTransferencias().getAmount();
        String orientacon = configuracionTransaccion.getOrientacionCaso();
        String saldoAntes = Serenity.sessionVariableCalled("saldoDepositoAntes");
        String saldoDespues = Serenity.sessionVariableCalled("saldoDepositoDespues");
        return validarDebitoDeposito(saldoAntes,saldoDespues,orientacon,valor);
    }
    
    /**
     * Verify the Credit of the balance.
     *
     * @return the boolean
     */
    public static boolean verificarElCreditoDeLaCuenta(){
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        String valor = CargarEntidadTransferencias.getTransferencias().getAmount();
        String orientacon = configuracionTransaccion.getOrientacionCaso();
        String saldoAntes = Serenity.sessionVariableCalled("saldoDepositoAntes");
        String saldoDespues = Serenity.sessionVariableCalled("saldoDepositoDespues");
        return validarCreditoDeposito(saldoAntes,saldoDespues,orientacon,valor);
    }
    
    /**
     * Verify the movement of the balance.
     *
     * @return the boolean
     */
    public static String verificarElMovimientoDebitoDeLaCuenta() {
        CuentaDeposito depositos = CargarEntidadDepositos.getCuentaDeposito();
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getHoraTransaccion());
        Map<String, Object> dataForQuery = new HashMap<>();

        dataForQuery.put("CUENTA", depositos.getNumero());
        dataForQuery.put("TIPOCUENTA", castTypeAccountNumber(depositos.getTipo()));
        dataForQuery.put("FECHA", DateManager.obtenerFechaSistema("yyyyMMdd"));
        dataForQuery.put("MONTO", CargarEntidadTransferencias.getTransferencias().getAmount());
        dataForQuery.put("NATURALEZA", AdministradorConstante.NATURE_DEBIT);
        dataForQuery.put("HORA", transaccion.getHoraTransaccion());

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFMRCMV.MovimientoDeposito");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
    }

    /**
     * Verify the movement of the balance.
     *
     * @return the boolean
     */
    public static String verificarElMovimientoCreditoDeLaCuenta() {
        CuentaDeposito depositos = CargarEntidadDepositos.getCuentaDeposito();
        Transaccion transaccion = new Transaccion();
        transaccion.setHoraTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getHoraTransaccion());
        Map<String, Object> dataForQuery = new HashMap<>();

        dataForQuery.put("CUENTA", depositos.getNumero());
        dataForQuery.put("TIPOCUENTA", castTypeAccountNumber(depositos.getTipo()));
        dataForQuery.put("FECHA", DateManager.obtenerFechaSistema("yyyyMMdd"));
        dataForQuery.put("MONTO", CargarEntidadTransferencias.getTransferencias().getAmount());
        dataForQuery.put("NATURALEZA", AdministradorConstante.NATURE_CREDIT);
        dataForQuery.put("HORA", transaccion.getHoraTransaccion());

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFMRCMV.MovimientoDeposito");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
    }

    /**
     * Verifica movtf logtf debito.
     *
     * @return un string
     */
    public static String verificarElDebitoEnMOVTFLOGTF() {
        CuentaDeposito depositos = CargarEntidadDepositos.getCuentaDeposito();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        Transaccion transaccion = new Transaccion();
        transaccion.setCodigoTransaccion(configuracionTransaccion.getCodigoTransaccion());
        Map<String, Object> dataForQuery = new HashMap<>();

        dataForQuery.put("DIA", DateManager.obtenerFechaSistema("dd"));
        dataForQuery.put("CUENTADEBITO", depositos.getNumero().substring(3,11));
        dataForQuery.put("TIPOCUENTADEBITO", castTypeAccountNumber(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.PCCFFMOVTFLOGTF.consultarRegistroDeb");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
    }

    /**
     * Verifica movtf logtf debito.
     *
     * @return un string
     */
    public static String verificarElCreditoEnMOVTFLOGTF() {
        CuentaDeposito depositos = CargarEntidadDepositos.getCuentaDeposito();
        ConfiguracionTransaccion configuracionTransaccion = CargarEntidadTransaccion.getConfiguracionTransaccion();
        Transaccion transaccion = new Transaccion();
        transaccion.setCodigoTransaccion(configuracionTransaccion.getCodigoTransaccion());
        Map<String, Object> dataForQuery = new HashMap<>();

        dataForQuery.put("DIA", DateManager.obtenerFechaSistema("dd"));
        dataForQuery.put("CUENTACREDITO", depositos.getNumero().substring(3,11));
        dataForQuery.put("TIPOCUENTACREDITO", castTypeAccountNumber(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.PCCFFMOVTFLOGTF.consultarRegistroCre");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
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
            transaccion.setCodigoTransaccion(CargarEntidadTransaccion.getConfiguracionTransaccion().getCodigoTransaccion());
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

    public static boolean validarDebitoDeposito(String saldoAntes, String saldoDespues, String orientacion, String valor) {
        BigDecimal saldoAnterior = new BigDecimal(saldoAntes);
        BigDecimal saldoPosterior = new BigDecimal(saldoDespues);
        BigDecimal valorTransaccion = new BigDecimal(valor);
        return "ACIERTO".equalsIgnoreCase(orientacion) ? saldoAnterior.subtract(valorTransaccion).equals(saldoPosterior) : saldoAnterior.equals(saldoPosterior);
    }

    public static boolean validarCreditoDeposito(String saldoAntes, String saldoDespues, String orientacion, String valor) {
        BigDecimal saldoAnterior = new BigDecimal(saldoAntes);
        BigDecimal saldoPosterior = new BigDecimal(saldoDespues);
        BigDecimal valorTransaccion = new BigDecimal(valor);
        return "ACIERTO".equalsIgnoreCase(orientacion) ? saldoAnterior.add(valorTransaccion).equals(saldoPosterior) : saldoAnterior.equals(saldoPosterior);
    }
}
