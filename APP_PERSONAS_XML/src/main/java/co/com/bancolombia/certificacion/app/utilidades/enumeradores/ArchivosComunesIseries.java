package co.com.bancolombia.certificacion.app.utilidades.enumeradores;

import co.com.bancolombia.certificacion.app.errors.exceptions.FieldProductAssertion;
import co.com.bancolombia.certificacion.app.questions.factory.DataBaseIseriesFactory;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public enum ArchivosComunesIseries {

    SCIFFSALDO_DEBITO (DataBaseIseriesFactory.theIseriesFileSCIFFSALDOdebit(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    SCIFFSALDO_CREDITO (DataBaseIseriesFactory.theIseriesFileSCIFFSALDOcredit(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    CABFFPPAUT (DataBaseIseriesFactory.theIseriesFileCABFFPPAUT(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    PCCFFPPCLI (DataBaseIseriesFactory.theIseriesFilePCCFFPPCLI(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    CABFFTARJ  (DataBaseIseriesFactory.theIseriesFileCABFFTARJ(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    WWWFFUSRSV (DataBaseIseriesFactory.theIseriesFileWWWFFUSRSV(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    TERMCONDITION (DataBaseIseriesFactory.theIseriesFileTERMCONDITION(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    CABFFPPMAE (DataBaseIseriesFactory.theIseriesFileCABFFPPMAE(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    TCBFFMAE (DataBaseIseriesFactory.theIseriesFileTCBFFMAE(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    SCIFFMRCMV_DEBITO (DataBaseIseriesFactory.theIseriesFileSCIFFMRCMVdebit(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    SCIFFMRCMV_CREDITO (DataBaseIseriesFactory.theIseriesFileSCIFFMRCMVcredit(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    PCCFFMOVTFLOGTF_DEBITO (DataBaseIseriesFactory.theIseriesFilePCCMOVTFLOGTFdebit(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS),
    PCCFFMOVTFLOGTF_CREDITO (DataBaseIseriesFactory.theIseriesFilePCCMOVTFLOGTFcredit(), FieldProductAssertion.class, FieldProductAssertion.NOT_WORKS);


    private static final Logger LOGGER = LogManager.getLogger();

    Question<Boolean> question;
    Class clase;
    String mensaje;

    ArchivosComunesIseries(Question<Boolean> question, Class clase, String mensaje) {
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

    public static ArchivosComunesIseries getSearchFile(String nombre) {

        ArchivosComunesIseries[] lista = ArchivosComunesIseries.values();
        boolean existe = Arrays.stream(lista).anyMatch(x -> x.name().equalsIgnoreCase(nombre));
        if (!existe) {
            LOGGER.error(new RuntimeException("".concat(nombre) + "'s question not exits"));
        }
        return ArchivosComunesIseries.valueOf(nombre);
    }
}
