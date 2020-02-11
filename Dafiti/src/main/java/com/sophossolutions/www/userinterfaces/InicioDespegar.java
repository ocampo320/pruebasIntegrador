package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/")
public class InicioDespegar extends PageObject {

	public static final Target VUELOS = Target.the("Selecciona la opción vuelos")
			.located(By.xpath("/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a\r\n"));

	public static final Target ORIGEN = Target.the("Ingresar origen Medellin").located(
			By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input"));

	public static final Target DESRTINO = Target.the("Ingresar destino Cali").located(By
			.xpath("//*[@id='searchbox-sbox-box-flights']/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input"));

	public static final Target ORIGINDATE = Target.the("Select the origin date")
			.locatedBy("//*[@id='searchbox-sbox-box-flights']/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input");

	public static final Target BUSCARVUELO = Target.the("Selecciona la opción buscar")
			.located(By.xpath("//*[@id='searchbox-sbox-box-flights']/div/div/div[3]/div[2]/div[4]/div/a"));

	public static Target getFechaViaje(String mes, String dia) {

		return Target.the("Selecciona la fecha")
				.located(By.xpath("/html/body/div[4]/div/div[5]/div[" + mes + "]/div[4]/span[" + dia + "]"));
	}

}
