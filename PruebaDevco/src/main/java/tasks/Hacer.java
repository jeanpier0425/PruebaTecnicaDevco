package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.Map;

import static user_interfaces.ReservaPage.*;

public class Hacer implements Task {

    private Map<String, String> inforeserva;

    public Hacer(Map<String, String> inforeserva) {
        this.inforeserva = inforeserva;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_LUGAR),
                Enter.theValue(inforeserva.get("lugar")).into(TXT_LUGAR2).thenHit(Keys.ENTER),
                Click.on(DTP_CHECKIN),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(inforeserva.get("checkin"))),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(inforeserva.get("checkout"))),
                Click.on(BOTON_CONFIRM_FECHAS),
                Click.on(BOTON_VIAJEROS),
                Click.on(BOTON_CONFIRM_VIAJEROS),
                Click.on(BOTON_BUSQUEDA)
        );
    }

    public static Performable unaReserva(Map<String, String> inforeserva) {
        return Tasks.instrumented(Hacer.class, inforeserva);
    }
}