package co.com.bancolombia.certificacion.app.utilidades.String;

import co.com.bancolombia.certificacion.app.models.productos.Producto;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.models.builders.ProductoBuilder.elProducto;

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

    public static List<Producto> retornarListaProducto(List<Producto> producto, String tipoCuenta, String numeroCuenta){
        List<Producto> hola = new ArrayList<>();
        int cantCaracteresTipo = contarCantidadCaracter(tipoCuenta, ';');
        int cadena[] = new int[cantCaracteresTipo];
        String separadorUno[] = tipoCuenta.split(";");
        String separadorDos[] = numeroCuenta.split(";");
        for (int i = 0; i <= cadena.length; i++) {

        }
        return hola;
    }
}
