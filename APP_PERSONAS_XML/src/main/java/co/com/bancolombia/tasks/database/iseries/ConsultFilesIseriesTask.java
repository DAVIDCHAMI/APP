package co.com.bancolombia.tasks.database.iseries;

import co.com.bancolombia.models.entities.CurrentTrasactionConfigEntity;
import co.com.bancolombia.models.transaction.TransactionConfig;
import co.com.bancolombia.utilities.enums.FilesIseries;
import co.com.bancolombia.utilities.enums.FilesIseriesChannelLog;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static co.com.bancolombia.utilities.managers.StringManager.getFileName;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class ConsultFilesIseriesTask implements Task {

    private static final String LOGCANAL = "COMFFLGWWW";

    private List<String> files;

    /**
     * Instantiates a new Authentication task.
     *
     * @param files the data
     */
    public ConsultFilesIseriesTask(List<String> files) {
        this.files = files;
    }

    /**
     * In app task.
     *
     * @return the task
     */
    public static ConsultFilesIseriesTask inApp(List<String> files) {
        return instrumented(ConsultFilesIseriesTask.class, files);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        TransactionConfig transaction = CurrentTrasactionConfigEntity.getTransactionConfig();

       for (String file : files){
           String dato = getFileName(file);
           String codTrn = transaction.getTransactionCode();

           if (LOGCANAL.equals(dato)){
               FilesIseriesChannelLog theVerification = FilesIseriesChannelLog.getSearchFile(dato+codTrn);
               theActorInTheSpotlight().should(seeThat(theVerification.ofTheFile(),is(true)).orComplainWith( theVerification.getException(), theVerification.getMessage()));
           }else{
               FilesIseries theVerification = FilesIseries.getSearchFile(dato);
               theActorInTheSpotlight().should(seeThat(theVerification.ofTheFile(),is(true)).orComplainWith( theVerification.getException(), theVerification.getMessage()));
           }
       }
    }


    private ConsultFilesIseriesTask(){}

}
