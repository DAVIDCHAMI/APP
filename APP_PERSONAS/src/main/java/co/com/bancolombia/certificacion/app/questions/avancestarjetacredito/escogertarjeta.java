package co.com.bancolombia.certificacion.app.questions.avancestarjetacredito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.bancolombia.certificacion.app.userinterface.pages.avancestarjetacredito.AvancesPage.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class escogertarjeta implements Question<Boolean> {
    public static List<String> data = new ArrayList<>();
    public static boolean tienetarjeta;
    public static String nombretarjeta;
    @Override
    public Boolean answeredBy(Actor actor) {
        if(CONTENEDOR_TARJETAS.resolveFor(actor).withTimeoutOf(20, TimeUnit.SECONDS).isVisible())
        {
            int size=CONTENEDOR_TARJETAS.resolveAllFor(actor).size();
            for (int i = 0; i < size ; i++)
            {
                if(!"".equals(CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText()))
                {
                    nombretarjeta=data.get(2);

                    if(CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).getText().toUpperCase().trim().contains(nombretarjeta.toUpperCase().trim()))
                    {
                        CONTENEDOR_TARJETAS.resolveAllFor(actor).get(i).click();
                        tienetarjeta=true;
                        break;
                    }
                }
            }
        }
        return tienetarjeta;
    }

    public static escogertarjeta poseetarjeta(List<String> dta)
    {
        data= dta;
        return new escogertarjeta();
    }

}