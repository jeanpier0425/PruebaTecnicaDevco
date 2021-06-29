package stepdefinitions;

import cucumber.api.java.es.Cuando;
import tasks.Adicionar;
import tasks.Hacer;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PackageStepDefinition {

    @Cuando("^El usuario adiciona un equipaje con los siguientes datos$")
    public void elUsuarioAdicionaUnEquipajeConLosSiguientesDatos(Map<String, String> infopackage) {
        theActorInTheSpotlight().attemptsTo(Adicionar.unPaquete(infopackage));
    }
}
