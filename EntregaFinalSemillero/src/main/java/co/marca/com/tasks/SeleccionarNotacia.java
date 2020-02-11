package co.marca.com.tasks;

import static co.marca.com.userinterfaces.SeleccionarFotoInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class SeleccionarNotacia implements Task
{
	
	public static SeleccionarNotacia terceraNoticia (){
		
		return Tasks.instrumented(SeleccionarNotacia.class);
	}

	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Check.whether(CANCELAR.resolveFor(actor).isVisible()).andIfSo(Click.on(CANCELAR)),
				Click.on(SELECIONARNOTICIA_TARGET),
				Check.whether(CANCELAR.resolveFor(actor).isVisible()).andIfSo(Click.on(CANCELAR)));
	}

}
