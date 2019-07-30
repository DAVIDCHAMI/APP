package co.com.bancolombia.certificacion.app.userinterface.pages.consultas.detalleproductos;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.bancolombia.certificacion.app.userinterface.locators.consultas.detalleproductos.DetalleProductosLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;

public class DetalleProductosPage {
    public static final Target LBL_TIPO_CUENTA = Target.the("Tipo cuenta deposito").locatedBy(dynamicElement(LBL_TIPO_CUENTA_LOCATOR));
    public static final Target LBL_NUMERO_CUENTA = Target.the("Numero cuenta deposito").locatedBy(dynamicElement(LBL_NUMERO_CUENTA_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE = Target.the("Saldo disponible cuenta deposito").locatedBy(dynamicElement(LBL_SALDO_DISPONIBLE_LOCATOR));
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

    private DetalleProductosPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
