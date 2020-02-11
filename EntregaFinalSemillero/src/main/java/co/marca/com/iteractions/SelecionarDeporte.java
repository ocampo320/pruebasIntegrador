package co.marca.com.iteractions;

import static co.marca.com.userinterfaces.InicioMarca.*;
import static co.marca.com.userinterfaces.MotosGp.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.thucydides.core.annotations.Step;

public class SelecionarDeporte implements Interaction {

	public static SelecionarDeporte enMotor() {

		return Tasks.instrumented(SelecionarDeporte.class);
	}

	@Override
	@Step("{0} select the list the #sOption")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Hover.over(MOTOR), Click.on(CALENDARIO), Click.on(LISTA_GRAN_PREMIO),
				Click.on(ESCOGER_OPCION));

	}

}
