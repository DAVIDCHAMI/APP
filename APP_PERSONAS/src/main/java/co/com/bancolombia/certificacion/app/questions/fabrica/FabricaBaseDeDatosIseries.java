package co.com.bancolombia.certificacion.app.questions.fabrica;

import co.com.bancolombia.certificacion.app.questions.basededatos.iseries.*;
import net.serenitybdd.screenplay.Question;


public class FabricaBaseDeDatosIseries {

    private FabricaBaseDeDatosIseries() {
    }

    public static Question<Boolean> elArchivoEnIseriesPCCFFPPCLI() { return new ConsultarRegistroEnPCCFFPPCLI(); }

    public static Question<Boolean> elArchivoEnIseriesCABFFTARJ() {
        return new ConsultarRegistroEnCABFFTARJ();
    }

    public static Question<Boolean> elArchivoEnIseriesWWWFFUSRSV() {
        return new ConsultarRegistroEnWWWFFUSRSV();
    }

    public static Question<Boolean> elArchivoEnIseriesTERMCONDITION() {
        return new ConsultarRegistroEnWWWFFLGTYC();
    }

    public static Question<Boolean> elArchivoEnIseriesCABFFPPMAE() {return new ConsultarRegistroEnCABFFPPMAE();}

    public static Question<Boolean> elArchivoEnIseriesSCIFFSALDOdebit() {return new ConsultarDebitoEnSCIFFSALDO();}

    public static Question<Boolean> elArchivoEnIseriesSCIFFSALDOcredit() {return new ConsultarCreditoEnSCIFFSALDO();}

    public static Question<Boolean> elArchivoEnIseriesTCBFFMAE() {return new ConsultarRegistroEnTCBFFMAE();}

    public static Question<Boolean> elArchivoEnIseriesSCIFFMRCMVdebit() {return new ConsultarDebitoEnSCIFFMRCMV();}

    public static Question<Boolean> elArchivoEnIseriesSCIFFMRCMVcredit() {return new ConsultarCreditoEnSCIFFMRCMV();}

    public static Question<Boolean> elArchivoEnIseriesCABFFPPAUT() {return new ConsultarRegistroEnCABFFPPAUT();}

    public static Question<Boolean> elArchivoEnIseriesPCCMOVTFLOGTFdebit() { return new ConsultarDebitoEnMOVTFLOGTF(); }

    public static Question<Boolean> elArchivoEnIseriesPCCMOVTFLOGTFcredit() { return new ConsultarCreditoEnMOVTFLOGTF(); }

}
