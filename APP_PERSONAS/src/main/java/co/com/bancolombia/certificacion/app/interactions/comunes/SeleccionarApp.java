package co.com.bancolombia.certificacion.app.interactions.comunes;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SeleccionarApp implements Interaction {

    public static Performable desdeRecientes(){
        return instrumented(SeleccionarApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver driver = getProxiedDriver();
        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Personas')]")).click();
    }
}
