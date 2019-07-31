package co.com.bancolombia.certificacion.app.tasks.tarjetacredito;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder;
import co.com.bancolombia.certificacion.app.models.builders.TarjetaCreditoBuilder;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.productos.TarjetaCredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.TarjetaCreditoPage.CHK_MONEDA;
import static co.com.bancolombia.certificacion.app.userinterface.pages.TarjetaCreditoPage.TXT_VALOR_PAGAR;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.*;

public class NoPropia extends PagarTC {
    private TarjetaCredito tarjetaCredito;
    private Producto productoDebitar;

    public NoPropia(TarjetaCreditoBuilder tarjetaCredito, ProductoBuilder productoDebitar) {
        this.tarjetaCredito = tarjetaCredito.build();
        this.productoDebitar = productoDebitar.build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_VERIFICACION.of(PAGAR_TARJETA_CREDITO_NO_PROPIA)),
                Escribir.enCampoTexto(tarjetaCredito.getNumero()),
                Click.on(LNK_SIGUIENTE),
                Click.on(LBL_VERIFICACION.of(tarjetaCredito.getTipoPago())),
                Check.whether(OTRO_VALOR.equals(tarjetaCredito.getTipoPago())).andIfSo(
                        Click.on(CHK_MONEDA.of(tarjetaCredito.getMoneda())),
                        Click.on(TXT_VALOR_PAGAR),
                        Escribir.enCampoTexto(tarjetaCredito.getValorPago())
                        ),
                Click.on(BTN_PRODUCTO_ORIGEN.of(productoDebitar.getTipo(), productoDebitar.getNumero())),
                Click.on(BOTON.of(PAGAR))
        );
    }
}
