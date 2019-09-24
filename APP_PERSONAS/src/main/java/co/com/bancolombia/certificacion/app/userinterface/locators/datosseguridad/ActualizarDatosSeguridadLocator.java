package co.com.bancolombia.certificacion.app.userinterface.locators.datosseguridad;

import co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator;

import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.Locator.locator;

public class ActualizarDatosSeguridadLocator {
    public static final Locator TXT_CORREO_ACTUALIZAR_LOCATOR = locator().withAndroid("xpath$//input[@id='OSInline']").withIos("xpath$test");
    public static final Locator TXT_NUMERO_ACTUALIZAR_LOCATOR= locator().withAndroid("xpath$//input[@id='Input_PhoneNumber']").withIos("xpath$test");
    public static final Locator FOCO_LOCATOR= locator().withAndroid("xpath$//span[text()='ACTUALIZAR DATOS DE SEGURIDAD']").withIos("xpath$test");
}
