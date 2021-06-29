package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interfaces.ReservaPage.LBL_MENSAJE_ALERTA;

public class Mostrar implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_MENSAJE_ALERTA.resolveFor(actor).isVisible();
    }

    public static Mostrar mensajeAlerta() {
        return new Mostrar();
    }
}