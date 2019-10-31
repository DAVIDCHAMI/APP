package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.avancestarjetacredito.AvancesTarjetaCredito;

import java.util.List;

public class AvancesTarjetaCreditoBuilder
{
    private String NumeroTarjeta;
    private String CodigoScurity;

    public AvancesTarjetaCreditoBuilder(List<String> datos)
    {
        this.NumeroTarjeta=datos.get(2);
        this.CodigoScurity =datos.get(3);
    }

    public String getNumeroTarjeta() {return NumeroTarjeta;}
    public String getCodigoScurity() {return CodigoScurity;}
    public static AvancesTarjetaCreditoBuilder con(List<String> datos){return  new AvancesTarjetaCreditoBuilder(datos);}
    public AvancesTarjetaCredito build(){return new AvancesTarjetaCredito(this);}
}
