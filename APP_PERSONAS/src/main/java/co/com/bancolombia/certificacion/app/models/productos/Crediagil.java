package co.com.bancolombia.certificacion.app.models.productos;


import co.com.bancolombia.certificacion.app.models.builders.CrediagilBuilder;

public class Crediagil extends Producto {
    private String tipoProducto;
    private String cupoDisponible;

    public Crediagil(CrediagilBuilder crediagilBuilder){
        this.tipoProducto = crediagilBuilder.getTipoProducto();
        this.cupoDisponible = crediagilBuilder.getCupoDisponible();
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getCupoDisponible() {
        return cupoDisponible;
    }
}
