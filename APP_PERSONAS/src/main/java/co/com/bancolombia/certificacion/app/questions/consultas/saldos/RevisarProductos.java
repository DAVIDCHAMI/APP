package co.com.bancolombia.certificacion.app.questions.consultas.saldos;

import co.com.bancolombia.certificacion.app.utilidades.administradores.Verificar;
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
            if(Verificar.elementoVisible(actor, OPCION_CATEGORIA_PRODUCTOS.of(String.valueOf(i)))){
                productosCliente.add(OPCION_CATEGORIA_PRODUCTOS.of(String.valueOf(i)).resolveFor(actor).getText());
            }else{
                break;
            }
        }
        return productosCliente.size() != 1;
    }

    public static RevisarProductos pertenecientesAlUsuario(){
        return new RevisarProductos();
    }
}
