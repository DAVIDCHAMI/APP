package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static co.com.bancolombia.certificacion.app.userinterface.pages.consultas.saldos.SaldosMovimientosPage.OPCION_CATEGORIA_PRODUCTOS;

public class RevisarProductos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> productosCliente = new ArrayList<>();
        for(int i = 1; i <=6; i++){
            if(OPCION_CATEGORIA_PRODUCTOS.of(String.valueOf(i)).resolveFor(actor).isVisible()){
                productosCliente.add(OPCION_CATEGORIA_PRODUCTOS.of(String.valueOf(i)).resolveFor(actor).getText());
            }else{
                break;
            }
        }
        System.out.println(productosCliente.size());
        return productosCliente.size() != 1;
    }

    public static RevisarProductos pertenecientesAlUsuario(){
        return new RevisarProductos();
    }
}
