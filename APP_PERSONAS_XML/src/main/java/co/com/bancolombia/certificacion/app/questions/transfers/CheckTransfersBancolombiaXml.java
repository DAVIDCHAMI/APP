package co.com.bancolombia.certificacion.app.questions.transfers;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.certificacion.app.utilidades.UtilityXml;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CheckTransfersBancolombiaXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(CheckTransfersBancolombiaXml.class.getName());
	
    @Override
    public Boolean answeredBy(Actor actor) {
    	
		boolean result = false;		
		UtilityXml utilityXml = new UtilityXml();
		ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
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
