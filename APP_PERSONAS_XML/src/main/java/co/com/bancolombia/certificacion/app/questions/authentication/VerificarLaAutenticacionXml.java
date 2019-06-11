package co.com.bancolombia.certificacion.app.questions.authentication;

import co.com.bancolombia.certificacion.app.models.entities.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.transaction.ConfiguracionTransaccion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import co.com.bancolombia.certificacion.app.utilidades.UtilityXml;
import co.com.bancolombia.certificacion.app.utilidades.constantes.AdministradorConstante;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarLaAutenticacionXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(VerificarLaAutenticacionXml.class.getName());
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
			strXMLMsgObtenido = utilityXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@DESC");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		if (strXMLCodObtenido != null && strXMLMsgObtenido != null) {
			if (!AdministradorConstante.TRANSACTION_CODE_AUTHENTICATION.equals(transaction.getTransactionCode())) {
				if (strXMLCodObtenido.equals("000") && strXMLMsgObtenido.equals("NO ERROR")) {
					result = true;
				}
			}else if (strXMLCodObtenido.equals(transaction.getErrorCode()) && 
					strXMLMsgObtenido.equals(transaction.getExpectedResult())) {
				result = true;
			}
		}else {LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response de la autenticacion");}
		Serenity.recordReportData().withTitle("Response Autenticacion").andContents(Serenity.sessionVariableCalled(response));
		return result;
	}
    
}
