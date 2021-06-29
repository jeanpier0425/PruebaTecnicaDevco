package stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;

import static tasks.Realizar.validacion;

public class PruebasManualesStepDefinition {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Dado("^(.*)$")
    public void pruebasManuales(String paso) {
        validacion(paso, scenario.getName());
    }
}
