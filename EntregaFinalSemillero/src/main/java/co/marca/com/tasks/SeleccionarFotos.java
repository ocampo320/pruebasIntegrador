package co.marca.com.tasks;

import co.marca.com.userinterfaces.InicioPaginainfobae;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFotos implements Task {

	public static SeleccionarFotos enLaPagina() {

		return Tasks.instrumented(SeleccionarFotos.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(InicioPaginainfobae.SELECCIONARFOTO));
	}

}
