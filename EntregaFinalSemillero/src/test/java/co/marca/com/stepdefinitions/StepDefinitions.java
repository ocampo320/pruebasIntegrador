package co.marca.com.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.marca.com.iteractions.SelecionarDeporte;
import co.marca.com.questions.ConfirmacionPista;
import co.marca.com.tasks.SeleccionarPais;
import co.marca.com.userinterfaces.InicioMarca;
import co.marca.com.userinterfaces.MotosGp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Sebastian");
	private InicioMarca inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Ingrese a la pagina y cambiar a edicion de espa$")
	public void ingrese_a_la_pagina_y_cambiar_a_edicion_de_espa_a() {
		actor.wasAbleTo(Open.browserOn(inicio), SeleccionarPais.enPagina());
	}

	@When("^un usuario selecciona la opcion moto y el calendario$")
	public void un_usuario_selecciona_la_opcion_moto_y_el_calendario() {
		actor.attemptsTo(SelecionarDeporte.enMotor());
	}

	@Then("^validar que la pista sea SILVERSTONE$")
	public void validar_que_la_pista_sea_SILVERSTONE() {
		actor.should(seeThat(ConfirmacionPista.circuito(MotosGp.PISTA), equalTo("SILVERSTONE")));

	}
}
