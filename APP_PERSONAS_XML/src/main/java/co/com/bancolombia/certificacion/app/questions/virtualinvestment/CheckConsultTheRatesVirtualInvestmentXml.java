package co.com.bancolombia.certificacion.app.questions.virtualinvestment;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.UtilityXml;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckConsultTheRatesVirtualInvestmentXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(CheckConsultTheRatesVirtualInvestmentXml.class.getName());
	private static String response="Response";
	
    @Override
    public Boolean answeredBy(Actor actor) {
    	
		boolean result = false;		
		UtilityXml utilityXml = new UtilityXml();
		ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
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
			if (strXMLCodObtenido.equals(transaction.getErrorCode()) && 
					strXMLMsgObtenido.equals(transaction.getExpectedResult())) {
				result = true;
			}
		}else {LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response");}
		Serenity.recordReportData().withTitle("Response consult the rates of the virtual investment").andContents(Serenity.sessionVariableCalled(response));
		return result;
	}
    
}
