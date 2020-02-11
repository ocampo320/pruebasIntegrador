package co.marca.com.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MotosGp extends PageObject {

	public static final Target LISTA_GRAN_PREMIO = Target.the("Selecciona la lista de gran premio")
			.located(By.xpath("//*[@id=\"selectweb\"]"));

	public static final Target ESCOGER_OPCION = Target.the("Selecciona la opción GP Gran Bretaña")
			.located(By.xpath("//*[@id=\"selectweb\"]/option[15]"));

	public static final Target PISTA = Target.the("Ver la pista SILVERSTONE ")
			.located(By.xpath("//*[@id=\"gpgranbretana\"]/div[1]/h3"));
}
