package co.com.bancolombia.certificacion.app.tasks;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.INFO_CODIGO_QR;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.ingresarTexto;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerarCodigo implements Task {
    private Transferencia datos;

    public GenerarCodigo(Transferencia datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GENERAR_CODIGO_QR),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_PRODUCTO_ORIGEN.of(datos.getProductoOrigen().getTipo(), datos.getProductoOrigen().getNumero())),
        //);
        //actor.attemptsTo(
                Check.whether("".equals(datos.getMonto())).andIfSo(
                        Click.on(BTN_SIN_VALOR)

                ).otherwise(
                        Escribir.enCampoTexto(datos.getMonto())
                ),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_DESCRIPCION),
                Escribir.enCampoTexto(datos.getDescripcion()),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_GENERAR_QR)
        );
        actor.remember(INFO_CODIGO_QR, datos);
    }

    public static GenerarCodigo qr(TransferenciaBuilder transferencia) {
        return instrumented(GenerarCodigo.class, transferencia.build());
    }
}
