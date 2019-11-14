package co.com.bancolombia.certificacion.app.questions.avancetarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.concurrent.TimeUnit;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;

public class AvanceNoExitoso implements Question<Boolean> {
    private TarjetaCredito tarjetaCredito;
    private Boolean noExitoso;

    public AvanceNoExitoso(TarjetaCredito tarjetaCredito){
        this.tarjetaCredito =tarjetaCredito;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(MENSAJE_CUPO_INSUFICIENTE_AVANCE.resolveFor(actor).withTimeoutOf(20, TimeUnit.SECONDS).isVisible()
                && MENSAJE_CUPO_INSUFICIENTE_AVANCE.resolveAllFor(actor).toString().trim().contains(
                tarjetaCredito.getMensajeAvanceNoExitoso())){
                noExitoso=true;
        }
        return noExitoso;
    }

    public static AvanceNoExitoso validarAvanceNoExitoso(TarjetaCreditoBuilder datosExcel ) {
        return new AvanceNoExitoso(datosExcel.build());
    }


}
