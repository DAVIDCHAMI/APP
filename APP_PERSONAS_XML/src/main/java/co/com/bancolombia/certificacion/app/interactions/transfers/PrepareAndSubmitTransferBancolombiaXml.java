package co.com.bancolombia.certificacion.app.interactions.transfers;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransferencias;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadUsuario;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.models.transaction.Transferencias;
import co.com.bancolombia.certificacion.app.models.user.User;
import co.com.bancolombia.certificacion.app.utilidades.UtilityManager;
import co.com.bancolombia.certificacion.app.utilidades.UtilityXml;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


public class PrepareAndSubmitTransferBancolombiaXml implements Interaction{
	
	private static final Logger LOGGER = LogManager.getLogger(PrepareAndSubmitTransferBancolombiaXml.class.getName());
	private static final UtilityXml utilityXml = new UtilityXml();
	
	/**
	 * Prepare Transferencias Bancolombia Xml interaction.
	 *
	 * @return the interaction
	 */
	public static Interaction prepareAndSubmitXml() {
	    return instrumented(PrepareAndSubmitTransferBancolombiaXml.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		User user = CargarEntidadUsuario.getUser();
		ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
		Transferencias transferencia = CargarEntidadTransferencias.getTransferencias();

		String strUrlXml = Serenity.sessionVariableCalled("UrlXml");
		String strRequest = utilityXml.buscarXml(AdministradorConstante.CHANNEL_SVP,
				transaction.getTransactionCode());
		
		if (strRequest != null  ) {
			strRequest = strRequest.replace("_FECHA", DateManager.obtenerFechaSistema("YYYY/MM/dd"));
			strRequest = strRequest.replace("_TRNUID", DateManager.obtenerFechaSistema("yyyyMMddhhmmss"));
			strRequest = strRequest.replace("_SESSCOOKIE", AdministradorConstante.SESSCOOKIE);
			strRequest = strRequest.replace("_CLIENTID", user.getDocumentNumber());
			strRequest = strRequest.replace("CtaOrigen", UtilityManager.depositAccountFormat(String.valueOf(transferencia.getOriginProduct().getNumber())));
			strRequest = strRequest.replace("TipOrigen", UtilityManager.castTypeAccountNumber(transferencia.getOriginProduct().getProductType()));
			strRequest = strRequest.replace("CtaDestino", UtilityManager.depositAccountFormat(String.valueOf(transferencia.getDestinationProduct().getNumber())));
			strRequest = strRequest.replace("TipDestino", UtilityManager.castTypeAccountNumber(transferencia.getDestinationProduct().getProductType()));
			strRequest = strRequest.replace("ValorTransferir", transferencia.getAmount() + ".00");
			Serenity.setSessionVariable("Request").to(strRequest);
			

			transaction.setTransactionHour(DateManager.obtenerFechaSistema("HHmmss"));
			String strResponse = UtilityXml.enviarXml(strUrlXml, strRequest);
			Serenity.setSessionVariable("Response").to(strResponse);

			LOGGER.info("REQUEST Tranferencias Bancolombia Trn" + transaction.getTransactionCode() + 
					" \n" + strRequest + "\n");
			LOGGER.info("RESPONSE Tranferencias Bancolombia Trn" + transaction.getTransactionCode() + 
					" \n" + strResponse + "\n");
			
		}else {LOGGER.info("No se encontro el xml request parametrizado en la ruta");}
		
	}

}
