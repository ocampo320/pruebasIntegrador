package co.marca.com.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarFotoInterface extends PageObject {

	public static final Target CANCELAR = Target.the("Selecciona la opción vuelos")
			.located(By.xpath("//*[@id=\"adcase_footer_text_zocalo_1x1_ad\"]/img"));

	public static final Target SELECIONARNOTICIA_TARGET = Target.the("Selecciona la opción vuelos").located(By.xpath(
			"//div[@class='standard-chain in-chain border-bottom-none pb-layout-item pb-chain pb-c-standard-chain full']/div[@class='chain-content no-skin']/div[3]"));

}
