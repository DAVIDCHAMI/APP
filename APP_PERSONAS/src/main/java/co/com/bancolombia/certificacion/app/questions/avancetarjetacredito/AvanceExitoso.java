package co.com.bancolombia.certificacion.app.questions.avancetarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;

public class AvanceExitoso implements Question<Boolean> {
    private boolean exitoso = false;
    private TarjetaCredito tarjetaCredito;

    public AvanceExitoso(TarjetaCredito tarjetacredito){
        this.tarjetaCredito= tarjetacredito;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (MENSAJE_EXISTOSO_AVANCE.resolveAllFor(actor).toString().trim().contains(tarjetaCredito.getMensajeConfirmacion())){
            exitoso = true;
        }
        return exitoso;
    }

    public static AvanceExitoso validarAvance(TarjetaCreditoBuilder datosExcel) {
        return new AvanceExitoso(datosExcel.build());
    }
}
