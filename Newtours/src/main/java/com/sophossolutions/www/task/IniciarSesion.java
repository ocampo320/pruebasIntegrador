package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.InicioSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IniciarSesion implements Task{
	public static IniciarSesion iniciarSesion(String usuario, String contrasena) {
		return Tasks.instrumented(IniciarSesion.class, usuario, contrasena);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioSesion.USUARIO), 
				Click.on(InicioSesion.CONTRASENA), 
				Click.on(InicioSesion.INICIOSESION));
	}
	
}
