package co.com.bancolombia.certificacion.app.tasks.transferencia;

import co.com.bancolombia.certificacion.app.interactions.ScrollHasta;
import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarProducto;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.CUENTA_ESPECIFICA_PRODUCTO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.CHECK_TIPO_CORREO;
import static co.com.bancolombia.certificacion.app.userinterface.pages.transferencia.TransferenciaPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TRANSFERIR_PRODUCTOS_NO_INSCRITOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarTransferencia implements Task {
    private Transferencia transferencia;

    public RealizarTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollHasta.elTarget(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero())),
                SeleccionarProducto.desdeSaldosMovimientos(transferencia.getProductoOrigen().getTipo(), transferencia.getProductoOrigen().getNumero(), CUENTA_ESPECIFICA_PRODUCTO),
                Enter.theValue(transferencia.getMonto()).into(VALOR_TRANSFERENCIA),
                Click.on(BTN_SIGUIENTE),
                Check.whether((TRANSFERIR_PRODUCTOS_NO_INSCRITOS).equals(transferencia.getTipoTransferencia())).
                        andIfSo(
                                Enter.theValue(transferencia.getProductoDestino().getNumero()).into(NUMERO_CUENTA_DESTINO),
                                Click.on(CHECK_TIPO_CUENTA.of(transferencia.getTipoTransferencia()))
                        ), Check.whether((TRANSFERIR_PRODUCTOS_PROPIOS_INSCRITOS).equals(transferencia.getTipoTransferencia())).
                        andIfSo(
                                ScrollHasta.elTarget(CUENTA_ESPECIFICA_PRODUCTO.of(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero())),
                                SeleccionarProducto.desdeSaldosMovimientos(transferencia.getProductoDestino().getTipo(), transferencia.getProductoDestino().getNumero(), CUENTA_ESPECIFICA_PRODUCTO)
                        ),
                Click.on(BTN_ENVIAR_DINERO)
        );
    }

    public static RealizarTransferencia conInfo(TransferenciaBuilder transferencia) {
        return instrumented(RealizarTransferencia.class, transferencia.build());
    }
}