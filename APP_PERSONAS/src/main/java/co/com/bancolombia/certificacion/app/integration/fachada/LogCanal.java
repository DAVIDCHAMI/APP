package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.backend.iseries.transversal.log.trace.BackTrace;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadConfiguracionTransaccionActual;
import co.com.bancolombia.certificacion.app.models.entitidades.EntidadUsuarioActual;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorFechas;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.backend.utilidades.enums.CanalesSistemas.WWW;

public class LogCanal {

    private static final Logger LOGGER = LogManager.getLogger(LogCanal.class.getName());

    private LogCanal() { throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD); }

    public static List<Map<String, Object>> consultaLogCanalTrama220230() {
        Map<String, Object> dataForQuery = new HashMap<>();
        Usuario user = EntidadUsuarioActual.getUsuario();
        ConfiguracionTransaccion datosTransaccion = EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion();

        BackTrace backTrace = new BackTrace();
        String trace = "";
        String horaConsulta = "";
        List<Map<String, Object>> listOfFounded = null;
        try {
            horaConsulta = AdministradorFechas.obtenerFechaSistema("hhmmss");
            co.com.bancolombia.backend.modelo.usuario.Usuario usuario = new co.com.bancolombia.backend.modelo.usuario.Usuario();
            usuario.setDocumento(user.getNumeroDocumento());
            co.com.bancolombia.backend.modelo.transversal.Transaccion transaccion = new co.com.bancolombia.backend.modelo.transversal.Transaccion();
            transaccion.setCodigoTransaccion(EntidadConfiguracionTransaccionActual.getConfiguracionTransaccion().getCodigoTransaccion());
            transaccion.setHoraTransaccion(horaConsulta);
            trace = backTrace.consultarTrace(usuario, transaccion, WWW);
            datosTransaccion.setTrace(trace);

            dataForQuery.put("TRACE", trace);
            String sql = QueryManager.CONSULTAS.getString("SQL.COMFFLGWWW.tramaDatos_0220_0230");
            listOfFounded = Consulta.ejecutar(sql, dataForQuery, ConnectionManager.getIseriesConnection());
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return listOfFounded;
    }
}
