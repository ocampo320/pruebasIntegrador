package com.sophossolutions.www.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.task.PaginaInicial;
import com.sophossolutions.www.userinterfaces.PaginaInicio;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsUsuarioDafiti {
	
	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Fulanito");
	private PaginaInicio inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}
	
	@Given("^Necesito registrar un usuario$")
	public void usuarioNuevo() {
		actor.wasAbleTo(PaginaInicial.on(inicio));
	}


	@When("^usuario con el correo (.*) contrase?a (.*) nombre (.*) apellido (.*) documento (.*) dia (.*) mes (.*) anio (.*) sexo (.*)$")
	public void registrarUsuario(String correo, String contrasena, String nombre, String apellido, String documento, String dia, String mes, String anio, String sexo) {
	    
	}

	@Then("^Validar registro de usuario$")
	public void validar_registro_de_usuario() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
