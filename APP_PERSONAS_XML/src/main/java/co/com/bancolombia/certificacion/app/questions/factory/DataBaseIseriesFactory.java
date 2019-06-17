package co.com.bancolombia.certificacion.app.questions.factory;

import co.com.bancolombia.certificacion.app.questions.database.*;
import net.serenitybdd.screenplay.Question;

/**
 * The type Data base factory.
 */
public class DataBaseIseriesFactory {

    private DataBaseIseriesFactory() {
    }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFilePCCFFPPCLI() { return new ConsultarRegistroEnPCCFFPPCLI(); }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileCABFFTARJ() {
        return new ConsultarRegistroEnCABFFTARJ();
    }

    /**
     * Verify result object wwwffusrsv question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileWWWFFUSRSV() {
        return new ConsultarRegistroEnWWWFFUSRSV();
    }

    /**
     * Verify result object terminos y condiciones .
     *
     * @return the question
     */

    public static Question<Boolean> theIseriesFileTERMCONDITION() {
        return new ConsultarRegistroEnWWWFFLGTYC();
    }

    /**
     * Verify result object CABFFPPMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileCABFFPPMAE() {return new ConsultarRegistroEnCABFFPPMAE();}

    /**
     * Verify result debit SCIFFSALDO question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileSCIFFSALDOdebit() {return new ConsultarDebitoEnSCIFFSALDO();}

    /**
     * Verify result debit SCIFFSALDO question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileSCIFFSALDOcredit() {return new ConsultarCreditoEnSCIFFSALDO();}

    /**
     * Verify result debit TCBFFMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileTCBFFMAE() {return new ConsultarRegistroEnTCBFFMAE();}
    /**
     * Verify result object SCIFFMRCMV question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileSCIFFMRCMVdebit() {return new ConsultarDebitoEnSCIFFMRCMV();}
    /**
     * Verify result object SCIFFMRCMV question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileSCIFFMRCMVcredit() {return new ConsultarCreditoEnSCIFFMRCMV();}
    /**
     * Verify result object CABFFPPAUT question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileCABFFPPAUT() {return new ConsultarRegistroEnCABFFPPAUT();}
    /**
     * Verify result object pccmovtflogtf question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFilePCCMOVTFLOGTFdebit() { return new ConsultarDebitoEnMOVTFLOGTF(); }
    /**
     * Verify result object pccmovtflogtf question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFilePCCMOVTFLOGTFcredit() { return new ConsultarCreditoEnMOVTFLOGTF(); }


}
