package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import questions.Ver;
import tasks.Reservar;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VueloStepDefinition {

    @Cuando("^El usuario hace la reserva de un vuelo con los siguientes datos$")
    public void elUsuarioHaceUnaReservaDeUnVueloConLosSiguientesDatos(Map<String, String> informacionvuelo) {
        theActorInTheSpotlight().attemptsTo(Reservar.unVuelo(informacionvuelo));
    }

    @Entonces("^El usuario debe ver un mesaje de alerta$")
    public void elUsuarioDebeVerUnMesajeDelVuelo() {
        theActorInTheSpotlight().should(seeThat(Ver.mensajeDeVuelo()));
    }
}