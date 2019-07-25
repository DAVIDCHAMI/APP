package co.com.bancolombia.certificacion.app.utilidades.string;

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

    private UtileriaString() {
        throw new IllegalStateException(CLASE_UTILIDAD);
    }
}
