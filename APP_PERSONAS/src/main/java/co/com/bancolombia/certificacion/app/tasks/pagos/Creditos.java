package co.com.bancolombia.certificacion.app.tasks.pagos;

import co.com.bancolombia.certificacion.app.models.productos.Credito;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.logging.Level;
import java.util.logging.Logger;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.pagos.PagosPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.OTRO_VALOR;

public class Creditos implements Task {
    private static final Logger LOGGER = Logger.getAnonymousLogger();
    private Credito credito;
    private Producto productoDebitar;

    public Creditos(Credito credito, Producto productoDebitar) {
        this.credito = credito;
        this.productoDebitar = productoDebitar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Check.whether(LBL_CREDITOS.resolveFor(actor).isVisible()).andIfSo(
                            Click.on(BTN_CREDITO.of(credito.getTipo(), credito.getNumero()))
                    )
            );
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "El usuario únicamente posee un único crédito", e);
        }
        actor.attemptsTo(
                Scroll.to(LBL_TIPO_PAGO.of(credito.getTipoPago())),
                Click.on(LBL_TIPO_PAGO.of(credito.getTipoPago())),
                Check.whether(OTRO_VALOR.equals(credito.getTipoPago())).andIfSo(
                        Enter.theValue(credito.getValorPago()).into(TXT_VALOR_PAGAR),
                        Click.on(LNK_SIGUIENTE)
                ),
                Scroll.to(BTN_PRODUCTO_ORIGEN.of(productoDebitar.getTipo(), productoDebitar.getNumero())),
                Click.on(BTN_PRODUCTO_ORIGEN.of(productoDebitar.getTipo(), productoDebitar.getNumero())),
                Click.on(BTN_PAGAR)
        );
    }
}
