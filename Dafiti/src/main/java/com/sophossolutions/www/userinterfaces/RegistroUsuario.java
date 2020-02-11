package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario {
	public static final Target CORREO = Target.the("Ingresa correo ")
			.located(By.xpath("//*[@id='RegistrationForm_email']"));
	public static final Target CONTRASENA = Target.the("Ingresar Contraseña")
			.located(By.xpath("//*[@id='RegistrationForm_password']"));
	public static final Target CONTRASENA2=Target.the("Ingresar contraseña 2")
			.located(By.xpath("//*[@id='RegistrationForm_password2']"));
	public static final Target NOMBRE = Target.the("Ingresar nombre")
			.located(By.id("//*[@id='RegistrationForm_first_name']"));
	public static final Target APELLIDO = Target.the("Ingresa apellido ")
			.located(By.xpath("//*[@id='RegistrationForm_last_name']"));
	public static final Target DOCUMENTO = Target.the("Ingresar documento")
			.located(By.xpath("//*[@id='RegistrationForm_identification']"));
	public static final Target DIA= Target.the("Dia de nacimiento")
			.located(By.xpath("//*[@id='RegistrationForm_day']"));
	public static final Target MES = Target.the("Ingresar mes de nacimiento")
			.located(By.xpath("//*[@id='RegistrationForm_month']"));
	public static final Target ANIO = Target.the("Ingresar año")
			.located(By.xpath("//*[@id='RegistrationForm_year']"));
	public static final Target SEXO = Target.the("Elegir sexo ")
			.located(By.xpath("//*[@id='RegistrationForm_gender']"));
	public static final Target ENVIAR = Target.the("Acciona botón enviar")
			.located(By.xpath("//*[@id='createAccountButton']"));
}
