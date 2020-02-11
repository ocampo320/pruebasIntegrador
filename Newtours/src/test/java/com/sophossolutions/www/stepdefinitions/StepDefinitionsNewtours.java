package com.sophossolutions.www.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.task.IniciarSesion;
import com.sophossolutions.www.task.Ir;
import com.sophossolutions.www.task.UsuarioNuevo;
import com.sophossolutions.www.userinterfaces.PaginaInicial;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsNewtours {
	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Fulanito");
	private PaginaInicial inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Necesito registrar un usuario$")
	public void necesito_registrar_un_usuario(){
		actor.wasAbleTo(Ir.on(inicio));
	}

	@When("^usuario (.*) contrasena (.*)$")
	public void registrarUsuario(String usuario, String contrasena) {
		actor.attemptsTo(UsuarioNuevo.registrarUsuario(usuario, contrasena, contrasena));
	}

	@Then("^Validar usuario registrado$")
	public void validar_usuario_registrado(String usuario, String contrasena){
		actor.attemptsTo(IniciarSesion.iniciarSesion(usuario, contrasena));
	}
}
