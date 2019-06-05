package co.com.bancolombia.certificacion.app.interactions.authentication;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilidades.UtilityXml;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.backend.utilidades.managers.DateManager;

public class PrepararYenviarAutenticacionXml implements Interaction{

	private static final Logger LOGGER = LogManager.getLogger(PrepararYenviarAutenticacionXml.class.getName());
	private static final UtilityXml utilityXml = new UtilityXml();

	/**
	 * Prepare Authentication Xml interaction.
	 *
	 * @return the interaction
	 */
	public static Interaction prepararYenviarXml() {
	    return instrumented(PrepararYenviarAutenticacionXml.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		User user = CargarEntidadUsuario.getUser();
		ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
		String strUrlXml = "https://virtualesqa8.bancolombia.corp/APPQA8/OLBServlet";
		Serenity.setSessionVariable("UrlXml").to(strUrlXml);

		String strRequest = utilityXml.buscarXml(AdministradorConstante.CHANNEL_SVP,
				AdministradorConstante.TRANSACTION_CODE_AUTHENTICATION);

		if (strRequest != null  ) {
			strRequest = strRequest.replace("_FECHA", DateManager.obtenerFechaSistema("YYYY/MM/dd"));
			strRequest = strRequest.replace("_TRNUID", DateManager.obtenerFechaSistema("yyyyMMddhhmmss"));
			strRequest = strRequest.replace("_SESSCOOKIE", "MHSB-7432-AJHF-9482");
			strRequest = strRequest.replace("_CLIENTID", user.getDocumentNumber());
			strRequest = strRequest.replace("_CLAVE", user.getPassword());
			Serenity.setSessionVariable("Request").to(strRequest);
			transaction.setTransactionHour(DateManager.obtenerFechaSistema("HHmmss"));
			String strResponse = UtilityXml.enviarXml(strUrlXml, strRequest);
			Serenity.setSessionVariable("Response").to(strResponse);

			LOGGER.info("URL DE PRUEBAS \n" + strUrlXml + "\n");
			LOGGER.info("REQUEST Autenticacion Trn" + AdministradorConstante.TRANSACTION_CODE_AUTHENTICATION +
					" \n" + strRequest + "\n");
			LOGGER.info("RESPONSE Autenticacion Trn" + AdministradorConstante.TRANSACTION_CODE_AUTHENTICATION +
					" \n" + strResponse + "\n");
			
		}else {LOGGER.info("No se encontro el xml request parametrizado en la ruta");}
		Serenity.recordReportData().withTitle("Report Request Authentication").andContents(Serenity.sessionVariableCalled("Request"));
	}

}
