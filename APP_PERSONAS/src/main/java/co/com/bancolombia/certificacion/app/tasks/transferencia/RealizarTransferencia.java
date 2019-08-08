package co.com.bancolombia.certificacion.app.tasks.transferencia;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.MenuPage.OPT_SUB_MENU;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.transferencia.TransferenciaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TRANSFERIR_PRODUCTOS_NO_INSCRITOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS;
import static co.com.bancolombia.certificacion.app.utilidades.enumeradores.TipoTransaccionEnum.TRANSFERIR_DINERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RealizarTransferencia implements Task {
    private Transferencia transferencia;

    public RealizarTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPT_SUB_MENU.of(TRANSFERIR_DINERO.getSubMenu()), isPresent()),
                Click.on(OPT_SUB_MENU.of(TRANSFERIR_DINERO.getSubMenu())),
                RealizarScroll.hastaPosicionDeTarget(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero())),
                SeleccionarProducto.desdeSaldosMovimientos(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero(), CUENTA_ESPECIFICA_PRODUCTO),
                Click.on(TXT_VALOR_TRANSFERENCIA),
                Click.on(TXT_VALOR_TRANSFERENCIA),
                Escribir.enCampoTexto(transferencia.getMonto()),
                Click.on(BTN_SIGUIENTE),
                Check.whether((transferencia.getTipoTransferencia()).contains(TRANSFERIR_PRODUCTOS_NO_INSCRITOS)).
                        andIfSo(
                                Click.on(OPT_TIPO_TRANSFERENCIA.of(TRANSFERIR_PRODUCTOS_NO_INSCRITOS)),
                                Click.on(TXT_NUMERO_CUENTA_DESTINO),
                                Escribir.enCampoTexto(transferencia.getProductoDestino().getNumero()),
                                RealizarScroll.hastaPosicionDeTarget(CHK_TIPO_CUENTA.of(transferencia.getProductoDestino().getTipo())),
                                Click.on(CHK_TIPO_CUENTA.of(transferencia.getProductoDestino().getTipo())),
                                Click.on(BTN_SIGUIENTE)
                        ), Check.whether((transferencia.getTipoTransferencia()).contains(TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS)).
                        andIfSo(
                                Click.on(OPT_TIPO_TRANSFERENCIA.of(TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS)),
                                RealizarScroll.hastaPosicionDeTarget(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero())),
                                SeleccionarProducto.desdeSaldosMovimientos(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero(), CUENTA_ESPECIFICA_PRODUCTO)
                        ),

                Click.on(BTN_ENVIAR_DINERO)
        );
    }

    public static RealizarTransferencia conInfo(TransferenciaBuilder transferencia) {
        return instrumented(RealizarTransferencia.class, transferencia.build());
    }
}