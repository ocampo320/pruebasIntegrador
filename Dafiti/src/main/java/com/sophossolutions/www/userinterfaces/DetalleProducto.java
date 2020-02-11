package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleProducto {
	public static final Target AÑADIR = Target.the("Añadir producto al carrito")
			.located(By.xpath("//*[@id='AddToCart']"));
}
