package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;

import java.util.Map;

import static user_interfaces.ReservaPage.*;
import static user_interfaces.ThingsToDoPage.*;

public class Viajar implements Task {

    private Map<String, String> infoViaje;

    public Viajar(Map<String, String> infoViaje) {
        this.infoViaje = infoViaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BTN_THINGSTODO.resolveFor(actor).click();
        TXT_THINGSTODO.resolveFor(actor).click();
        TXT_THINGSTODO2.resolveFor(actor).sendKeys(infoViaje.get("lugar"));
        TXT_THINGSTODO2.resolveFor(actor).sendKeys(Keys.ENTER);

        actor.attemptsTo(
                Click.on(DTP_THINGS),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(infoViaje.get("checkin"))),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(infoViaje.get("checkout"))),
                Click.on(BOTON_CONFIRM_FECHAS),
                Click.on(BOTON_BUSQUEDA)
        );
    }

    public static Performable aAlgunLugar(Map<String, String> infoViaje) {
        return Tasks.instrumented(Viajar.class, infoViaje);
    }
}