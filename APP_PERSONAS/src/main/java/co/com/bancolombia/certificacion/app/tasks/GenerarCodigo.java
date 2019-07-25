package co.com.bancolombia.certificacion.app.tasks;

import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_PRODUCTO_ORIGEN;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.BTN_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.INFO_CODIGO_QR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerarCodigo implements Task {
    private Transferencia datos;
    private String nombrePersonalizado;

    public GenerarCodigo(Transferencia datos, String nombrePersonalizado) {
        this.datos = datos;
        this.nombrePersonalizado = nombrePersonalizado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GENERAR_CODIGO_QR),
                Clear.field(TXT_NOMBRE_PERSONALIZADO),
                Type.theValue(nombrePersonalizado).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(BTN_SIGUIENTE),
                Click.on(BTN_PRODUCTO_ORIGEN.of(datos.getProductoOrigen().getTipo(), datos.getProductoOrigen().getNumero())),
                Check.whether("".equals(datos.getMonto())).andIfSo(
                        Click.on(BTN_SIN_VALOR)
                ).otherwise(
                        Type.theValue(datos.getMonto()).into(TXT_VALOR_RECIBIR)
                ),
                Click.on(BTN_SIGUIENTE),
                Type.theValue(datos.getDescripcion()).into(TXT_DESCRIPCION),
                Click.on(BTN_SIGUIENTE),
                Click.on(BTN_GENERAR_QR)
        );
        actor.remember(INFO_CODIGO_QR, datos);
    }

    public static GenerarCodigo qr(TransferenciaBuilder transferencia, String nombrePersonalizado) {
        return instrumented(GenerarCodigo.class, transferencia.build(), nombrePersonalizado);
    }
}
