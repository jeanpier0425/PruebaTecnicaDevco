package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.Mostrar;
import tasks.Hacer;
import tasks.Llenar;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EstadiaStepDefinition {

    @Cuando("^El usuario hace una reserva con los siguientes datos$")
    public void elUsuarioHaceUnaReservaConLosSiguientesDatos(Map<String, String> informacionreserva) {
        theActorInTheSpotlight().attemptsTo(Hacer.unaReserva(informacionreserva));
    }

    @Entonces("^El debe usuario ver un mesaje de alerta$")
    public void elUsuarioDebeVerUnMensajeDeAlerta() {
        theActorInTheSpotlight().should(seeThat(Mostrar.mensajeAlerta()));
    }
}
