package co.com.bancolombia.certificacion.app.questions.factory;

import co.com.bancolombia.certificacion.app.questions.database.channellog.ChannelLogInDataBaseTRN0322;
import co.com.bancolombia.certificacion.app.questions.database.channellog.ChannelLogInDataBaseTRN0326;
import co.com.bancolombia.certificacion.app.questions.database.channellog.ChannelLogInDataBaseTRN0369;
import net.serenitybdd.screenplay.Question;

/**
 * The type Data base factory.
 */
public class ChannelLogFactory {

    private ChannelLogFactory() {
    }

    /**
     * Verify channel log question TRN0322.
     *
     * @return the question
     */
    public static Question<Boolean> theChannelLog0369() { return new ChannelLogInDataBaseTRN0369();}

    /**
     * Verify channel log question TRN0322.
     *
     * @return the question
     */
    public static Question<Boolean> theChannelLog0322() { return new ChannelLogInDataBaseTRN0322();}

    /**
     * Verify channel log question TRN0326.
     *
     * @return the question
     */
    public static Question<Boolean> theChannelLog0326() { return new ChannelLogInDataBaseTRN0326();}



}
