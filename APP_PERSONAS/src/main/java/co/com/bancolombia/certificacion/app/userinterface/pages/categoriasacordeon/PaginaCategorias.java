package co.com.bancolombia.certificacion.app.userinterface.pages.categoriasacordeon;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCategorias {

    /**
     * Constante CUENTAS_DEPOSITO
     */
    public static final Target CUENTAS_DEPOSITO = Target
            .the("Opcion 'Cuentas deposito'")
            .located( By.xpath("//*[contains(@id, 'Expandable')]"));

 /**
     * Constante CUENTAS_DEPOSITO
     */
    public static final Target LISTA_CATEGORIAS = Target
            .the("Opcion 'Cuentas deposito'")
         .located(MobileBy.AndroidUIAutomator(
                 "new UiSelector().className(\"android.view.View\").descriptionContains(\"Transferencia realizada\")"));
}
