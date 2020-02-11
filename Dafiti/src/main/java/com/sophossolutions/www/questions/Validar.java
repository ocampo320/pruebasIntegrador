package com.sophossolutions.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validar implements Question<String>{
	public Target target;

	public Validar(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return null;
	}
	public static Validar validacion(Target target) {
		return new Validar(target);
	}
}
