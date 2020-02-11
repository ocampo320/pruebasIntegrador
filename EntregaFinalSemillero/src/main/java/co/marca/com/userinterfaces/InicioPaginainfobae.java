package co.marca.com.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.infobae.com/america/")
public class InicioPaginainfobae extends PageObject {

	public static final Target SELECCIONARFOTO = Target.the("seleciona la opcion de fotos100")
			.located(By.xpath("//*[@id=\"siteheader\"]/div[1]/div[2]/div[2]/ul/a[11]/li"));

}
