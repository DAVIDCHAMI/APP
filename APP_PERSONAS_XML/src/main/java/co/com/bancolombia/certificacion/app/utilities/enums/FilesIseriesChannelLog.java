package co.com.bancolombia.certificacion.app.utilities.enums;

import co.com.bancolombia.certificacion.app.errors.exceptions.FieldProductAssertion;
import co.com.bancolombia.certificacion.app.questions.factory.ChannelLogFactory;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public enum FilesIseriesChannelLog {

    COMFFLGWWW0369 (ChannelLogFactory.theChannelLog0369(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    COMFFLGWWW0322 (ChannelLogFactory.theChannelLog0322(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    //COMFFLGWWW0325 (ChannelLogFactory.theChannelLog0325(), FieldProductAssertion.class, NOT_WORKS),
    COMFFLGWWW0326 (ChannelLogFactory.theChannelLog0326(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS);


    private static final Logger LOGGER = LogManager.getLogger();

    Question<Boolean> question;
    Class clase;
    String mensaje;
    FilesIseriesChannelLog(Question<Boolean> question, Class clase, String mensaje) {
        this.question = question;
        this.clase = clase;
        this.mensaje = mensaje;
    }

    public Question<Boolean> ofTheFile() {
        return question;
    }
    public Class<AssertionError> getException() {
        return clase;
    }
    public String getMessage() {
        return mensaje;
    }

    public static FilesIseriesChannelLog getSearchFile(String nombre) {

        FilesIseriesChannelLog[] lista = FilesIseriesChannelLog.values();
        boolean existe = Arrays.stream(lista).anyMatch(x -> x.name().equalsIgnoreCase(nombre));
        if (!existe) {
            LOGGER.error(new RuntimeException("".concat(nombre) + "'s question not exits"));
        }
        return FilesIseriesChannelLog.valueOf(nombre);
    }
}
