package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesion {
	public static final Target CORREO = Target.the("Ingresa correo ")
			.located(By.xpath("//*[@id='LoginForm_email']"));
 public static final Target CONTRASENA = Target.the("Ingresar Contrase�a")
		 .located(By.xpath("//*[@id='LoginForm_password']"));
 
 public static final Target ENTRAR= Target.the("Acciona bot�n entrar")
		 .located(By.id("loginButton"));
}
