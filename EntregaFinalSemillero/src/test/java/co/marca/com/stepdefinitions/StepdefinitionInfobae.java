package co.marca.com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.marca.com.tasks.ScrollSeccion;
import co.marca.com.tasks.SeleccionarFotos;
import co.marca.com.tasks.SeleccionarNotacia;
import co.marca.com.userinterfaces.InicioPaginainfobae;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepdefinitionInfobae {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("deivi");
	private InicioPaginainfobae inicio;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^ingrese a la pagina y selecciona la fotos del dia$")
	public void ingrese_a_la_pagina_y_selecciona_la_fotos_del_dia() {

		actor.wasAbleTo(Open.browserOn(inicio), SeleccionarFotos.enLaPagina());

	}

	@When("^un usario seleccione la tercera noticia$")
	public void un_usario_seleccione_la_tercera_noticia() {

		actor.attemptsTo(SeleccionarNotacia.terceraNoticia());

	}

	@Then("^se muestra todo el contenido de la noticia con scroll$")
	public void se_muestra_todo_el_contenido_de_la_noticia_con_scroll() {

		actor.attemptsTo(ScrollSeccion.enLaNoticia());
	}

}
