package co.com.bancolombia.certificacion.app.models.transaccion;


import co.com.bancolombia.certificacion.app.models.producto.Producto;

public class Transferencia {

    private Producto productoOrigen;
    private Producto productoDestino;
    private String monto;
    private String tipoTransferencia;
    private String banco;
    private String descripcion;
    private String informacionAdicional;
    private String codigoOperacion;

    public Producto getProductoOrigen() {
        return productoOrigen;
    }

    public void setProductoOrigen(Producto originProduct) { this.productoOrigen = originProduct; }
    
    public Producto getProductoDestino() {
        return productoDestino;
    }

    public void setProductoDestino(Producto destinationProduct) {
        this.productoDestino = destinationProduct;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String amount) {
        this.monto = amount;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public String getCodigoOperacion() {
        return codigoOperacion;
    }

    public void setCodigoOperacion(String codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }
}
