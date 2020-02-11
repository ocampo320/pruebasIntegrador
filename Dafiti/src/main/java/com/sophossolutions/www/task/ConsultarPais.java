package com.sophossolutions.www.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarPais implements Task{
	private String codLlamada;

	public ConsultarPais(String id) {
		this.codLlamada = codLlamada;
	}

	public static ConsultarPais pais(String id) {
		return Tasks.instrumented(ConsultarPais.class, id);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(codLlamada));
	}

}
