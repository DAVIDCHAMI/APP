package co.com.bancolombia.certificacion.app.userinterface.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.GenerarCodigoQrLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.dynamicElement;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class GenerarCodigoQrPage {
    public static final Target BTN_GENERAR_CODIGO_QR = Target.the("Botón generar codigo qr").located(theElementBy(BTN_GENERAR_CODIGO_QR_LOCATOR));
    public static final Target TXT_NOMBRE_PERSONALIZADO = Target.the("Nombre personalizado").locatedBy(dynamicElement(TXT_NOMBRE_PERSONALIZADO_LOCATOR));
    public static final Target TXT_VALOR_RECIBIR = Target.the("Valor a recibir").located(theElementBy(TXT_VALOR_RECIBIR_LOCATOR));
    public static final Target BTN_SIN_VALOR = Target.the("Botón sin valor").located(theElementBy(BTN_SIN_VALOR_LOCATOR));
    public static final Target TXT_DESCRIPCION = Target.the("Descripción").locatedBy(dynamicElement(TXT_DESCRIPCION_LOCATOR));
    public static final Target BTN_GENERAR_QR = Target.the("Botón confirmar generación de codigo qr").located(theElementBy(BTN_GENERAR_QR_LOCATOR));
    public static final Target IMG_CODIGO_QR = Target.the("Botón confirmar generación de codigo qr").located(theElementBy(IMG_CODIGO_QR_LOCATOR));
    public static final Target IMG_CODIGO_QR_PANTALLA_INICIO = Target.the("Botón código qr de pantella de inicio").located(theElementBy(IMG_CODIGO_QR_PANTALLA_INICIO_LOCATOR));
}
