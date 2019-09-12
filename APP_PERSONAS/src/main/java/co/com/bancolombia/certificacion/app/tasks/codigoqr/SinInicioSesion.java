package co.com.bancolombia.certificacion.app.tasks.codigoqr;

import co.com.bancolombia.certificacion.app.interactions.comunes.Saltar;
import co.com.bancolombia.certificacion.app.models.builders.TransferenciaBuilder;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.bancolombia.certificacion.app.userinterface.pages.GeneralPage.LNK_SIGUIENTE;
import static co.com.bancolombia.certificacion.app.userinterface.pages.codigoqr.GenerarCodigoQrPage.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.SIN_VALOR;
import static co.com.bancolombia.certificacion.app.utilidades.string.UtileriaString.darFormato;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_INFO_CODIGO_QR;

public class SinInicioSesion extends GenerarQR {
    private String nombrePersonalizado;
    private Transferencia transferencia;

    public SinInicioSesion(String nombrePersonalizado, TransferenciaBuilder transferencia) {
        this.nombrePersonalizado = nombrePersonalizado;
        this.transferencia = transferencia.build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMG_CODIGO_QR_PANTALLA_INICIO),
                Click.on(IMG_CODIGO_QR_FLOTANTE),
                Saltar.onBoarding(),
                Enter.theValue(nombrePersonalizado).into(TXT_NOMBRE_PERSONALIZADO),
                Click.on(LNK_SIGUIENTE),
                Click.on(TXT_NUMERO_PRODUCTO),
                Enter.theValue(transferencia.getProductoOrigen().getNumero()).into(TXT_NUMERO_PRODUCTO),
                Click.on(IMG_FOCO),
                Click.on(BTN_TIPO_PRODUCTO.of(transferencia.getProductoOrigen().getTipo())),
                Click.on(LNK_SIGUIENTE),
                Check.whether("".equals(transferencia.getMonto())).andIfSo(
                        Click.on(BTN_SIN_VALOR)
                ).otherwise(
                        Click.on(BTN_CON_VALOR),
                        Enter.theValue(transferencia.getMonto()).into(TXT_VALOR_RECIBIR)
                ),
                Click.on(LNK_SIGUIENTE),
                Enter.theValue(transferencia.getDescripcion()).into(TXT_DESCRIPCION),
                Click.on(LNK_SIGUIENTE),
                Click.on(BTN_GENERAR_QR)
        );
        if ("".equals(transferencia.getMonto()))
            transferencia.setMonto(SIN_VALOR);
        else
            transferencia.setMonto(darFormato(transferencia.getMonto()));
        actor.remember(MODELO_INFO_CODIGO_QR,transferencia);
    }
}