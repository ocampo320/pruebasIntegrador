package com.sophossolutions.www.stepdefinitions.api;

import static com.sophossolutions.www.util.Constantes.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import com.sophossolutions.www.task.ConsultarPais;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class StepDefinitionsCountries {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("AnaM");
	}

	@Given("^Buscar el pais correspondiente al (\\d+) en el api$")
	public void buscarPais(int codLlamada) {
		theActorInTheSpotlight().whoCan(CallAnApi.at(URL));
		theActorInTheSpotlight().attemptsTo(ConsultarPais.pais(String.valueOf(codLlamada)+SLASH_URL));
	}

	@Then("^valido \"([^\"]*)\" y el (.*)$")
	public void validar(String nombre, String dominio) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("name", equalTo(nombre))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.body("topLevelDomain", equalTo(dominio))));
	}

}
