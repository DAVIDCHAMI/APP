package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadDepositoActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadTransferenciaActual;
import co.com.bancolombia.certificacion.app.models.productos.CuentaDeposito;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorFechas;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;
import net.serenitybdd.core.Serenity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.formatoTipoCuentaNumero;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.tipoCuentaLetra;

public class Depositos {

    private static final String CUENTA = "CUENTA";
    private static final String TIPOCUENTA = "TIPOCUENTA";
    private static final String SALDOANTES = "saldoDepositoAntes";
    private static final String SALDODESPUES = "saldoDepositoDespues";
    private static final String FECHA = "FECHA";
    private static final String FECHASISTEMA = "yyyyMMdd";


    public static void saldoDepositosAntes(){
        CuentaDeposito depositos = EntidadDepositoActual.getDeposito();
        String saldoDisponible ="";
        String saldoCanje ="";
        String saldoTotal ="";

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(CUENTA, depositos.getNumero());
        dataForQuery.put(TIPOCUENTA, tipoCuentaLetra(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFSALDO.consultarSaldo");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        saldoDisponible =  resultadoConsulta.get(0).get("sdsdodsp").toString();
        saldoCanje =  resultadoConsulta.get(0).get("sdfltdsp").toString();
        saldoTotal = Double.toString(Double.parseDouble(saldoDisponible) + Double.parseDouble(saldoCanje));
        Serenity.setSessionVariable(SALDOANTES).to(saldoTotal);
    }

    public static void saldoDepositosDespues(){
        CuentaDeposito depositos = EntidadDepositoActual.getDeposito();
        String saldoDisponible ="";
        String saldoCanje ="";
        String saldoTotal ="";

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(CUENTA, depositos.getNumero());
        dataForQuery.put(TIPOCUENTA, tipoCuentaLetra(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFSALDO.consultarSaldo");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        saldoDisponible =  resultadoConsulta.get(0).get("sdsdodsp").toString();
        saldoCanje =  resultadoConsulta.get(0).get("sdfltdsp").toString();
        saldoTotal = Double.toString(Double.parseDouble(saldoDisponible) + Double.parseDouble(saldoCanje));
        Serenity.setSessionVariable(SALDODESPUES).to(saldoTotal);
    }

    public static boolean verificarElDebitoDeLaCuenta(){
        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        String valor = EntidadTransferenciaActual.getTransferencia().getMonto();
        String orientacon = configuracionTransaccion.getOrientacionCaso();
        String saldoAntes = Serenity.sessionVariableCalled(SALDOANTES);
        String saldoDespues = Serenity.sessionVariableCalled(SALDODESPUES);
        return validarDebitoDeposito(saldoAntes,saldoDespues,orientacon,valor);
    }


    public static boolean verificarElCreditoDeLaCuenta(){
        ConfiguracionTransaccion configuracionTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();
        String valor = EntidadTransferenciaActual.getTransferencia().getMonto();
        String orientacon = configuracionTransaccion.getOrientacionCaso();
        String saldoAntes = Serenity.sessionVariableCalled(SALDOANTES);
        String saldoDespues = Serenity.sessionVariableCalled(SALDODESPUES);
        return validarCreditoDeposito(saldoAntes,saldoDespues,orientacon,valor);
    }

    public static String verificarElMovimientoDebitoDeLaCuenta() {
        CuentaDeposito depositos = EntidadDepositoActual.getDeposito();
        ConfiguracionTransaccion transaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(CUENTA, depositos.getNumero());
        dataForQuery.put(TIPOCUENTA, formatoTipoCuentaNumero(depositos.getTipo()));
        dataForQuery.put(FECHA, AdministradorFechas.obtenerFechaSistema(FECHASISTEMA));
        dataForQuery.put("MONTO", EntidadTransferenciaActual.getTransferencia().getMonto());
        dataForQuery.put("NATURALEZA", AdministradorConstante.NATURE_DEBIT);
        dataForQuery.put("HORA", transaccion.getHoraTransaccion());

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFMRCMV.MovimientoDeposito");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
    }

    public static String verificarElMovimientoCreditoDeLaCuenta() {
        CuentaDeposito depositos = EntidadDepositoActual.getDeposito();
        ConfiguracionTransaccion transaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(CUENTA, depositos.getNumero());
        dataForQuery.put(TIPOCUENTA, formatoTipoCuentaNumero(depositos.getTipo()));
        dataForQuery.put(FECHA, AdministradorFechas.obtenerFechaSistema(FECHASISTEMA));
        dataForQuery.put("MONTO", EntidadTransferenciaActual.getTransferencia().getMonto());
        dataForQuery.put("NATURALEZA", AdministradorConstante.NATURE_CREDIT);
        dataForQuery.put("HORA", transaccion.getHoraTransaccion());

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.SCIFFMRCMV.MovimientoDeposito");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
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
