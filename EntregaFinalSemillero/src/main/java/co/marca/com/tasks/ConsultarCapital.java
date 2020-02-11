package co.marca.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarCapital implements Task {
	private String codLlamada;

	public ConsultarCapital(String codLlamada) {
		this.codLlamada = codLlamada;
	}

	public static ConsultarCapital capital(String codLlamada) {
		return Tasks.instrumented(ConsultarCapital.class, codLlamada);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(codLlamada));
	}
 
}
