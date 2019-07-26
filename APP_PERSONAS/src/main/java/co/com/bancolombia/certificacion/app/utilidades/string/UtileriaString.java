package co.com.bancolombia.certificacion.app.utilidades.String;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.PUNTO;
import static co.com.bancolombia.certificacion.app.utilidades.constantes.TipoClaseConstante.CLASE_UTILIDAD;

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
            if (Character.isDigit(cadenaAux[i]) || cadenaAux[i] == PUNTO) {
                valorEntero += cadenaAux[i];
            }
        }
        return valorEntero;
    }

    private UtileriaString() {
        throw new IllegalStateException(CLASE_UTILIDAD);
    }
}