package com.sophossolutions.www.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import com.sophossolutions.www.userinterfaces.PaginaInicio;
public class PaginaInicial implements Task {
	private PageObject page;

	public PaginaInicial(PageObject page) {
		this.page = page;
	}

	public static PaginaInicial on(PageObject page) {
		return Tasks.instrumented(PaginaInicial.class, page);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page), Click.on(PaginaInicio.ENTRAR));
	}

}
