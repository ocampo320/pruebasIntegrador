package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class VueloDisponible {

	public static final Target SELECCIONARVUELO = Target.the("Seleccionar vuelo").located(
			By.xpath("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/div[2]/fare/span/span/div/buy-button/a"));

	public static final Target SINEQUIPAJE = Target.the("Seleccionar sin equipaje").located(
			By.xpath("//*[@id=\"upselling-baggage-popup-position\"]/upselling-baggage-popup/div/div[3]/span/a[1]/em"));

}
