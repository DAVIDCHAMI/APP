package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.billetera.DatosPagoBilletera;
import co.com.bancolombia.certificacion.app.utilidades.administradores.Builder;
import cucumber.api.java.bs.Dato;

import java.util.List;
import java.util.Map;

public class DatosPagoBilleteraBuilder implements Builder {
    private String establecimiento;
    private String tipoTarjeta;
    private String numeroTarjeta;
    private String subtotal;
    private String iva;
    private String inc;
    private String propina;
    private String totalPagar;

    private DatosPagoBilleteraBuilder() {
        this.establecimiento = "";
        this.tipoTarjeta = "";
        this.numeroTarjeta = "";
        this.subtotal = "";
        this.iva = "";
        this.inc = "";
        this.propina = "";
        this.totalPagar = "";
    }

    public static DatosPagoBilleteraBuilder informacion(){
        return new DatosPagoBilleteraBuilder();
    }

    public DatosPagoBilleteraBuilder dePagoBilletera(List<Map<String, String>> datos){
        this.establecimiento = datos.get(0).get("establecimiento");
        this.tipoTarjeta = datos.get(0).get("tipoTarjeta");
        this.numeroTarjeta = datos.get(0).get("numeroTarjeta");
        this.subtotal = datos.get(0).get("subtotal");
        this.iva = datos.get(0).get("iva");
        this.inc = datos.get(0).get("inc");
        this.propina = datos.get(0).get("propina");
        this.totalPagar = datos.get(0).get("totalPagar");
        return this;
    }

    public DatosPagoBilleteraBuilder conValor(List<Map<String, String>> datos){
        this.subtotal = datos.get(0).get("subtotal");
        return this;
    }

    public DatosPagoBilleteraBuilder conPropina(List<Map<String, String>> datos){
        this.propina = datos.get(0).get("propina");
        return this;
    }

    public DatosPagoBilleteraBuilder conDatosTarjeta(List<Map<String, String>> datos){
        this.tipoTarjeta = datos.get(0).get("tipoTarjeta");
        this.numeroTarjeta = datos.get(0).get("numeroTarjeta");
        return this;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public String getIva() {
        return iva;
    }

    public String getInc() {
        return inc;
    }

    public String getPropina() {
        return propina;
    }

    public String getTotalPagar() {
        return totalPagar;
    }

    @Override
    public DatosPagoBilletera build() {
        return new DatosPagoBilletera(this);
    }
}
