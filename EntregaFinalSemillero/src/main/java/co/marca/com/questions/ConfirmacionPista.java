package co.marca.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionPista implements Question<String> {

	public Target target;

	public ConfirmacionPista(Target target) {
		super();
		this.target = target;
	}

	public static ConfirmacionPista circuito(Target target) {
		return new ConfirmacionPista(target);

	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
	}

}
