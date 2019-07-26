package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Autenticacion {

    private static final String DOCUMENTO = "DOCUMENTO";

    public static List<Map<String, Object>> consultaDeExistenciaDelCliente() {
        Map<String, Object> dataForQuery = new HashMap<>();
        Usuario user = EntidadUsuarioActual.getUsuario();
        dataForQuery.put(DOCUMENTO, user.getNumeroDocumento());
        String sql = QueryManager.CONSULTAS_APP.getString("SQL.CNAME_WWWFFUSRSV.consultaCliente");
        return Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
    }


}
