package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadDepositoActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.productos.CuentaDeposito;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorFechas;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.CanalesSistemas;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.formatoTipoCuentaNumero;

public class Transversales {

    private static final String FECHA = "FECHA";
    private static final String FECHASISTEMA = "yyyyMMdd";
    private static final String DOCUMENTO = "DOCUMENTO";

    public static String verificarElDebitoEnMOVTFLOGTF() {
        CuentaDeposito depositos = EntidadDepositoActual.getDeposito();

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put("DIA", AdministradorFechas.obtenerFechaSistema("dd"));
        dataForQuery.put("CUENTADEBITO", depositos.getNumero().substring(3,11));
        dataForQuery.put("TIPOCUENTADEBITO", formatoTipoCuentaNumero(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.PCCFFMOVTFLOGTF.consultarRegistroDeb");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
    }

    public static String verificarElCreditoEnMOVTFLOGTF() {
        CuentaDeposito depositos = EntidadDepositoActual.getDeposito();
        Map<String, Object> dataForQuery = new HashMap<>();

        dataForQuery.put("DIA", AdministradorFechas.obtenerFechaSistema("dd"));
        dataForQuery.put("CUENTACREDITO", depositos.getNumero().substring(3,11));
        dataForQuery.put("TIPOCUENTACREDITO", formatoTipoCuentaNumero(depositos.getTipo()));

        String sql = QueryManager.CONSULTAS_APP.getString("SQL.PCCFFMOVTFLOGTF.consultarRegistroCre");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        return resultadoConsulta.get(0).toString();
    }

    public String consultarClaveDinamica() {
        Usuario user = EntidadUsuarioActual.getUsuario();
        String claveDinamica = "";

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(DOCUMENTO, user.getNumeroDocumento());
        dataForQuery.put(FECHA, AdministradorFechas.obtenerFechaSistema(FECHASISTEMA));
        dataForQuery.put("CANAL", CanalesSistemas.BLP);
        dataForQuery.put("HORA", AdministradorFechas.obtenerFechaSistema("hhmmss"));
        String sql = QueryManager.CONSULTAS_APP.getString("SQL.PCCFFLGAEN.consultaClaveDinamica");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
        claveDinamica =  resultadoConsulta.get(0).get("aenmsgenv").toString();
        return claveDinamica;
    }

    public boolean verifyTopesPersonalizadosPCCFFPPCLI() {
        boolean result = false;
        Usuario usuario = EntidadUsuarioActual.getUsuario();

        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(DOCUMENTO, usuario.getNumeroDocumento());
        String sql = QueryManager.CONSULTAS_APP.getString("SQL.CABFFTARJ.validarRegistroEprepago");
        List<Map<String, Object>> resultadoConsulta = Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());

        if (resultadoConsulta != null) {
            result = true;
        }
        return result;
    }

}
