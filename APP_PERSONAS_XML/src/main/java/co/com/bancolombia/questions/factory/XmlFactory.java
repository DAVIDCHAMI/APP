package co.com.bancolombia.questions.factory;

import co.com.bancolombia.questions.authentication.CheckAuthenticationXml;
import co.com.bancolombia.questions.transfers.CheckTransfersBancolombiaXml;
import co.com.bancolombia.questions.virtualinvestment.CheckConsultTheRatesVirtualInvestmentXml;
import co.com.bancolombia.questions.virtualinvestment.CheckOpeningVirtualInvestmentXml;
import co.com.bancolombia.questions.virtualinvestment.CheckSimulateVirtualInvestmentXml;
import net.serenitybdd.screenplay.Question;

public class XmlFactory {

    private XmlFactory() {
    }
	
    /**
     * Verify result object Xml Authentication.
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultXmlAunthentication() {
        return new CheckAuthenticationXml();
    }
    
    /**
     * Verify result object Xml Transfers Bancolombia.
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultXmlTransfersBancolombia() {
        return new CheckTransfersBancolombiaXml();
    }

    /**
     * Verify result object Xml Consult the rates virtual investmen.
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultXmlConsultTheRatesVirtualInvestment() {
        return new CheckConsultTheRatesVirtualInvestmentXml();
    }

    /**
     * Verify result object Xml Opening virtual investmen.
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultXmlOpeningVirtualInvestment() {
        return new CheckOpeningVirtualInvestmentXml();
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
