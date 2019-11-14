package co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class AvancesLocator
{
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$t");
    public static final Locator LST_TARJETAS_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='Screen_CreditCard_List2']//div").withIos("xpath$h");
    public static final Locator LST_CAMPO_CLAVE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_TextVar']").withIos("xpath$f");
    public static final Locator BTN_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='b12-Tab2']").withIos("xpath$f");
    public static final Locator SESSION_AVANCES = locator().withAndroid("xpath$(//span[contains(text(),'Realizar avances')])[2]").withIos("xpath$d");
    public static final Locator LISTADO_TARJETAS = locator().withAndroid("xpath$//div[@id='ListCards']//div").withIos("xpath$d");
    public static final Locator TXT_VALOR_AVANCE = locator().withAndroid("xpath$//input[@id='Input_Valor']").withIos("xpath$d");
    public static final Locator BTN_SIGUIENTE_AVANCE = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$d");
    public static final Locator LST_PRODUCTO_DESTINO = locator().withAndroid("xpath$//div[@id='Account_List']//div").withIos("xpath$d");
    public static final Locator BTN_REALIZA_AVANCE = locator().withAndroid("xpath$//button[@id='RequestAdvanceButton']").withIos("xpath$d");
    public static final Locator MIS_PRODUCTOS_AVANCE_LOCATOR = locator().withAndroid("xpath$//span[@id='Tab1Expression']").withIos("xpath$d");
    public static final Locator TARJETAS_INSCRITAS_LOCATOR = locator().withAndroid("xpath$//span[@id='Tab2Expression']").withIos("xpath$d");
    public static final Locator MENSAJE_CUPO_INSUFICIENTE_LOCATOR= locator().withAndroid("xpath$//span[contains(text(),'Cupo insuficiente')]").withIos("xpath$d");
    public static final Locator MENSAJE_AVANCE_EXITOSO_LOCATOR= locator().withAndroid("xpath$//span[contains(text(),'¡Avance exitoso!')]").withIos("xpath$d");
    public static final Locator BTN_INSCRITOS_LOCATORS= locator().withAndroid("xpath$//span[@id='Tab2Expression']").withIos("xpath$d");

    private AvancesLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}
