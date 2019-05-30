package co.com.bancolombia.utilities.enums;

import co.com.bancolombia.errors.exceptions.FieldProductAssertion;
import co.com.bancolombia.questions.factory.DataBaseIseriesFactory;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import static co.com.bancolombia.errors.exceptions.FieldProductAssertion.*;

public enum FilesIseries {

    SCIFFSALDO (DataBaseIseriesFactory.theIseriesFileSCIFFSALDO(), FieldProductAssertion.class, NOT_WORKS),
    CABFFPPAUT (DataBaseIseriesFactory.theIseriesFileCABFFPPAUT(), FieldProductAssertion.class, NOT_WORKS),
    PCCFFPPCLI (DataBaseIseriesFactory.theIseriesFilePCCFFPPCLI(), FieldProductAssertion.class, NOT_WORKS),
    CABFFTARJ  (DataBaseIseriesFactory.theIseriesFileCABFFTARJ(), FieldProductAssertion.class, NOT_WORKS),
    WWWFFUSRSV (DataBaseIseriesFactory.theIseriesFileWWWFFUSRSV(), FieldProductAssertion.class, NOT_WORKS),
    TERMCONDITION (DataBaseIseriesFactory.theIseriesFileTERMCONDITION(), FieldProductAssertion.class, NOT_WORKS),
    CABFFPPMAE (DataBaseIseriesFactory.theIseriesFileCABFFPPMAE(), FieldProductAssertion.class, NOT_WORKS),
    TCBFFMAE (DataBaseIseriesFactory.theIseriesFileTCBFFMAE(), FieldProductAssertion.class, NOT_WORKS),
    SCIFFMRCMV (DataBaseIseriesFactory.theIseriesFileSCIFFMRCMV(), FieldProductAssertion.class, NOT_WORKS);


    private static final Logger LOGGER = LogManager.getLogger();

    Question<Boolean> question;
    Class clase;
    String mensaje;

    FilesIseries(Question<Boolean> question, Class clase, String mensaje) {
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

    public static FilesIseries getSearchFile(String nombre) {

        FilesIseries[] lista = FilesIseries.values();
        boolean existe = Arrays.stream(lista).anyMatch(x -> x.name().equalsIgnoreCase(nombre));
        if (!existe) {
            LOGGER.error(new RuntimeException("".concat(nombre) + "'s question not exits"));
        }
        return FilesIseries.valueOf(nombre);
    }
}
