package co.com.bancolombia.certificacion.app.utilidades.enumeradores;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.MIS_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.SOLICITAR_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.SubMenuConstantes.*;

public enum TipoTransaccion {
    CONSULTAR_PRODUCTO(MIS_PRODUCTOS, CONSULTAR_MIS_PRODUCTOS),
    TRANSFERIR_DINERO(MIS_PRODUCTOS, SUB_TRANSFERIR_DINERO),
    RECIBIR_DINERO(MIS_PRODUCTOS, SUB_INSCRIBIR_PRODUCTOS),
    PAGAR_TARJETAS_DE_CREDITO_Y_CREDITOS(MIS_PRODUCTOS, SUB_RECIBIR_DINERO),
    CONSULTAR_PUNTOS_COLOMBIA(SOLICITAR_PRODUCTOS, "Inversiones");

    private String menu;
    private String submenu;

    TipoTransaccion(String menu, String submenu) {
        this.menu = menu;
        this.submenu = submenu;
    }

    public String getMenu() {
        return menu;
    }

    public String getSubmenu() {
        return submenu;
    }
}



