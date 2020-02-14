package co.com.bancolombia.certificacion.app.tasks.billetera;

import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import co.com.bancolombia.certificacion.app.models.builders.DatosPagoBilleteraBuilder;
import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.ListarTarjetasBilletera.IMG_TARJETA_LISTA_ELEGIR;
import static co.com.bancolombia.certificacion.app.userinterface.pages.billetera.VerificarPagoBilletera.*;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.ArchivosUtilidades.abrirCodigoQr;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_BILLETERA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarPago implements Task {
    private DatosPagoBilletera datosPagoBilletera;

    public RealizarPago(DatosPagoBilletera datosPagosBilletera) {
        this.datosPagoBilletera = datosPagosBilletera;
    }

    public static Performable conCodigoQrEstatico(DatosPagoBilleteraBuilder datosPagoBilleteraBuilder) {
        return instrumented(RealizarPago.class, datosPagoBilleteraBuilder.build());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> informacionPago = new ArrayList<>();
        actor.attemptsTo(
                Click.on(IMG_TARJETA_LISTA_ELEGIR.of(datosPagoBilletera.getTipoTarjeta(), datosPagoBilletera.getNumeroTarjeta()))
        );
        abrirCodigoQr("qr_estatico_uno");
        actor.attemptsTo(
                WaitUntil.the(LBL_VERIFICAR_PAGO, isVisible())
        );
        if(Verificar.elementoVisible(actor, LBL_VERIFICAR_PAGO)){
            informacionPago.add(LBL_NOMBRE_ESTABLECIMIENTO_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_TIPO_TARJETA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_NUMERO_TARJETA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_SUBTOTAL_PAGO_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_IVA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_INC_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_PROPINA_VERIFICAR.resolveFor(actor).getText());
            informacionPago.add(LBL_TOTAL_PAGADO_VERIFICAR.resolveFor(actor).getText());
        }
        if(datosPagoBilletera.getInfoPagoDeBilletera().equals(informacionPago)){
            actor.attemptsTo(
                    Click.on(BTN_BILLETERA_PAGAR)
            );
            actor.remember(MODELO_BILLETERA, informacionPago);
        }
    }
}
