package co.com.bancolombia.certificacion.app.questions.authentication;

import co.com.bancolombia.certificacion.app.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.certificacion.app.models.transaction.TransactionConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.certificacion.app.utilities.UtilityXml;
import co.com.bancolombia.certificacion.app.utilities.constant.ConstantsManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CheckAuthenticationXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(CheckAuthenticationXml.class.getName());
	private static String response="Response";
	
    @Override
    public Boolean answeredBy(Actor actor) {
    	
		boolean result = false;		
		UtilityXml utilityXml = new UtilityXml();
		TransactionConfig transaction = CurrentTrasactionConfigEntity.getTransactionConfig();
		String strXMLCodObtenido = null;
		String strXMLMsgObtenido = null;
		
		try {
			strXMLCodObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@CODE");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		
		try {
			strXMLMsgObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@DESC");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		if (strXMLCodObtenido != null && strXMLMsgObtenido != null) {
			if (!ConstantsManager.TRANSACTION_CODE_AUTHENTICATION.equals(transaction.getTransactionCode())) {
				if (strXMLCodObtenido.equals("000") && strXMLMsgObtenido.equals("NO ERROR")) {
					result = true;
				}
			}else if (strXMLCodObtenido.equals(transaction.getErrorCode()) && 
					strXMLMsgObtenido.equals(transaction.getExpectedResult())) {
				result = true;
			}
		}else {LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response de la autenticacion");}
		Serenity.recordReportData().withTitle("Response Authentication").andContents(Serenity.sessionVariableCalled(response));
		return result;
	}
    
}
