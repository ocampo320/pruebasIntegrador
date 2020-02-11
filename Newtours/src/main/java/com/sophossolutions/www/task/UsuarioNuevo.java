package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.PaginaInicial;
import com.sophossolutions.www.userinterfaces.RegistrarUsuarioNuevo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class UsuarioNuevo implements Task{

	private String usuario="anam62527@gmail.com";
	private String contrasena="abc123";
	private String oContraseña=contrasena;
	
	
	public UsuarioNuevo(String usuario, String contrasena, String oContrasena) {
	
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.oContraseña= oContraseña;
	}

	public static UsuarioNuevo registrarUsuario (String usuario, String contrasena, String oContrasena) {
			return Tasks.instrumented(UsuarioNuevo.class, usuario, contrasena, oContrasena);
	
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(RegistrarUsuarioNuevo.NOMBREUSUARIO), 
				Click.on(RegistrarUsuarioNuevo.CONTRASENA), 
				Click.on(RegistrarUsuarioNuevo.OCONTRASENA), 
				Click.on(RegistrarUsuarioNuevo.REGISTRAR));
		
	}
}
