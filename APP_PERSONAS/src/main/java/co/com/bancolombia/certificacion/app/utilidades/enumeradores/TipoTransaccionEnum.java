package co.com.bancolombia.certificacion.app.utilidades.enumeradores;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.MenuConstantes.*;

public enum TipoTransaccionEnum {
    CONSULTAR_PRODUCTO(MIS_PRODUCTOS, "Consultar mis productos",""),
    TRANSFERIR_DINERO(MIS_PRODUCTOS, "Transferir dinero",""),
    INSCRIBIR_PRODUCTOS(MIS_PRODUCTOS, "Inscribir productos",""),
    RECIBIR_DINERO(MIS_PRODUCTOS, "Recibir dinero",""),
    PAGAR_TARJETAS_DE_CREDITO_Y_CREDITOS(MIS_PRODUCTOS, "Pagar tarjetas de crédito y créditos",""),
    REALIZAR_AVANCES_DESEMBOLSOS(MIS_PRODUCTOS, "Realizar avances y desembolsos",""),
    PROGRAMAR_PAGAR_FACTURAS(MIS_PRODUCTOS, "Pagar y administrar facturas","Programar y pagar facturas"),
    INSCRIBIR_FACTURAS(MIS_PRODUCTOS, "Pagar y administrar facturas","Inscribir facturas"),
    VER_HISTORICO_PAGOS(MIS_PRODUCTOS, "Pagar y administrar facturas","Ver histórico de pagos"),
    CONSULTAR_PUNTOS_COLOMBIA(MIS_PRODUCTOS, "Consultar Puntos Colombia",""),
    INVERSIONES(SOLICITAR_PRODUCTOS, "Inversiones",""),
    EPREPAGO(SOLICITAR_PRODUCTOS, "e-Prepago",""),
    BLOQUEOS(PERFIL, "Bloqueos","");

    private String menu;
    private String subMenu;
    private String tercerNivel;

    TipoTransaccionEnum(String menu, String subMenu, String tercerNivel) {
        this.menu = menu;
        this.subMenu = subMenu;
        this.tercerNivel = tercerNivel;
    }

    public String getMenu() {
        return menu;
    }

    public String getSubMenu() {
        return subMenu;
    }

    public String getTercerNivel() {
        return tercerNivel;
    }
}