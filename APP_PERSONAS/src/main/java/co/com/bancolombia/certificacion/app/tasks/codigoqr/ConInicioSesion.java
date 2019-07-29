package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import co.com.bancolombia.certificacion.app.interactions.Escribir;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.*;
import static co.com.bancolombia.certificacion.app.userinterface.pages.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.String.UtileriaString.darFormato;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CEROS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.VariablesSesionConstantes.INFO_CODIGO_QR;

public class ConInicioSesion extends GenerarQR {
    private Transferencia datos;

    public ConInicioSesion(TransferenciaBuilder datos) {
        this.datos = datos.build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GENERAR_CODIGO_QR),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_PRODUCTO_ORIGEN.of(datos.getProductoOrigen().getTipo(), datos.getProductoOrigen().getNumero())),
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
        if ("".equals(datos.getMonto()))
            datos.setMonto(CEROS);
        else
            datos.setMonto(darFormato(datos.getMonto()));
        actor.remember(INFO_CODIGO_QR, datos);
    }
}
