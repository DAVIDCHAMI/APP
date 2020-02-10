package co.com.bancolombia.certificacion.app.userinterface.pages.billetera;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.certificacion.app.userinterface.locators.billetera.ListarTarjetasBilleteraLocator.*;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_INTERFAZ_USUARIO;
import static co.com.bancolombia.certificacion.app.utilidades.mobileobjectfinder.ElementFinder.theElementBy;

public class ListarTarjetasBilletera {
    public static final Target LBL_TARJETAS_LISTADAS = Target.the("Tarjetas listadas (listar publico)").located(theElementBy(LBL_TARJETAS_LISTADAS_LOCATOR));
    public static final Target BTN_ACTIVAR_BILLETERA = Target.the("Boton activar Billetera").located(theElementBy(BTN_ACTIVAR_TARJETA_LOCATOR));
    public static final Target BTN_VISTA_CARRUSEL = Target.the("Boton activar vista Carrusel").located(theElementBy(BTN_VISTA_CARRUSEL_LOCATOR));
    public static final Target BTN_VISTA_LISTA = Target.the("Boton activar vista Lista").located(theElementBy(BTN_VISTA_LISTA_LOCATOR));
    public static final Target IMG_TARJETA_LISTA_ELEGIR = Target.the("Tarjeta elegida para pagar (lista)").located(theElementBy(IMG_TARJETA_LISTA_ELEGIR_LOCATOR));
    public static final Target BTN_QR_LISTA = Target.the("Boton pagar con QR (desde tarjeta - lista)").located(theElementBy(BTN_QR_LISTA_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_LISTA = Target.the("Saldo disponible de la tarjeta (lista)").located(theElementBy(LBL_SALDO_DISPONIBLE_LISTA_LOCATOR));
    public static final Target IMG_TARJETA_CARRUSEL_ELEGIR = Target.the("Tarjeta elegida para pagar (carrusel)").located(theElementBy(IMG_TARJETA_CARRUSEL_ELEGIR_LOCATOR));
    public static final Target BTN_QR_CARRUSEL = Target.the("Boton pagar con QR (Desde tarjeta - carrusel)").located(theElementBy(BTN_QR_CARRUSEL_LOCATOR));
    public static final Target LBL_SALDO_DISPONIBLE_CARRUSEL = Target.the("Saldo disponible de la tarjeta (carrusel)").located(theElementBy(LBL_SALDO_DISPONIBLE_CARRUSEL_LOCATOR));

    private ListarTarjetasBilletera() {
        throw new IllegalStateException(CLASE_INTERFAZ_USUARIO);
    }
}
