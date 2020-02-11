package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl ("https://www.dafiti.com.co/")
public class PaginaInicio extends PageObject{
	public static final Target ENTRAR = Target.the("selecciona entrar")
			.located(By.xpath("//*[@id=\"LoginInfoTag\"]/span"));
}
