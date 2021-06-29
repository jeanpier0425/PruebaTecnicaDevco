package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;
import java.util.Map;

import static user_interfaces.FlightPage.*;
import static user_interfaces.PackagePage.BTN_PACKACGE;
import static user_interfaces.PackagePage.TXT_SALIDA_PACKAGE;
import static user_interfaces.ReservaPage.*;

public class Adicionar implements Task {

    private Map<String, String> infopaquete;

    public Adicionar(Map<String, String> infopaquete) {
        this.infopaquete = infopaquete;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        BTN_PACKACGE.resolveFor(actor).click();
        TXT_SALIDA_PACKAGE.resolveFor(actor).click();
        TXT_LUGAR_SALIDA2.resolveFor(actor).sendKeys(infopaquete.get("lugarsalida"));
        TXT_LUGAR_SALIDA2.resolveFor(actor).sendKeys(Keys.ENTER);
        TXT_LUGAR_LLEGADA.resolveFor(actor).click();
        TXT_LUGAR_LLEGADA2.resolveFor(actor).sendKeys(infopaquete.get("lugarllegada"));
        TXT_LUGAR_LLEGADA2.resolveFor(actor).sendKeys(Keys.ENTER);

        actor.attemptsTo(
                Click.on(DTP_FECHA_SALIDA),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(infopaquete.get("checkin"))),
                Click.on(BTN_FECHAS_IDA_REGRESO.of(infopaquete.get("checkout"))),
                Click.on(BOTON_CONFIRM_FECHAS),
                Click.on(BOTON_BUSQUEDA)
        );
    }

    public static Performable unPaquete(Map<String, String> infopaquete) {
        return Tasks.instrumented(Adicionar.class, infopaquete);
    }
}