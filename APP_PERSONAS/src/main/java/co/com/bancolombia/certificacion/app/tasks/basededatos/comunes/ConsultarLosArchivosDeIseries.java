package co.com.bancolombia.certificacion.app.tasks.basededatos.comunes;

import co.com.bancolombia.certificacion.app.exceptions.productos.AfirmacionDelProducto;
import co.com.bancolombia.certificacion.app.models.transaccion.ConfiguracionTransaccion;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.ArchivosComunesIseries;
import co.com.bancolombia.certificacion.app.utilidades.enumeradores.ArchivosLogCanalIseries;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.StringManager.getFileName;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DATOS_TRANSACCION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class ConsultarLosArchivosDeIseries implements Task {

    private static final String LOGCANAL = "COMFFLGWWW";
    private List<String> files;

    public ConsultarLosArchivosDeIseries(List<String> files) {
        this.files = files;
    }

    public static ConsultarLosArchivosDeIseries enApp(List<String> files) {
        return instrumented(ConsultarLosArchivosDeIseries.class, files);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ConfiguracionTransaccion transaccion = actor.recall(MODELO_DATOS_TRANSACCION);

        for (String file : files){
           String dato = getFileName(file);
           String codTrn = transaccion.getCodigoTransaccion();

            if (LOGCANAL.equals(dato)){
               ArchivosLogCanalIseries laVerificacion = ArchivosLogCanalIseries.getSearchFile(dato+codTrn);
               theActorInTheSpotlight().should(seeThat(laVerificacion.delArchivo(),is(true)).orComplainWith( laVerificacion.getException(), laVerificacion.getMessage()));
           }else{
               ArchivosComunesIseries theVerification = ArchivosComunesIseries.getSearchFile(dato);
               theActorInTheSpotlight().should(seeThat(theVerification.delArchivo(),is(true)).orComplainWith(AfirmacionDelProducto.class, AfirmacionDelProducto.NO_FUNCIONA));
           }
       }
    }

    private ConsultarLosArchivosDeIseries(){}

}
