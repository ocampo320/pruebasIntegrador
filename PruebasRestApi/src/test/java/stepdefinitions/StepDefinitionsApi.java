package stepdefinitions;

import static utilidades.Constantes.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import task.ConsultarPelicula;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


public class StepDefinitionsApi {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Semillero");
	}

	@Given("^El (\\d+) en una base de datos$")
	public void idBase(int id) {
		theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
		theActorInTheSpotlight().attemptsTo(ConsultarPelicula.consulta(String.valueOf(id)+SLASH_URL));
	}

	@Then("^valido \"([^\"]*)\" y el (\\d+)$")
	public void validoTituloEpisodio(String titulo, int episodio) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(400)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("episode_id", equalTo(episodio))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("title", equalTo(titulo))));
	}
}
