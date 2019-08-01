package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Autenticacion {

    private Autenticacion() { throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD); }

    private static final String DOCUMENTO = "DOCUMENTO";

    public static List<Map<String, Object>> consultaDeExistenciaDelCliente() {
        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put(DOCUMENTO, "000000058156994");
        String sql = QueryManager.CONSULTAS.getString("SQL.CNAME_WWWFFUSRSV.consultaCliente");
        return Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
    }


}
