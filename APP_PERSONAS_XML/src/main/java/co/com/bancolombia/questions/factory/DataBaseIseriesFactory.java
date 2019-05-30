package co.com.bancolombia.questions.factory;

import co.com.bancolombia.questions.database.*;
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
    public static Question<Boolean> theIseriesFilePCCFFPPCLI() { return new ConsultObjectBooleanPCCFFPPCLI(); }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileCABFFTARJ() {
        return new ConsultObjectBooleanCABFFTARJ();
    }

    /**
     * Verify result object wwwffusrsv question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileWWWFFUSRSV() {
        return new ConsultawwwffusrsvInDataBase();
    }

    /**
     * Verify result object terminos y condiciones .
     *
     * @return the question
     */

    public static Question<Boolean> theIseriesFileTERMCONDITION() {
        return new ConsultaTermCondInDataBase();
    }

    /**
     * Verify result object CABFFPPMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileCABFFPPMAE() {return new ConsultObjectBooleanCABFFPPMAE();}

    /**
     * Verify result debit SCIFFSALDO question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileSCIFFSALDO() {return new ConsultObjectBooleanDebitSCIFFSALDO();}

    /**
     * Verify result debit TCBFFMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileTCBFFMAE() {return new ConsultObjectBooleanCreditTCBFFMAE();}
    /**
     * Verify result object SCIFFMRCMV question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileSCIFFMRCMV() {return new ConsultObjectBooleanSCIFFMRCMV();}
    /**
     * Verify result object CABFFPPAUT question.
     *
     * @return the question
     */
    public static Question<Boolean> theIseriesFileCABFFPPAUT() {return new ConsultObjectBooleanCABFFPPAUT();}


}
