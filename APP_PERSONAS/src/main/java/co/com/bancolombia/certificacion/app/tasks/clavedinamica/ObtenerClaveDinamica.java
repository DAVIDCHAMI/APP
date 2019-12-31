package co.com.bancolombia.certificacion.app.tasks.clavedinamica;

import co.com.bancolombia.certificacion.app.interactions.comunes.LeerClaveDinamica;
import co.com.bancolombia.certificacion.app.interactions.comunes.SeleccionarApp;
import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorDriver.cambiarContextoDriverNativo;
import static co.com.bancolombia.certificacion.app.utilidades.administradores.AdministradorDriver.cambiarContextoDriverWeb;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ObtenerClaveDinamica implements Task {

    public static Performable desdeCorreo() {
        return instrumented(ObtenerClaveDinamica.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String platform = ElementFinder.getPlatformCapability();
        if ("iOS".equalsIgnoreCase(platform)) {
            System.out.println("Hola " + platform);
        } else {
            AppiumDriver driver = getProxiedDriver();
            cambiarContextoDriverNativo(driver);
            actor.attemptsTo(
                    SeleccionarApp.desdeRecientes("Gmail"),
                    LeerClaveDinamica.desdeCorreo()
            );
            actor.attemptsTo(
                    SeleccionarApp.desdeRecientes("Personas")
            );
            cambiarContextoDriverWeb(driver);
        }
    }
}
