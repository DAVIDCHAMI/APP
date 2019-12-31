package co.com.bancolombia.certificacion.app.questions.avancetarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;

public class VerificarAvance implements Question<Boolean> {
    private TarjetaCredito tarjetaCredito;

    public VerificarAvance(TarjetaCredito tarjetacredito){
        this.tarjetaCredito= tarjetacredito;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_AVANCE_EXISTOSO.resolveAllFor(actor).toString().trim().contains(tarjetaCredito.getMensajeConfirmacion());
    }

    public static VerificarAvance esExitosoCon(TarjetaCreditoBuilder datosExcel) {
        return new VerificarAvance(datosExcel.build());
    }
}