package co.marca.com.stepdefinitions.api;

import static co.marca.com.util.Constantes_Countries.URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import co.marca.com.tasks.ConsultarCapital;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class StepDefinitionsRestCountries {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Fulanito");
	}

	@Given("^Buscar codigo de llamada (\\d+)$")
	public void buscarPais(int codLlamada) {
		theActorInTheSpotlight().whoCan(CallAnApi.at(URL));
		theActorInTheSpotlight().attemptsTo(ConsultarCapital.capital(String.valueOf(codLlamada)));

	}

	@Then("^valido el estado (.*)$")
	public void validoEstado(int estado) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(estado)));
	}

	@Given("^Buscar la informacion que corresponda al (\\d+)$")
	public void buscarInformacion(int codLlamada) {
		theActorInTheSpotlight().whoCan(CallAnApi.at(URL));
		theActorInTheSpotlight().attemptsTo(ConsultarCapital.capital(String.valueOf(codLlamada)));

	}

	@Then("^valido la capital \"([^\"]*)\"$")
	public void validar(String capital) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("capital[0]", equalTo(capital))));

	}
}
