package co.com.bancolombia.certificacion.app.utilidades.enumeradores;

import co.com.bancolombia.certificacion.app.exceptions.AfirmacionDelProducto;
import co.com.bancolombia.certificacion.app.questions.fabrica.FabricaBaseDeDatosIseries;
import net.serenitybdd.screenplay.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public enum ArchivosComunesIseries {

    SCIFFSALDO_DEBITO (FabricaBaseDeDatosIseries.theIseriesFileSCIFFSALDOdebit(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    SCIFFSALDO_CREDITO (FabricaBaseDeDatosIseries.theIseriesFileSCIFFSALDOcredit(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    CABFFPPAUT (FabricaBaseDeDatosIseries.theIseriesFileCABFFPPAUT(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    PCCFFPPCLI (FabricaBaseDeDatosIseries.theIseriesFilePCCFFPPCLI(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    CABFFTARJ  (FabricaBaseDeDatosIseries.theIseriesFileCABFFTARJ(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    WWWFFUSRSV (FabricaBaseDeDatosIseries.theIseriesFileWWWFFUSRSV(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    TERMCONDITION (FabricaBaseDeDatosIseries.theIseriesFileTERMCONDITION(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    CABFFPPMAE (FabricaBaseDeDatosIseries.theIseriesFileCABFFPPMAE(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    TCBFFMAE (FabricaBaseDeDatosIseries.theIseriesFileTCBFFMAE(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    SCIFFMRCMV_DEBITO (FabricaBaseDeDatosIseries.theIseriesFileSCIFFMRCMVdebit(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    SCIFFMRCMV_CREDITO (FabricaBaseDeDatosIseries.theIseriesFileSCIFFMRCMVcredit(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    PCCFFMOVTFLOGTF_DEBITO (FabricaBaseDeDatosIseries.theIseriesFilePCCMOVTFLOGTFdebit(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA),
    PCCFFMOVTFLOGTF_CREDITO (FabricaBaseDeDatosIseries.theIseriesFilePCCMOVTFLOGTFcredit(), AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA);


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
