package co.com.bancolombia.certificacion.app.utilidades.constantes;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_CONSTANTE;

public class MenuConstantes {
    public static final String INICIO = "Link_HomeScreen_BottomBar";
    public static final String MIS_PRODUCTOS = "Link_MyProducts_BottomBar";
    public static final String BILLETERA = "Link_Wallet_BottomBar";
    public static final String SOLICITAR_PRODUCTOS = "Link_Requests_BottomBar";
    public static final String PERFIL = "Link_Profile_BottomBar";

    private MenuConstantes() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }
}
