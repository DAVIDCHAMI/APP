package co.com.bancolombia.certificacion.app.interactions.consultas.saldos;

import co.com.bancolombia.certificacion.app.interactions.comunes.Esperar;
import co.com.bancolombia.certificacion.app.interactions.scroll.RealizarScroll;
import co.com.bancolombia.certificacion.app.interactions.scroll.SwipeHorizontal;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.OPCION_SELECCIONAR_CATEGORIA_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar.elementoVisible;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.CUENTAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SeleccionarCategoriaCarrusel implements Interaction {


   /* public SeleccionarCategoriaCarrusel(String categoria) {
        this.categoria = categoria;
    }*/

    @Override
    public <T extends Actor> void performAs(T actor) {

        Target carrusel = Target.the("").locatedBy("//img[@id='CarrouselIconInactiveImg']");
        Target target1 = Target.the("").locatedBy("//span[contains(text(),'Inversiones'])");
        Target targetRight = Target.the("").locatedBy("//div[@id='b31-Tab{0}']");
        Target targetCuentasdeposito = Target.the("").locatedBy("//div[@id='l7-{0}-AccountDataContainer']");
        Target targetTipoCuentasdeposito = Target.the("").locatedBy("(//div[@class='font-family-OpenSans-regular']//span[@class='font-family-OpenSans-regular'])[{0}]");

        int iterador =1;
        int cont=0;

        carrusel.resolveFor(actor).click();

        while(targetTipoCuentasdeposito.of(String.valueOf(iterador)).resolveFor(actor).isPresent()){


            System.out.println("productos: "+iterador+" - ");
            actor.attemptsTo(
                    RealizarScroll.hastaPosicionDeTarget(targetTipoCuentasdeposito.of(String.valueOf(iterador)))
            );

            //targetTipoCuentasdeposito.of(String.valueOf(iterador)).resolveFor(actor).waitUntilPresent().click();

            iterador = iterador+1;
        }
    }

    public static SeleccionarCategoriaCarrusel deSaldosMovimientos() {
        return instrumented(SeleccionarCategoriaCarrusel.class);
    }
}
