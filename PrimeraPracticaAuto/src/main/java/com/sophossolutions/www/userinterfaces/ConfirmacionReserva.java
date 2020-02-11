package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionReserva extends PageObject {
	
	public static final Target PRECIOFINAL = Target.the("obtener el valor del vuelo")
			.located(By.xpath("//*[@id='chk-total-price']/div[2]/money/div/span[3]"));
  
	
}
