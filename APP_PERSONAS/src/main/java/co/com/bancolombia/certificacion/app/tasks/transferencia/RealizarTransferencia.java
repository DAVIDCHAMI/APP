package co.com.bancolombia.certificacion.app.tasks.transferencia;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.transferencia.TransferenciaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TRANSFERIR_PRODUCTOS_NO_INSCRITOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarTransferencia implements Task {
    private Transferencia transferencia;

    public RealizarTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero()), isVisible()),
                Scroll.to(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero())),
                SeleccionarProducto.desdeSaldosMovimientos(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero(), CUENTA_ESPECIFICA_PRODUCTO),
                Enter.theValue(transferencia.getMonto()).into(TXT_VALOR_TRANSFERENCIA),
                Click.on(LNK_SIGUIENTE));
        actor.attemptsTo(
                Check.whether((transferencia.getTipoTransferencia()).contains(TRANSFERIR_PRODUCTOS_NO_INSCRITOS)).
                        andIfSo(
                                Click.on(OPT_TIPO_TRANSFERENCIA.of(TRANSFERIR_PRODUCTOS_NO_INSCRITOS)),
                                Enter.theValue(transferencia.getProductoDestino().getNumero()).into(TXT_NUMERO_CUENTA_DESTINO),
                                Click.on(TXT_FOCO),
                                Click.on(CHK_TIPO_CUENTA.of(transferencia.getProductoDestino().getTipo())),
                                Click.on(BTN_SIGUIENTE)
                        ), Check.whether((transferencia.getTipoTransferencia()).contains(TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS)).
                        andIfSo(
                                Click.on(OPT_TIPO_TRANSFERENCIA.of(TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS)),
                                WaitUntil.the(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero()), isVisible()),
                                Scroll.to(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero())),
                                SeleccionarProducto.desdeSaldosMovimientos(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero(), CUENTA_ESPECIFICA_PRODUCTO)
                        ),

                Click.on(BTN_ENVIAR_DINERO)
        );
        actor.remember(TIPO_ORIGEN_VERIFICACION, transferencia.getProductoOrigen().getTipo());
        actor.remember(CUENTA_ORIGEN_VERIFICACION, transferencia.getProductoOrigen().getNumero());
        actor.remember(TIPO_DESTINO_VERIFICACION, transferencia.getProductoDestino().getTipo());
        actor.remember(CUENTA_DESTINO_VERIFICACION, transferencia.getProductoDestino().getNumero());
    }

    public static RealizarTransferencia conInfo(TransferenciaBuilder transferencia) {
        return instrumented(RealizarTransferencia.class, transferencia.build());
    }
}