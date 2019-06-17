package co.com.bancolombia.certificacion.app.questions.factory;

import co.com.bancolombia.certificacion.app.questions.database.*;
import net.serenitybdd.screenplay.Question;

/**
 * The type Data base factory.
 */
public class DataBaseFactory {

    private DataBaseFactory() {
    }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectPCCFFPPCLI() {
        return new ConsultarRegistroEnPCCFFPPCLI();
    }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectCABFFTARJ() {
        return new ConsultarRegistroEnCABFFTARJ();
    }

    /**
     * Verify result object wwwffusrsv question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectWWWFFUSRSV() {
        return new ConsultarRegistroEnWWWFFUSRSV();
    }

    /**
     * Verify result object terminos y condiciones .
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultTERMCONDITION() {
        return new ConsultarRegistroEnWWWFFLGTYC();
    }

    /**
     * Verify result object CABFFPPMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectCABFFPPMAE() {return new ConsultarRegistroEnCABFFPPMAE();}

    /**
     * Verify result debit SCIFFSALDO question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultDebitSCIFFSALDO() {return new ConsultarDebitoEnSCIFFSALDO();}

    /**
     * Verify result debit TCBFFMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultCreditTCBFFMAE() {return new ConsultarRegistroEnTCBFFMAE();}
    /**
     * Verify result object SCIFFMRCMV question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectSCIFFMRCMV() {return new ConsultarCreditoEnSCIFFMRCMV();}
    /**
     * Verify result object CABFFPPAUT question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectCABFFPPAUT() {return new ConsultarRegistroEnCABFFPPAUT();}



}
