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

        int iterador =1;
        int cont=0;

        carrusel.resolveFor(actor).click();

        while(targetRight.of(String.valueOf(iterador)).resolveFor(actor).isPresent()){
            targetRight.of(String.valueOf(iterador)).resolveFor(actor).click();
            System.out.println("contador de productos: "+cont);
            cont = cont +1;
            iterador = iterador+1;
        }
        System.out.println("contador de productos total : "+(cont));
   //     target1.resolveFor(actor).waitUntilPresent().click();
    }

    public static SeleccionarCategoriaCarrusel deSaldosMovimientos() {
        return instrumented(SeleccionarCategoriaCarrusel.class);
    }
}
