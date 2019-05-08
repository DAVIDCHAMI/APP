package co.com.bancolombia.certificacion.app.interactions.autenticacion;


import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.certificacion.app.models.entitidades.ConfiguracionTransaccionActualEntity;
import co.com.bancolombia.certificacion.app.models.entitidades.UsuarioActualEntity;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.usuario.Usuario;
import co.com.bancolombia.certificacion.app.utilities.UtilidadesXml;
import co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.AUTENTICACION_CODIGO_TRANSACCION;
import static co.com.bancolombia.certificacion.app.utilities.constantes.AdministradorConstante.FORMATO_HORA;
import static co.com.bancolombia.certificacion.app.utilities.constantes.CanalesSistemas.SVP;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PrepararYEnviar implements Interaction {

	private static final Logger LOGGER = LogManager.getLogger(PrepararYEnviar.class.getName());
	private static final UtilidadesXml utilidadXml = new UtilidadesXml();

	/**
	 * Prepare Authentication Xml interaction.
	 *
	 * @return the interaction
	 */
	public static Interaction autenticacionXml() {
	    return instrumented(PrepararYEnviar.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		Usuario usuario = UsuarioActualEntity.getUsuario();
		ConfiguracionTransaccion transaccion = ConfiguracionTransaccionActualEntity.getConfiguracionTransaccion();
		String urlXml = "https://virtualesqa11.bancolombia.corp/APP/OLBServlet";
		Serenity.setSessionVariable("UrlXml").to(urlXml);

		String request = utilidadXml.buscar(SVP.toString(),
				AUTENTICACION_CODIGO_TRANSACCION);

		if (request != null  ) {
			request = request.replace("_FECHA", DateManager.obtenerFechaSistema("YYYY/MM/dd"));
			request = request.replace("_TRNUID", DateManager.obtenerFechaSistema("yyyyMMddhhmmss"));
			request = request.replace("_SESSCOOKIE", "MHSB-7432-AJHF-9482");
			request = request.replace("_CLIENTID", usuario.getNumeroDocumento());
			request = request.replace("_CLAVE", usuario.getClave());

			Serenity.setSessionVariable("Request").to(request);

			transaccion.setHoraTransaccion(DateManager.obtenerFechaSistema(FORMATO_HORA));
			String strResponse = UtilidadesXml.enviar(urlXml, request);

			Serenity.setSessionVariable("Response").to(strResponse);

			LOGGER.info("URL DE PRUEBAS \n" + urlXml + "\n");
			LOGGER.info("REQUEST Autenticacion Trn" + AdministradorConstante.AUTENTICACION_CODIGO_TRANSACCION +
					" \n" + request + "\n");
			LOGGER.info("RESPONSE Autenticacion Trn" + AdministradorConstante.AUTENTICACION_CODIGO_TRANSACCION +
					" \n" + strResponse + "\n");

		}else {
		    LOGGER.info("No se encontro el xml request parametrizado en la ruta");
		     }
		
	}

}
