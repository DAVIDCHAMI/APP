package co.com.bancolombia.certificacion.app.utilidades.string;

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
}
