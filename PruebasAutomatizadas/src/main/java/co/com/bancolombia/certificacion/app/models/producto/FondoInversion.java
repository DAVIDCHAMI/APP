package co.com.bancolombia.certificacion.app.models.producto;


import java.util.Map;

import static co.com.bancolombia.certificacion.app.utilities.constantes.FondoConstante.BIBLIOTECA_POR_CODIGO;

/**
 * The type Investment fund.
 */
public class FondoInversion extends Producto {

    private String fundCode;

    public FondoInversion(){
        super ();
    }

    /**
     * Instantiates a new Producto.
     *
     * @param numero       the numero
     * @param tipoProducto the producto type
     */
    public FondoInversion(String numero, String tipoProducto) {
        super(numero, tipoProducto);
    }

    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setCodigoFondo(String fundCode) {
        this.fundCode = castTypeFundCode(fundCode);
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
