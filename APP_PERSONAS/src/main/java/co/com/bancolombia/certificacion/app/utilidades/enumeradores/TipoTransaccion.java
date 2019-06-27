package co.com.bancolombia.certificacion.app.utilidades.enumeradores;


import co.com.bancolombia.certificacion.app.exceptions.BusquedaFallida;
import co.com.bancolombia.certificacion.app.userinterface.pages.PaginaMenuMisProductos;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;

import static co.com.bancolombia.certificacion.app.userinterface.pages.PaginaMenuInferior.MIS_PRODUCTOS;
import static co.com.bancolombia.certificacion.app.userinterface.pages.PaginaMenuMisProductos.*;

public enum TipoTransaccion {

    CONSULTAR_PRODUCTO(MIS_PRODUCTOS, CONSULTAR_MIS_PRODUCTOS),
    TRANSFERIR_DINERO(MIS_PRODUCTOS, ENVIAR_DINERO),
    RECIBIR_DINERO(MIS_PRODUCTOS, PaginaMenuMisProductos.RECIBIR_DINERO),
    PAGAR_TARJETAS_DE_CREDITO_Y_CREDITOS(MIS_PRODUCTOS, PAGAR_TARJETAS_Y_CREDITOS),
    REALIZAR_AVANCES_Y_DESEMBOLSOS(MIS_PRODUCTOS, REALIZAR_AVANCES),
    INSCRIBIR_PRODUCTO(MIS_PRODUCTOS, INSCRIBIR_PRODUCTOS),
    CONSULTAR_PUNTOS_COLOMBIA(MIS_PRODUCTOS, PaginaMenuMisProductos.CONSULTAR_PUNTOS_COLOMBIA);

    private Target menu;
    private Target submenu;

    TipoTransaccion(Target menu, Target submenu) {
        this.menu = menu;
        this.submenu = submenu;
    }

    public static TipoTransaccion getTransaccion(String tipoTransaccion){
        TipoTransaccion[] lista = TipoTransaccion.values();
        boolean existe = Arrays.stream(lista).anyMatch(x -> x.name().equalsIgnoreCase(tipoTransaccion));
        if (!existe) {
            throw new BusquedaFallida("no existe: ".concat(tipoTransaccion));
        }
        return TipoTransaccion.valueOf(tipoTransaccion);
    }

    public Target getMenu() {
        return menu;
    }

    public Target getSubmenu() {
        return submenu;
    }

}



