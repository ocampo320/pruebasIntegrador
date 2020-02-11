package com.sophossolutions.www.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA implements Task{

	private PageObject page;
	
	public NavegarA(PageObject page) {
		this.page = page;
	}
	
	public static NavegarA on(PageObject page)  {
		return Tasks.instrumented(NavegarA.class, page);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(page));
	}

}
