package co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class AvancesLocator {
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$t");
    public static final Locator LST_TARJETAS_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='Screen_CreditCard_List2']//div").withIos("xpath$h");
    public static final Locator LST_CAMPO_CLAVE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_TextVar']").withIos("xpath$f");
    public static final Locator BTN_TARJETA_CREDITO_LOCATOR = locator().withAndroid("id$b12-Tab2").withIos("xpath$f");

    private AvancesLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}
