package co.com.bancolombia.certificacion.app.interactions.scroll;

import co.com.bancolombia.certificacion.app.interactions.consultas.saldos.SeleccionarCategoria;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SwipeHorizontal implements Interaction {
    private Target elemento;

    public SwipeHorizontal(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        Dimension dimension = driver.manage().window().getSize();

        int posicionFijaX = dimension.width / 2;
        int posicionInicialY = dimension.height / 2;
        int posicionFinalY = dimension.height / 4;

        TouchAction action = new TouchAction((AppiumDriver) driver);
        while (!elemento.resolveFor(actor).isVisible()) {
            action.longPress(PointOption.point(508, 840));
            action.moveTo(PointOption.point(426, 843));
            action.release().perform();
        }
    }

    public static SwipeHorizontal deSaldosMovimientos(Target elemento) {
        return instrumented(SwipeHorizontal.class, elemento);
    }

}
