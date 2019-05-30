package co.com.bancolombia.certificacion.app.interactions.authentication;

import co.com.bancolombia.certificacion.app.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.certificacion.app.models.entities.CurrentUserEntity;
import co.com.bancolombia.certificacion.app.models.transaction.TransactionConfig;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilities.UtilityXml;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.backend.utilidades.managers.DateManager;

public class PrepareAndSubmitAuthenticationXml implements Interaction{

	private static final Logger LOGGER = LogManager.getLogger(PrepareAndSubmitAuthenticationXml.class.getName());
	private static final UtilityXml utilityXml = new UtilityXml();

	/**
	 * Prepare Authentication Xml interaction.
	 *
	 * @return the interaction
	 */
	public static Interaction prepareAndSubmitXml() {
	    return instrumented(PrepareAndSubmitAuthenticationXml.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		User user = CurrentUserEntity.getUser();
		TransactionConfig transaction = CurrentTrasactionConfigEntity.getTransactionConfig();
		String strUrlXml = "https://virtualesqa8.bancolombia.corp/APPQA8/OLBServlet";
		Serenity.setSessionVariable("UrlXml").to(strUrlXml);

		String strRequest = utilityXml.buscarXml(ConstantsManager.CHANNEL_SVP,
				ConstantsManager.TRANSACTION_CODE_AUTHENTICATION);

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
			LOGGER.info("REQUEST Autenticacion Trn" + ConstantsManager.TRANSACTION_CODE_AUTHENTICATION + 
					" \n" + strRequest + "\n");
			LOGGER.info("RESPONSE Autenticacion Trn" + ConstantsManager.TRANSACTION_CODE_AUTHENTICATION + 
					" \n" + strResponse + "\n");
			
		}else {LOGGER.info("No se encontro el xml request parametrizado en la ruta");}
		
	}

}
