package co.com.bancolombia.questions.transfers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.models.transaction.TransactionConfig;
import co.com.bancolombia.utilities.UtilityXml;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CheckTransfersBancolombiaXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(CheckTransfersBancolombiaXml.class.getName());
	
    @Override
    public Boolean answeredBy(Actor actor) {
    	
		boolean result = false;		
		UtilityXml utilityXml = new UtilityXml();
		TransactionConfig transaction = CurrentTrasactionConfigEntity.getTransactionConfig();
		String strXMLCodObtenido = null;
		String strXMLMsgObtenido = null;
		
		try {
			strXMLCodObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled("Response"), "//STATUS/@CODE");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		
		try {
			strXMLMsgObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled("Response"), "//STATUS/@DESC");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		if (strXMLCodObtenido != null && strXMLMsgObtenido != null) {
			if (strXMLCodObtenido.equals(transaction.getErrorCode()) && 
					strXMLMsgObtenido.equals(transaction.getExpectedResult())) {
				result = true;
			}
		}else {LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response");}
		
		return result;
	}
    
}
