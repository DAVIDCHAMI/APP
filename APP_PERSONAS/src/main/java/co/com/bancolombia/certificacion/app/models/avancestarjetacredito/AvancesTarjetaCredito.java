package co.com.bancolombia.certificacion.app.models.avancestarjetacredito;

import co.com.bancolombia.certificacion.app.models.builders.AvancesTarjetaCreditoBuilder;

public class AvancesTarjetaCredito
{
    private String numerotarjeta;
    private String CodigoSeguridad;

    public  AvancesTarjetaCredito (AvancesTarjetaCreditoBuilder builder)
    {
        this.numerotarjeta = builder.getNumeroTarjeta();
        this.CodigoSeguridad = builder.getCodigoScurity();
    }

    public String getNumerotarjeta() {return numerotarjeta;}

    public String getCodigoSeguridad() {return CodigoSeguridad;}
}

