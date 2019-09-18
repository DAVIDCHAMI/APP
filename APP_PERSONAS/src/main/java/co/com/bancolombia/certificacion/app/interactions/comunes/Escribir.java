package co.com.bancolombia.certificacion.app.interactions.comunes;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

import static co.com.bancolombia.certificacion.app.userinterface.pages.autenticacion.InicioSesionPage.TXT_CLAVE_DIGITOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Escribir implements Interaction {
    private String cadena;

    public Escribir(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        IOSDriver myDriver = getProxiedDriver();
        String libreria= ElementFinder.getPlatformCapability();

        if(("Android").equalsIgnoreCase(libreria)){
            AndroidDriver driver = getProxiedDriver();
            for (int i = 0; i < cadena.length(); i++) {
                char letra = cadena.charAt(i);
                boolean mayus = Character.isUpperCase(letra);
                String letraTeclado = String.valueOf(letra);
                char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z', '@', '.', '1', ' ', '2', '3', '4', '5',
                        '6', '7', '8', '9', '0'};
                int[] codigoLetra = {29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
                        42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 77, 56,
                        8, 62, 9, 10, 11, 12, 13, 14, 15, 16, 7};
                for (int j = 0; j <= 38; j++) {
                    String letraA = String.valueOf(letras[j]);
                    if (letraTeclado.equalsIgnoreCase(letraA) && mayus) {
                        driver.pressKeyCode(codigoLetra[j],
                                AndroidKeyMetastate.META_CAPS_LOCK_ON);

                    } else if (letraTeclado.equalsIgnoreCase(letraA) && !mayus) {
                        driver.pressKeyCode(codigoLetra[j]);
                    }
                }
            }
        }
        else{
            (new TouchAction(myDriver)).tap(PointOption.point(104,296)).perform();
            actor.attemptsTo(
                    Type.theValue(cadena).into(TXT_CLAVE_DIGITOS)
            );

        }
    }

    public static Escribir enCampoTexto(String cadena) {
        return instrumented(Escribir.class, cadena);
    }
}