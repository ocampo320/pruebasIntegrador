package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleProducto {
	public static final Target A�ADIR = Target.the("A�adir producto al carrito")
			.located(By.xpath("//*[@id='AddToCart']"));
}
