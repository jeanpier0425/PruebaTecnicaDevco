package stepdefinitions;

import cucumber.api.java.es.Cuando;
import tasks.Hacer;
import tasks.Viajar;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ThingToDoStepDefinition
{
    @Cuando("^El usuario elige algo para hacer con los siguientes datos$")
    public void elUsuarioEligeAlgoParaHacerConLosSiguienteSaDatos(Map<String, String> infoReserva) {
        theActorInTheSpotlight().attemptsTo(Viajar.aAlgunLugar(infoReserva));
    }

}
