package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Validaciones {

	public static final Target MICUENTA = Target.the("Validar")
			.located(By.xpath("//*[@id='LoginInfoTag']/span"));
	public static final Target CARRITO= Target.the("Validar carrito")
			.located(By.xpath("//*[@id='cart-head']/span[2]"));
}