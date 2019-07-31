package co.com.bancolombia.certificacion.app.userinterface.pages.registro;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.registro.InscripcionClaveDinamicaLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class InscripcionClaveDinamicaPage {
    public static final Target TXT_NOMBRE_PERSONALIZADO = Target.the("Campo de texto para ingresar nombre personalizado").located(theElementBy(TXT_NOMBRE_PERSONALIZADO_LOCATOR));
    public static final Target TXT_CORREO = Target.the("Campo de texto para ingresar correo").located(theElementBy(TXT_CORREO_CLAVE_LOCATOR));
    public static final Target CHECK_TIPO_CORREO = Target.the("Selecciona el tipo de correo").located(theElementBy(CHECK_TIPO_CORREO_LOCATOR));
    public static final Target BTN_SIGUIENTE_CLAVE = Target.the("Botón siguiente").located(theElementBy(BTN_SIGUIENTE_CLAVE_LOCATOR));
    public static final Target TXT_NUMERO_CELULAR = Target.the("Campo de texto para ingresar número de celular").located(theElementBy(TXT_NUMERO_CELULAR_LOCATOR));
    public static final Target CHECK_ACEPTO_TERMINOS = Target.the("Check acepto terminos y condiciones").located(theElementBy(CHECK_ACEPTO_TERMINOS_LOCATOR));
    public static final Target BTN_INSCRIBIR_CLAVE = Target.the("Botón inscribir clave").located(theElementBy(BTN_INSCRIBIR_CLAVE_LOCATOR));

    private InscripcionClaveDinamicaPage() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
