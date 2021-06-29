package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;

import java.util.Map;

import static user_interfaces.FlightPage.*;
import static user_interfaces.ReservaPage.*;

public class Reservar implements Task {

    private Map<String, String> flightinfo;

    public Reservar(Map<String, String> flightinfo) {
        this.flightinfo = flightinfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FLIGHT),
                Click.on(BTN_ONE_WAY),
                JavaScriptClick.on(TXT_LUGAR_SALIDA));

        TXT_LUGAR_SALIDA2.resolveFor(actor).sendKeys(flightinfo.get("lugarsalida"));
        TXT_LUGAR_SALIDA2.resolveFor(actor).sendKeys(Keys.ENTER);
        TXT_LUGAR_LLEGADA.resolveFor(actor).click();
        TXT_LUGAR_LLEGADA2.resolveFor(actor).sendKeys(flightinfo.get("lugarllegada"));
        TXT_LUGAR_LLEGADA2.resolveFor(actor).sendKeys(Keys.ENTER);

        actor.attemptsTo(
                Click.on(DTP_FECHA_SALIDA),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(flightinfo.get("fechasalida"))),
                Click.on(BOTON_CONFIRM_FECHAS),
                Click.on(BOTON_BUSQUEDA)
        );
    }

    public static Performable unVuelo(Map<String, String> flightinfo) {
        return Tasks.instrumented(Reservar.class, flightinfo);
    }
}