package co.com.bancolombia.certificacion.app.utilidades.administradores;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ArchivosUtilidades {

    public static void abrirCodigoQr(String nombreQr) {
        try {
            File myFile = new File("/Users/mruiz/Documents/ProyectosTODO1/bancolombia-app-personas-osp-tests-bdd-screen-play/APP_PERSONAS/src/test/resources/codigosqr/"+nombreQr);
            Desktop.getDesktop().open(myFile);
        } catch (IOException ex) {
        }
    }
}
