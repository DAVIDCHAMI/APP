package co.com.bancolombia.certificacion.app.interactions.comunes;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SeleccionarApp implements Interaction {
    private String nombreApp;
    private String xpathApp = "//android.widget.TextView[contains(@text,'REEMPLAZAR')]";

    public SeleccionarApp(String nombreApp) {
        this.nombreApp = nombreApp;
    }

    public static Performable desdeRecientes(String nombreApp) {
        return instrumented(SeleccionarApp.class, nombreApp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        xpathApp = xpathApp.replace("REEMPLAZAR", nombreApp);
        AndroidDriver driver = getProxiedDriver();
        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        WaitUntil.the(By.xpath(xpathApp), isClickable());
        Esperar.unTiempo(5000);
        JavaScriptClick.on(By.xpath(xpathApp));
    }
}
