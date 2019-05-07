package co.com.bancolombia.certificacion.app.utilities.constantes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilities.constantes.TipoClaseConstante.CLASE_CONSTANTE;

/**
 * The type Constant found.
 */
public class FondoConstante {

    /**
     * The constant BIBLIOTECA_POR_CODIGO.
     */
    public static final Map<String, String> BIBLIOTECA_POR_CODIGO;

    static {
        Map<String, String> map = new HashMap<>();
        map.put("ALTERNATIVO DINAMICO", "FAD");
        map.put("FIDURENTA", "F16");
        map.put("RENTA FIJA PLAZO", "R18");
        map.put("FIDUCUENTA", "F01");
        map.put("ACCIONES SECTORIAL", "FAS");
        map.put("FONDO ACCIONES UNIACCION", "FAU");
        map.put("FIDUEXCEDENTES", "FIE");
        map.put("C.C.A.P.P. INDEXADO ACCIONES", "FXP");
        map.put("RENTA TES", "RTE");
        map.put("RENTA DOLARES", "RUS");
        map.put("FONDO RENTA BALANCEADO", "085");
        map.put("RENTA ACCIONES", "RAC");
        map.put("INDECCION", "FIN");
        map.put("104", "104");
        BIBLIOTECA_POR_CODIGO = Collections.unmodifiableMap(map);
    }

    private FondoConstante() {
        throw new IllegalStateException(CLASE_CONSTANTE);
    }

}
