package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.StringManager;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static user_interfaces.RegistroPage.*;
import static utils.StringManager.generateEmail;

public class Llenar implements Task {

    private Map<String, String> infopersonal;

    public Llenar(Map<String, String> infopersonal) {
        this.infopersonal = infopersonal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGNIN),
                Click.on(BTN_CREAR_CUENTA),
                Enter.theValue(infopersonal.get("nombre")).into(TXT_NOMBRE),
                Enter.theValue(infopersonal.get("apellido")).into(TXT_APELLIDO),
                Enter.theValue(generateEmail()).into(TXT_EMAIL),
                Enter.theValue(infopersonal.get("password")).into(TXT_PASSWORD),
                Enter.theValue(infopersonal.get("confirmpass")).into(TXT_CONFIRM_PASSWORD),
                Click.on(CHK_TC),
                Click.on(BTN_SUBMIT)
        );
    }

    public static Performable formulario(Map<String, String> infopersonal) {
        return instrumented(Llenar.class, infopersonal);
    }
}