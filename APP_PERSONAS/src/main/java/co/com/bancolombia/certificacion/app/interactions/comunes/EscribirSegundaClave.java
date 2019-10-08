package co.com.bancolombia.certificacion.app.interactions.comunes;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.bancolombia.certificacion.app.userinterface.pages.registro.InscripcionClaveDinamicaPage.TXT_SEGUNDA_CLAVE;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class EscribirSegundaClave implements Interaction {



    @Override
    public <T extends Actor> void performAs(T actor) {

        AppiumDriver driver = getProxiedDriver();
        (new TouchAction(driver)).tap(PointOption.point(122, 350)).perform();

        actor.attemptsTo(
                Type.theValue("4321").into(TXT_SEGUNDA_CLAVE)
        );
    }

    public static EscribirSegundaClave enLaApp(){
        return new EscribirSegundaClave();
    }
}