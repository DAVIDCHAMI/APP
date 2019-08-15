package co.com.bancolombia.certificacion.app.tasks.bloqueos;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_PRODUCTO;

public class Tarjeta extends Bloqueo {
    private Producto producto;

    public Tarjeta(Producto producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RealizarScroll.hastaPosicionDeTarget(BTN_TARJETA_BLOQUEAR.of(producto.getTipo(), producto.getNumero())),
                Click.on(BTN_TARJETA_BLOQUEAR.of(producto.getTipo(), producto.getNumero())),
                Click.on(LNK_BLOQUEAR),
                Click.on(BTN_BLOQUEAR)
        );
        actor.remember(MODELO_PRODUCTO, producto);
    }
}
