package co.com.bancolombia.certificacion.app.tasks.tarjetacredito;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.tarjetacredito.TarjetaCreditoPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_DETALLE_PRODUCTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_TARJETA_CREDITO;

public class NoPropia implements Task {
    private TarjetaCredito tarjetaCredito;
    private Producto productoDebitar;

    public NoPropia(TarjetaCredito tarjetaCredito, Producto productoDebitar) {
        this.tarjetaCredito = tarjetaCredito;
        this.productoDebitar = productoDebitar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(LBL_TIPO_PAGO.of(PAGAR_TARJETA_CREDITO_NO_PROPIA)),
                Enter.theValue(tarjetaCredito.getNumero()).into(TXT_NUMERO_TARJETA),
                //Escribir.enCampoTexto(tarjetaCredito.getNumero()),
                Click.on(LNK_SIGUIENTE),
                //Scroll.to(LBL_VERIFICACION.of(tarjetaCredito.getTipoPago())),
                //RealizarScroll.hastaPosicionDeTarget(LBL_VERIFICACION.of(tarjetaCredito.getTipoPago())),
                Click.on(LBL_TIPO_PAGO_TARJETA.of(tarjetaCredito.getTipoPago()))
        );
        actor.attemptsTo(
                Check.whether(OTRO_VALOR.equals(tarjetaCredito.getTipoPago())).andIfSo(
                        Check.whether(tarjetaCredito.getNumero().charAt(0)!='4').andIfSo(
                                Click.on(CHK_MONEDA.of(tarjetaCredito.getMoneda()))
                        ),
                        Enter.theValue(tarjetaCredito.getValorPago()).into(TXT_VALOR_PAGAR),
                        //Click.on(TXT_VALOR_PAGAR),
                        //Escribir.enCampoTexto(tarjetaCredito.getValorPago()),
                        Click.on(LNK_SIGUIENTE)
                ),
                Scroll.to(BTN_PRODUCTO_ORIGEN.of(productoDebitar.getTipo(), productoDebitar.getNumero())),
                //RealizarScroll.hastaPosicionDeTarget(BTN_PRODUCTO_ORIGEN.of(productoDebitar.getTipo(), productoDebitar.getNumero())),
                Click.on(BTN_PRODUCTO_ORIGEN.of(productoDebitar.getTipo(), productoDebitar.getNumero())),
                Click.on(BTN_PAGAR)
                //RealizarScroll.hastaPosicionDeTarget(LBL_VERIFICACION.of(PRODUCTO_ORIGEN)),
                //Click.on(LBL_VERIFICACION.of(PRODUCTO_ORIGEN))
        );
        actor.remember(MODELO_DETALLE_PRODUCTO, productoDebitar);
        actor.remember(MODELO_TARJETA_CREDITO, tarjetaCredito);
    }
}
