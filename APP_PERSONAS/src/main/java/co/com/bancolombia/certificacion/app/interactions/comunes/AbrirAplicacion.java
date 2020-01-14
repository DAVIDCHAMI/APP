package co.com.bancolombia.certificacion.app.interactions.comunes;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirAplicacion implements Interaction {

    public static Performable deCorreoElectronico() {
        return instrumented(AbrirAplicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", "85b6523638553857");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.todo1.bc.proyecto7");
        capabilities.setCapability("appActivity", "com.todo1.bc.proyecto7.MainActivity");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("newCommandTimeout", "1000");
        capabilities.setCapability("autoWebview", true);
        capabilities.setCapability("enablePerformanceLogging", true);
        capabilities.setCapability("autoWebviewTimeout", "20000");
        capabilities.setCapability("chromedriverExecutable", "D:/chromedriver.exe");
        capabilities.setCapability("noReset", true);
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}