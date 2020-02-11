package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.VueloDisponible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class SeleccionarVuelo implements Task {

	public static SeleccionarVuelo seleccionarVuelo() {
		return Tasks.instrumented(SeleccionarVuelo.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VueloDisponible.SELECCIONARVUELO));
		
		// mirar que si aparezca el aviso
		actor.attemptsTo(Check.whether(VueloDisponible.SINEQUIPAJE.resolveFor(actor).isVisible())
				.andIfSo(Click.on(VueloDisponible.SINEQUIPAJE)));

	}

}
