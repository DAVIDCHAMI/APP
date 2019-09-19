package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.productos.Prestamo;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.List;
import java.util.Map;

public class PrestamoBuilder implements Builder<Prestamo> {
    private String tipoPago;
    private String valorPago;
    private String tipoPrestamo;
    private String numeroPrestamo;

    private PrestamoBuilder() {
        this.tipoPago = "";
        this.valorPago = "";
    }

    public static PrestamoBuilder prestamo(){
        return new PrestamoBuilder();
    }

    public PrestamoBuilder conTipoPago(List<Map<String, String>> datos){
        this.tipoPago = datos.get(0).get("tipoPago");
        return this;
    }

    public PrestamoBuilder conValor(List<Map<String, String>> datos){
        this.valorPago = datos.get(0).get("valorPago");
        return this;
    }

    public PrestamoBuilder conPrestamo(List<Map<String, String>> datos){
        this.tipoPrestamo = datos.get(0).get("tipoPrestamo");
        this.numeroPrestamo = datos.get(0).get("numeroPrestamo");
        return this;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public String getValorPago() {
        return valorPago;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    @Override
    public Prestamo build() {
        return new Prestamo(this);
    }
}
