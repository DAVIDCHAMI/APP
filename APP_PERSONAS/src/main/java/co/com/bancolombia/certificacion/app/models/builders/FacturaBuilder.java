package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.administrarfacturas.Factura;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.List;
import java.util.Map;

public class FacturaBuilder implements Builder<Factura> {
    private String empresa;
    private String descripcion;
    private String referencia;

    public FacturaBuilder() {
        this.empresa = "";
        this.descripcion = "";
        this.referencia = "";
    }

    public static FacturaBuilder con() {
        return new FacturaBuilder();
    }

    public FacturaBuilder conEmpresa(List<Map<String, String>> datos) {
        this.empresa = datos.get(0).get("empresa");
        return this;
    }

    public FacturaBuilder conEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public FacturaBuilder conDescripcion(List<Map<String, String>> datos) {
        this.descripcion = datos.get(0).get("descripcion");
        return this;
    }

    public FacturaBuilder conDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public FacturaBuilder conReferencia(List<Map<String, String>> datos) {
        this.referencia = datos.get(0).get("referencia");
        return this;
    }

    public FacturaBuilder conReferencia(String referencia){
        this.referencia = referencia;
        return this;
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

    @Override
    public Factura build() {
        return new Factura(this);
    }
}
