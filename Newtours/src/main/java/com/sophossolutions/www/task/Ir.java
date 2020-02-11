package com.sophossolutions.www.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Ir implements Task {
	private PageObject page;

	public Ir(PageObject page) {
		this.page = page;
	}

	public static Ir on(PageObject page) {
		return Tasks.instrumented(Ir.class, page);
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}
}
