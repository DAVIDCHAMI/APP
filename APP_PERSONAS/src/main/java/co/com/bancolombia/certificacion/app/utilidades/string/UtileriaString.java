package co.com.bancolombia.certificacion.app.utilidades.string;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.Constantes.COMA;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

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

    private UtileriaString() {
        throw new IllegalStateException(CLASE_UTILIDAD);
    }
}