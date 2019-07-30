package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.transaccion.Transferencia;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.List;
import java.util.Map;

public class TransferenciaBuilder implements Builder<Transferencia> {
    private Producto productoOrigen = new Producto();
    private Producto productoDestino;
    private String monto;
    private String tipoTransferencia;
    private String banco;
    private String descripcion;
    private String informacionAdicional;
    private String codigoOperacion;

    public TransferenciaBuilder(List<Map<String, String>> datos) {
        this.productoOrigen.setTipo(datos.get(0).get("tipoCuenta"));
        this.productoOrigen.setNumero(datos.get(0).get("numeroCuenta"));
        this.monto = datos.get(0).get("valor");
        this.descripcion = datos.get(0).get("descripcion");
        this.informacionAdicional = datos.get(0).get("nombrePersonalizado");
    }

    public TransferenciaBuilder() {
        this.productoOrigen.setTipo("");
        this.productoOrigen.setNumero("");
        this.monto = "";
        this.descripcion = "";
    }

    public TransferenciaBuilder conDescripcion(List<Map<String, String>> datos){
        this.descripcion = datos.get(0).get("descripcion");
        return this;
    }

    public TransferenciaBuilder conMonto(List<Map<String, String>> datos){
        this.monto = datos.get(0).get("monto");
        return this;
    }

    public TransferenciaBuilder conNumeroCuenta(List<Map<String, String>> datos){
        this.productoOrigen.setNumero(datos.get(0).get("numeroCuenta"));
        return this;
    }

    public TransferenciaBuilder conTipoCuenta(List<Map<String, String>> datos){
        this.productoOrigen.setTipo(datos.get(0).get("tipoCuenta"));
        return this;
    }

    public static TransferenciaBuilder con() {
        return new TransferenciaBuilder();
    }

    public Producto getProductoOrigen() {
        return productoOrigen;
    }

    public Producto getProductoDestino() {
        return productoDestino;
    }

    public String getMonto() {
        return monto;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public String getBanco() {
        return banco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigoOperacion() {
        return codigoOperacion;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    @Override
    public Transferencia build() {
        return new Transferencia(this);
    }
}
