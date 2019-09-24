package co.com.bancolombia.certificacion.app.interactions.eprepago;

import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.models.eprepago.Eprepago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.EprepagoBuilder.eprepago;
import static co.com.bancolombia.certificacion.app.userinterface.pages.eprepago.Activacion_InactivacionEprepagoPage.TXT_CAMPOS_ACTIVACION_EPREPAGO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.ModeloConstantes.MODELO_ACTIVACION_EPREPAGO;

public class GuardarCamposEprepago implements Interaction {

    private String[] camposeprepago = {"Saldo Disponible",
            "Tarjeta MasterCard",
            "Fecha de Vencimiento",
            "Codigo de Seguridad (CVC2)"};

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Eprepago> listaCamposEprepago = new ArrayList<>();
        RealizarScroll.adicional(TXT_CAMPOS_ACTIVACION_EPREPAGO.of(String.valueOf(camposeprepago[3])));
        listaCamposEprepago.add(
                eprepago().conSaldoDisponible(TXT_CAMPOS_ACTIVACION_EPREPAGO.of(camposeprepago[0]).resolveFor(actor).getText())
                        .conNumeroTarjeta(TXT_CAMPOS_ACTIVACION_EPREPAGO.of(camposeprepago[1]).resolveFor(actor).getText())
                        .conFechaVencimiento(TXT_CAMPOS_ACTIVACION_EPREPAGO.of(camposeprepago[2]).resolveFor(actor).getText())
                        .conCvc(TXT_CAMPOS_ACTIVACION_EPREPAGO.of(camposeprepago[3]).resolveFor(actor).getText()).build()
        );

        actor.remember(MODELO_ACTIVACION_EPREPAGO, listaCamposEprepago);
    }

    public static GuardarCamposEprepago esExitoso() {
        return new GuardarCamposEprepago();
    }
}
