package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.movimiento.Movimiento;
import co.com.bancolombia.certificacion.app.models.productos.Producto;
import co.com.bancolombia.certificacion.app.models.saldo.Saldo;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

import java.util.ArrayList;
import java.util.List;

public class ProductoBuilder implements Builder<Producto> {
    private String numero;
    private String tipo;
    private String codigoBanco;
    private String nombreBanco;
    private String nombreProducto;
    private Saldo saldo = new Saldo();
    private List<Movimiento> movimientos = new ArrayList<>();

    private ProductoBuilder(){
        this.numero = "";
        this.tipo = "";
        this.codigoBanco = "";
        this.nombreBanco = "";
        this.nombreProducto = "";
    }

    public static ProductoBuilder elProducto(){
        return new ProductoBuilder();
    }

    public ProductoBuilder conTipoCuenta(List<String> datosProducto){
        this.tipo = datosProducto.get(0);
        return this;
    }

    public ProductoBuilder conTipoCuenta(String datosProducto){
        this.tipo = datosProducto;
        return this;
    }

    public ProductoBuilder conNumero(List<String> datosProducto){
        this.numero = datosProducto.get(1);
        return this;
    }

    public ProductoBuilder conNumero(String datosProducto){
        this.numero = datosProducto;
        return this;
    }

    public ProductoBuilder conSaldo(Saldo saldo){
        this.saldo = saldo;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    @Override
    public Producto build() {
        return new Producto(this);
    }
}
