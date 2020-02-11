package co.marca.com.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://co.marca.com/claro/")
public class InicioMarca extends PageObject {

	public static final Target SELECIONAR_PORTADA = Target.the("Selecciona la portada")
			.located(By.xpath("//*[@id=\"header-edition-selector\"]/button"));

	public static final Target SPAIN = Target.the("Seleccionar la portada de españa")
			.located(By.xpath("//*[@id=\"header-edition-selector__menu\"]/ul/li[1]/a"));

	public static final Target MOTOR = Target.the("Selecciona la opción de motor")
			.located(By.xpath("/html/body/header/div[2]/div/nav/ul/li[3]/a"));

	public static final Target CALENDARIO = Target.the("Selecciona del calendario motor")
			.located(By.xpath("//*[@id=\"submenuMotor\"]/ul/li[2]/ul/li/ul/li[1]/a"));

	public static final Target ACEPTAR = Target.the("Selecciona del calendario motor")
			.located(By.xpath("//*[@id=\"buttons\"]/button[2]/span"));

}