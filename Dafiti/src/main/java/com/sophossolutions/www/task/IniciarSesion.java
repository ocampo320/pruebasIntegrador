package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.InicioSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {
	private String correo;
	private String contrasena;

	public IniciarSesion(String correo, String contrasena) {
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public static IniciarSesion accederSesion(String correo, String contraseña) {
		return Tasks.instrumented(IniciarSesion.class, correo, contraseña);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(correo).into(InicioSesion.CORREO),
				Enter.theValue(contrasena).into(InicioSesion.CONTRASENA), Click.on(InicioSesion.ENTRAR));
	}

}
