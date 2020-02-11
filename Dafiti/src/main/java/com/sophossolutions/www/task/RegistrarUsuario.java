package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrarUsuario implements Task{
	private String correo;
	private String contrasena;
	private String nombre;
	private String apellido;
	private String documento;
	private String dia;
	private String mes;
	private String anio;
	private String sexo;


	public RegistrarUsuario(String correo, String contrasena, String nombre, String apellido, String documento,
			String dia, String mes, String anio, String sexo) {
		super();
		this.correo = correo;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.sexo = sexo;
	}


	public static RegistrarUsuario registrar(String correo, String contrasena, String nombre, String apellido, String documento,
			String dia, String mes, String anio, String sexo) {
		return Tasks.instrumented(RegistrarUsuario.class, correo, contrasena, nombre, apellido, documento, dia, mes, anio, sexo);
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(Enter.theValue(correo).into(RegistroUsuario.CORREO), Enter.theValue(contrasena).into(RegistroUsuario.CONTRASENA), 
//		Enter.theValue(contrasena).into(RegistroUsuario.CONTRASENA2), Enter.theValue(nombre).into(RegistroUsuario.NOMBRE),
//		Enter.theValue(apellido).into(RegistroUsuario.APELLIDO), Enter.theValue(documento).into(RegistroUsuario.DOCUMENTO),
//		Enter.theValue(dia).into(RegistroUsuario.DIA), Enter.theValue(mes).into(RegistroUsuario.MES),
//		SelectFromOptions.byVisibleText(anio).equals(RegistroUsuario.ANIO), SelectFromOptions.byVisibleText(sexo).equals(RegistroUsuario.SEXO), Click.on(RegistroUsuario.ENVIAR));		
	}
	
}
