package co.com.bancolombia.certificacion.app.utilidades.String;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyMetastate;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.COMA;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_UTILIDAD;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class UtileriaString {

    public static int contarCantidadCaracter(String cadena, char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }

    public static String obtenerValorEntero(String cadena) {
        char[] cadenaAux = cadena.toCharArray();
        String valorEntero = "";
        for (int i = 0; i < cadenaAux.length; i++) {
            if (Character.isDigit(cadenaAux[i]) || cadenaAux[i] == COMA) {
                valorEntero += cadenaAux[i];
            }
        }
        return valorEntero;
    }

    public static String darFormato(String valor) {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator(',');
        simbolo.setGroupingSeparator('.');
        DecimalFormat asignarFormato = new DecimalFormat("0,000.00", simbolo);
        return asignarFormato.format(Double.parseDouble(valor));
    }

    public static void ingresarTexto(String texto) {
        String cadena = texto;
        int codigo = 0;
        AndroidDriver driver = getProxiedDriver();

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            boolean mayus = Character.isUpperCase(letra);
            String Letra = String.valueOf(letra);
            char letras[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                    'w', 'x', 'y', 'z', '@', '.', '1', ' ', '2', '3', '4', '5',
                    '6', '7', '8', '9', '0' };
            int codes[] = { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
                    42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 77, 56,
                    8, 62, 9, 10, 11, 12, 13, 14, 15, 16, 7 };
            for (int j = 0; j <= 38; j++) {
                String LetraA = String.valueOf(letras[j]);
                if (Letra.toLowerCase().equals(LetraA) && mayus == true) {
                    driver.pressKeyCode(codes[j],
                            AndroidKeyMetastate.META_CAPS_LOCK_ON);
                } else if (Letra.toLowerCase().equals(LetraA) && mayus == false) {
                    driver.pressKeyCode(codes[j]);
                }
            }
        }
    }

    private UtileriaString() {
        throw new IllegalStateException(CLASE_UTILIDAD);
    }
}
