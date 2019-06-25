package co.com.bancolombia.certificacion.app.questions.inversionvirtual;

import co.com.bancolombia.certificacion.app.models.entidades.CargarEntidadTransaccion;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.XML.UtilidadXml;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerificarLaConsultaDeTasasDeInversionVirtualXml implements Question<Boolean> {

	private static final Logger LOGGER = LogManager.getLogger(VerificarLaConsultaDeTasasDeInversionVirtualXml.class.getName());
	private static String response="Response";
	
    @Override
    public Boolean answeredBy(Actor actor) {
    	
		boolean result = false;		
		UtilidadXml utilidadXml = new UtilidadXml();
		ConfiguracionTransaccion transaction = CargarEntidadTransaccion.getConfiguracionTransaccion();
		String strXMLCodObtenido = null;
		String strXMLMsgObtenido = null;
		
		try {
			strXMLCodObtenido = utilidadXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@CODE");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		
		try {
			strXMLMsgObtenido = utilidadXml.leerXml(Serenity.sessionVariableCalled(response), "//STATUS/@DESC");
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		if (strXMLCodObtenido != null && strXMLMsgObtenido != null) {
			if (strXMLCodObtenido.equals(transaction.getCodigoError()) &&
					strXMLMsgObtenido.equals(transaction.getResultadoEsperado())) {
				result = true;
			}
		}else {LOGGER.info("Ruta relativa Xpath a buscar no se presenta en el response");}
		Serenity.recordReportData().withTitle("Response consult the rates of the virtual investment").andContents(Serenity.sessionVariableCalled(response));
		return result;
	}
    
}
