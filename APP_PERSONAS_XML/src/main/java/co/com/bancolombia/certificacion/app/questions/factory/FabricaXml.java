package co.com.bancolombia.certificacion.app.questions.factory;

import co.com.bancolombia.certificacion.app.questions.authentication.VerificarLaAutenticacionXml;
import co.com.bancolombia.certificacion.app.questions.transfers.VerificarLaTransferenciaBancolombiaXml;
import co.com.bancolombia.certificacion.app.questions.virtualinvestment.VerificarLaConsultaDeTasasDeInversionVirtualXml;
import co.com.bancolombia.certificacion.app.questions.virtualinvestment.VerificarLaAperturaDeInversionVirtualXml;
import co.com.bancolombia.certificacion.app.questions.virtualinvestment.CheckSimulateVirtualInvestmentXml;
import net.serenitybdd.screenplay.Question;

public class FabricaXml {

    private FabricaXml() {
    }
	
    /**
     * Verify result object Xml Authentication.
     *
     * @return the question
     */

    public static Question<Boolean> verificaElResultadoDeLaAuntenticacionPorXml() {
        return new VerificarLaAutenticacionXml();
    }
    
    /**
     * Verify result object Xml Transfers Bancolombia.
     *
     * @return the question
     */

    public static Question<Boolean> verificaElResultadoDeLaTransferenciaBancolombiaPorXml() {
        return new VerificarLaTransferenciaBancolombiaXml();
    }

    /**
     * Verify result object Xml Consult the rates virtual investmen.
     *
     * @return the question
     */

    public static Question<Boolean> verificaElResultadoDeLaConsultaDeTasasDeInversionVirtualPorXml() {
        return new VerificarLaConsultaDeTasasDeInversionVirtualXml();
    }

    /**
     * Verify result object Xml Opening virtual investmen.
     *
     * @return the question
     */

    public static Question<Boolean> verificaElResultadoDeLaAperturaDeInversionVirtualPorXml() {
        return new VerificarLaAperturaDeInversionVirtualXml();
    }


    /**
     * Verify result object Xml Simulate virtual investmen.
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultXmlSimulateVirtualInvestment() {
        return new CheckSimulateVirtualInvestmentXml();
    }

}
