package com.sophossolutions.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.www.questions.Validar;
import com.sophossolutions.www.task.AnexarAlCarrito;
import com.sophossolutions.www.task.BuscarProducto;
import com.sophossolutions.www.task.IniciarSesion;
import com.sophossolutions.www.task.PaginaInicial;
import com.sophossolutions.www.userinterfaces.PaginaInicio;
import com.sophossolutions.www.userinterfaces.Validaciones;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitionsDafiti {
	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Fulanito");
	private PaginaInicio inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^necesito iniciar sesion con un usuario$")
	public void iniciarSesion() {
		actor.wasAbleTo(PaginaInicial.on(inicio));
	}

	@When("^usuario (.*) contrasena (.*)$")
	public void ingresarDatos(String correo, String contrasena) {
		actor.attemptsTo(IniciarSesion.accederSesion(correo, contrasena));
	}

	@Given("^necesito agregar un producto al carrito$")
	public void necesito_agregar_un_producto_al_carrito() {
	}

	@Then("^validar inicio de sesion$")
	public void validarInicioSesion() {
		actor.should(seeThat(Validar.validacion(Validaciones.MICUENTA), equalTo("HOLA, ALEXANDE...")));
	}

	@When("^producto (.*)$")
	public void anexoProducto(String producto) {

		actor.attemptsTo(BuscarProducto.busqueda(producto), AnexarAlCarrito.anexar());
	}

	@Then("^validar que se agrego el producto$")
	public void validarCarrito() {
		actor.should(seeThat(Validar.validacion(Validaciones.CARRITO)));
	}
}
