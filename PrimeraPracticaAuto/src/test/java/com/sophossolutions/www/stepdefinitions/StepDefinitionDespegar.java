package com.sophossolutions.www.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.questions.ValorVuelo;
import com.sophossolutions.www.task.BuscarVuelo;
import com.sophossolutions.www.task.NavegarA;
import com.sophossolutions.www.task.SeleccionarVuelo;
import com.sophossolutions.www.userinterfaces.ConfirmacionReserva;
import com.sophossolutions.www.userinterfaces.InicioDespegar;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinitionDespegar {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Cristian");
	private InicioDespegar inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Necesisto comprar un vuelo$")
	public void comprarvuelo() {
		actor.wasAbleTo(NavegarA.on(inicio));
	}

	@When("^Vuelo entre (.*) y (.*)$")
	public void entreCiudades(String origen, String destino) {
		actor.attemptsTo(BuscarVuelo.seleccionrVuelo(origen, destino, "2/2/2020", "7/2/2020"));
		actor.attemptsTo(SeleccionarVuelo.seleccionarVuelo());
	}

	@Then("^Valido el valor del vuelo$")
	public void validarValorVuelo() {
		actor.should(seeThat(ValorVuelo.precioViaje(ConfirmacionReserva.PRECIOFINAL), equalTo("403.531")));
//		OnStage.setTheStage(new OnlineCast());
//		theActorCalled("Cristian").wasAbleTo(NavegarA.on(inicio));
//		theActorInTheSpotlight().attemptsTo(BuscarVuelo.seleccionarVuelo(origen, destino));
	}

}
