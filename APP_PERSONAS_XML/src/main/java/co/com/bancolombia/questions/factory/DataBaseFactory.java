package co.com.bancolombia.questions.factory;

import co.com.bancolombia.questions.database.*;
import co.com.bancolombia.questions.database.channellog.ChannelLogInDataBase;
import net.serenitybdd.screenplay.Question;

/**
 * The type Data base factory.
 */
public class DataBaseFactory {

    private DataBaseFactory() {
    }

    /**
     * Verify channel log question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyChannelLog() {
        return new ChannelLogInDataBase();
    }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectPCCFFPPCLI() {
        return new ConsultObjectBooleanPCCFFPPCLI();
    }

    /**
     * Verify if the object returns records.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectCABFFTARJ() {
        return new ConsultObjectBooleanCABFFTARJ();
    }

    /**
     * Verify result object wwwffusrsv question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectWWWFFUSRSV() {
        return new ConsultawwwffusrsvInDataBase();
    }

    /**
     * Verify result object terminos y condiciones .
     *
     * @return the question
     */

    public static Question<Boolean> verifyResultTERMCONDITION() {
        return new ConsultaTermCondInDataBase();
    }

    /**
     * Verify result object CABFFPPMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectCABFFPPMAE() {return new ConsultObjectBooleanCABFFPPMAE();}

    /**
     * Verify result debit SCIFFSALDO question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultDebitSCIFFSALDO() {return new ConsultObjectBooleanDebitSCIFFSALDO();}

    /**
     * Verify result debit TCBFFMAE question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultCreditTCBFFMAE() {return new ConsultObjectBooleanCreditTCBFFMAE();}
    /**
     * Verify result object SCIFFMRCMV question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectSCIFFMRCMV() {return new ConsultObjectBooleanSCIFFMRCMV();}
    /**
     * Verify result object CABFFPPAUT question.
     *
     * @return the question
     */
    public static Question<Boolean> verifyResultObjectCABFFPPAUT() {return new ConsultObjectBooleanCABFFPPAUT();}


}
