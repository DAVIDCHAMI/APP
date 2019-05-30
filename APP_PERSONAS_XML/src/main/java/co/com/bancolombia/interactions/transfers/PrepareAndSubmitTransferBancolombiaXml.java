package co.com.bancolombia.interactions.transfers;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.backend.utilidades.managers.DateManager;
import co.com.bancolombia.models.entities.CurrentTransferEntity;
import co.com.bancolombia.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.models.entities.CurrentUserEntity;
import co.com.bancolombia.models.transaction.TransactionConfig;
import co.com.bancolombia.models.transaction.Transfer;
import co.com.bancolombia.models.user.User;
import co.com.bancolombia.utilities.UtilityXml;
import co.com.bancolombia.utilities.constant.ConstantsManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static co.com.bancolombia.utilities.UtilityManager.*;


public class PrepareAndSubmitTransferBancolombiaXml implements Interaction{
	
	private static final Logger LOGGER = LogManager.getLogger(PrepareAndSubmitTransferBancolombiaXml.class.getName());
	private static final UtilityXml utilityXml = new UtilityXml();
	
	/**
	 * Prepare Transfer Bancolombia Xml interaction.
	 *
	 * @return the interaction
	 */
	public static Interaction prepareAndSubmitXml() {
	    return instrumented(PrepareAndSubmitTransferBancolombiaXml.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		User user = CurrentUserEntity.getUser();
		TransactionConfig transaction = CurrentTrasactionConfigEntity.getTransactionConfig();
		Transfer transferencia = CurrentTransferEntity.getTransfer();

		String strUrlXml = Serenity.sessionVariableCalled("UrlXml");
		String strRequest = utilityXml.buscarXml(ConstantsManager.CHANNEL_SVP,
				transaction.getTransactionCode());
		
		if (strRequest != null  ) {
			strRequest = strRequest.replace("_FECHA", DateManager.obtenerFechaSistema("YYYY/MM/dd"));
			strRequest = strRequest.replace("_TRNUID", DateManager.obtenerFechaSistema("yyyyMMddhhmmss"));
			strRequest = strRequest.replace("_SESSCOOKIE", ConstantsManager.SESSCOOKIE);
			strRequest = strRequest.replace("_CLIENTID", user.getDocumentNumber());
			strRequest = strRequest.replace("CtaOrigen", depositAccountFormat(String.valueOf(transferencia.getOriginProduct().getNumber())));
			strRequest = strRequest.replace("TipOrigen", castTypeAccountNumber(transferencia.getOriginProduct().getProductType()));
			strRequest = strRequest.replace("CtaDestino", depositAccountFormat(String.valueOf(transferencia.getDestinationProduct().getNumber())));
			strRequest = strRequest.replace("TipDestino", castTypeAccountNumber(transferencia.getDestinationProduct().getProductType()));
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
