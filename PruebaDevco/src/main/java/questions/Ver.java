package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interfaces.FlightPage.LBL_MENSAJE_VUELO;

public class Ver implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_VUELO.resolveFor(actor).isVisible();
    }

    public static Ver mensajeDeVuelo(){
        return new Ver();
    }
}