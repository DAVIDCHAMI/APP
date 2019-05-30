package co.com.bancolombia.certificacion.app.questions.virtualinvestment;

import co.com.bancolombia.certificacion.app.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.certificacion.app.models.transaction.TransactionConfig;
import co.com.bancolombia.certificacion.app.utilities.UtilityXml;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckOpeningVirtualInvestmentXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(CheckOpeningVirtualInvestmentXml.class.getName());
	private static String response="Response";
	
    @Override
    public Boolean answeredBy(Actor actor) {
    	
		boolean result = false;		
		UtilityXml utilityXml = new UtilityXml();
		TransactionConfig transaction = CurrentTrasactionConfigEntity.getTransactionConfig();
		String strXMLCodObtenido = null;
		String strXMLMsgObtenido = null;
		String strNumInversion=null;
		
		try {
			strXMLCodObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@CODE");
			strXMLMsgObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@DESC");
			strNumInversion = utilityXml.leerXml(Serenity.sessionVariableCalled(response), "//INVESTNUMBER");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		if (strXMLCodObtenido != null && strXMLMsgObtenido != null && strNumInversion != null) {
			if (strXMLCodObtenido.equals(transaction.getErrorCode()) && 
					strXMLMsgObtenido.equals(transaction.getExpectedResult())) {
				result = true;
				Serenity.setSessionVariable("NumeroInversion").to(strNumInversion);
			}
		}else {LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response");}
		Serenity.recordReportData().withTitle("Response Opening the virtual investment").andContents(Serenity.sessionVariableCalled(response));
		return result;
	}
    
}
