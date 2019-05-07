package co.com.bancolombia.certificacion.app.questions.factory;


import co.com.bancolombia.certificacion.app.questions.autenticacion.VerificarAutenticacion;
import net.serenitybdd.screenplay.Question;

public class XmlFactory {

    private XmlFactory() {
    }
	
    /**
     * Verify result object Xml Authentication.
     *
     * @return the question
     */

    public static Question<Boolean> verificacionResultadoAutenticacionXml() {
        return new VerificarAutenticacion();
    }
    

    

}
