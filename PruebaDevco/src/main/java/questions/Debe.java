package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static user_interfaces.RegistroPage.BTN_USER;

public class Debe implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BTN_USER.resolveFor(actor).getText();
    }

    public static Debe verseElUsuario() {
        return new Debe();
    }
}
