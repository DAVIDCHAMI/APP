package co.com.bancolombia.certificacion.app.models.productos;


import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilidades.constantes.FondoConstante.BIBLIOTECA_POR_CODIGO;

/**
 * The type Investment fund.
 */
public class FondoInversion extends Producto {

    private String codigo;

    public FondoInversion(){
        super ();
    }

    /**
     * Instantiates a new Producto.
     *
     * @param numero       the numero
     * @param tipoProducto the productos type
     */
    public FondoInversion(String numero, String tipoProducto) {
        super(numero, tipoProducto);
    }

    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setCodigoFondo(String fundCode) {
        this.codigo = castTypeFundCode(fundCode);
    }

    private String castTypeFundCode(String typeFund) {
        typeFund = typeFund.toUpperCase();
        Map<String, String> map = BIBLIOTECA_POR_CODIGO;
        String type = map.get(typeFund);
        if (type == null) {
            throw new NullPointerException("NO EXISTE ESTE FONDO");
        } else {
            return type;
        }
    }


}
