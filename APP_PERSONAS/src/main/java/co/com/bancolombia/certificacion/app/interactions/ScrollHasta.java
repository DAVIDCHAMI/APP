package co.com.bancolombia.certificacion.app.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ScrollHasta implements Interaction {
    private Target elemento;

    public ScrollHasta(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        TouchAction action = new TouchAction((AppiumDriver) driver);
        Dimension dimension = driver.manage().window().getSize();
        int posicionInicialX = dimension.width / 2;
        int posicionInicialY = dimension.height / 2;
        int posicionFinalY = elemento.resolveFor(actor).getCoordinates().onPage().y;
        while (posicionFinalY > dimension.height) {
            action.longPress(PointOption.point(posicionInicialX, posicionInicialY));
            action.moveTo(PointOption.point(posicionInicialX, 1000));
            action.release().perform();
            posicionFinalY = elemento.resolveFor(actor).getCoordinates().onPage().y;
        }
        action.longPress(PointOption.point(posicionInicialX, posicionInicialY));
        action.moveTo(PointOption.point(posicionInicialX, 1000));
        action.release().perform();
    }

    public static Performable elTarget(Target elemento) {
        return instrumented(ScrollHasta.class, elemento);
    }
}
