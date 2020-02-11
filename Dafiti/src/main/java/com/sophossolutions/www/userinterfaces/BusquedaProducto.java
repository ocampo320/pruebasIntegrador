package com.sophossolutions.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaProducto {
	public static final Target LUPA = Target.the("Seleccionar lupa para ingresar texto")
			.located(By.xpath("//*[@id='searchInput']"));
	public static final Target BUSCAR = Target.the("Buscar").located(By.xpath("//*[@id='search']/button"));
	public static final Target ELECCION = Target.the("Seleccionar producto")
			.located(By.xpath("//*[@id='1:RA235AC40PRNCO']/div/img"));
}
