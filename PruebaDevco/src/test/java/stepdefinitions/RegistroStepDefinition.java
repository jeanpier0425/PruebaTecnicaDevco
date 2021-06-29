package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import interactions.AbrirNavegador;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.Debe;
import tasks.Llenar;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^El (.*) abre la pagina$")
    public void elUsuarioAbreLaPagina(String user) {
        theActorCalled(user).wasAbleTo(AbrirNavegador.conLaUrl());
    }

    @Cuando("^El usuario hace el registro con los siguientes datos$")
    public void elUsuarioHaceElRegistroConLosSiguientesDatos(Map<String, String> informacionpersonal) {
        theActorInTheSpotlight().attemptsTo(Llenar.formulario(informacionpersonal));
    }

    @Entonces("^El registro debe ser exitoso$")
    public void elRegistroDebeSerExitoso(Map<String, String> nameuser) {
        theActorInTheSpotlight().should(seeThat(Debe.verseElUsuario(), Matchers.equalTo(nameuser.get("nombre"))));
    }


}
