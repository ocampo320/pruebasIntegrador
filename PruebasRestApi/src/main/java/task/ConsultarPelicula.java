package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarPelicula implements Task {
	private String id;

	public ConsultarPelicula(String id) {
		this.id = id;
	}

	public static ConsultarPelicula consulta(String id) {
		return Tasks.instrumented(ConsultarPelicula.class, id);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(id));
	}

}
