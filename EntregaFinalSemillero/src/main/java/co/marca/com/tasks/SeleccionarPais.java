package co.marca.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.marca.com.userinterfaces.InicioMarca.*;

public class SeleccionarPais implements Task {

	public static SeleccionarPais enPagina() {

		return Tasks.instrumented(SeleccionarPais.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Check.whether(ACEPTAR.resolveFor(actor).isVisible()).andIfSo(Click.on(ACEPTAR)),
				Click.on(SELECIONAR_PORTADA), Click.on(SPAIN),
				Check.whether(ACEPTAR.resolveFor(actor).isVisible()).andIfSo(Click.on(ACEPTAR)));
	}

}
