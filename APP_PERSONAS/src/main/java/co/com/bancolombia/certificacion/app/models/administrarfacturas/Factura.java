package co.com.bancolombia.certificacion.app.models.administrarfacturas;

import co.com.bancolombia.certificacion.app.models.builders.FacturaBuilder;

public class Factura {
    private String empresa;
    private String descripcion;
    private String referencia;

    public Factura(FacturaBuilder builder) {
        this.empresa = builder.getEmpresa();
        this.descripcion = builder.getDescripcion();
        this.referencia = builder.getReferencia();
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getReferencia() {
        return referencia;
    }
}
