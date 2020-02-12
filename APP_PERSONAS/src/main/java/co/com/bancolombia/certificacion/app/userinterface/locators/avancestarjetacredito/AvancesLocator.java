package co.com.bancolombia.certificacion.app.userinterface.locators.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_LOCATOR;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class AvancesLocator
{
    public static final Locator BTN_SIGUIENTE_LOCATOR = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$//XCUIElementTypeButton[@name='SIGUIENTE']");
    public static final Locator LST_CAMPO_CLAVE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_TextVar']").withIos("xpath$//XCUIElementTypeOther[12]/XCUIElementTypeTextField");
    public static final Locator BTN_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//div[@id='b13-Tab2']").withIos("xpath$//XCUIElementTypeStaticText[@name='Tarjetas de créditos']");
    public static final Locator IMG_TARJETA_GENERAL_SELECCIONADA_LOCATOR = locator().withAndroid("xpath$//div[@id='b13-Tab2']").withIos("xpath$//XCUIElementTypeStaticText[@name='Ingresa el código de seguridad']/../preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeImage");
    public static final Locator BTN_PRODUCTO_ORIGEN_TARJETA_CREDITO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']").withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator BTN_REALIZA_AVANCES_LOCATOR = locator().withAndroid("xpath$(//span[contains(text(),'Realizar avances')])[2]").withIos("xpath$//XCUIElementTypeStaticText[@name='Realizar avances']");
    public static final Locator TXT_VALOR_AVANCE_LOCATOR = locator().withAndroid("xpath$//input[@id='Input_Valor']").withIos("xpath$//XCUIElementTypeApplication[@name='Personas']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeTextField");
    public static final Locator BTN_SIGUIENTE_AVANCE_LOCATOR = locator().withAndroid("xpath$//button[@id='VerificationNextButton']").withIos("xpath$//XCUIElementTypeStaticText[@name='Siguiente']");
    public static final Locator LST_PRODUCTO_DESTINO_LOCATOR = locator().withAndroid("xpath$//span[text()='{0}']").withIos("xpath$//XCUIElementTypeStaticText[@name='{0}']");
    public static final Locator BTN_REALIZA_AVANCE_LOCATOR = locator().withAndroid("xpath$//button[@id='RequestAdvanceButton']").withIos("xpath$//XCUIElementTypeButton[@name='REALIZAR AVANCE']");
    public static final Locator MIS_PRODUCTOS_AVANCE_LOCATOR = locator().withAndroid("xpath$//span[@id='Tab1Expression']").withIos("xpath$//XCUIElementTypeStaticText[@name='Mis Productos']");
    public static final Locator LBL_CUPO_INSUFICIENTE_AVANCE_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'Cupo insuficiente')]").withIos("xpath$//XCUIElementTypeStaticText[@name='Cupo insuficiente']");
    public static final Locator LBL_AVANCE_EXISTOSO_LOCATOR = locator().withAndroid("xpath$//span[contains(text(),'¡Avance exitoso!')]").withIos("xpath$//XCUIElementTypeStaticText[@name='¡Avance exitoso!']");
    public static final Locator BTN_CUENTAS_INSCRITAS_LOCATOR = locator().withAndroid("xpath$//span[@id='Tab2Expression']").withIos("xpath$//XCUIElementTypeStaticText[@name='Inscritos']");

    private AvancesLocator(){throw new IllegalStateException(CLASE_LOCATOR);}
}