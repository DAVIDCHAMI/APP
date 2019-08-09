package co.com.bancolombia.certificacion.app.integration.fachada;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorFechas;
import co.com.bancolombia.certificacion.app.utilidades.administradores.QueryManager;
import co.com.bancolombia.certificacion.app.utilidades.constantes.CanalesSistemas;
import co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante;
import co.com.bancolombia.conexion.basedatos.ConnectionManager;
import co.com.bancolombia.conexion.utilidades.consults.Consulta;
import net.serenitybdd.screenplay.Actor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorUtilidades.tipoCuentaLetra;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.TIENE_PRODUCTOS;

public class Tarjetas {

    public Tarjetas() {throw new IllegalStateException(TipoClaseConstante.CLASE_UTILIDAD); }

    public static List<Map<String, Object>> saldoConsolidadoTarjetas(Actor actor){
        ConfiguracionTransaccion datosPrincipales = actor.recall(MODELO_DATOS_TRANSACCION);
        Producto depositos = actor.recall(TIENE_PRODUCTOS);
        Map<String, Object> dataForQuery = new HashMap<>();
        dataForQuery.put("ANIO", AdministradorFechas.obtenerFechaSistema("yy"));
        dataForQuery.put("MES", AdministradorFechas.obtenerFechaSistema("MM"));
        dataForQuery.put("DIA", AdministradorFechas.obtenerFechaSistema("dd"));
        dataForQuery.put("SISTEMA", CanalesSistemas.APP);
        dataForQuery.put("DOCUMENTO", datosPrincipales.getUsuario().getNumeroDocumento());

        String sql = QueryManager.CONSULTAS.getString("SQL.PCCLIBRAMD.consultarLogTFSaldosTDC");
        return Consulta.ejecutar(sql,dataForQuery, ConnectionManager.getIseriesConnection());
    }


}



