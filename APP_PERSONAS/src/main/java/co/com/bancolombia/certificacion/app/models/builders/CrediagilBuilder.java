package co.com.bancolombia.certificacion.app.models.builders;

import co.com.bancolombia.certificacion.app.models.productos.Crediagil;
import co.com.bancolombia.certificacion.app.utilidades.Builder;

public class CrediagilBuilder implements Builder<Crediagil> {
    private String tipoProducto;
    private String cupoDisponible;

    private CrediagilBuilder(){
        this.tipoProducto = "";
        this.cupoDisponible = "";
    }

    public static CrediagilBuilder crediagil(){
        return new CrediagilBuilder();
    }

    public CrediagilBuilder deTipo(String tipoProducto){
        this.tipoProducto = tipoProducto;
        return this;
    }

    public CrediagilBuilder conCupoDisponible(String cupoDisponible){
        this.cupoDisponible = cupoDisponible;
        return this;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getCupoDisponible() {
        return cupoDisponible;
    }

    @Override
    public Crediagil build() {
        return new Crediagil(this);
    }
}
