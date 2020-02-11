package co.marca.com.tasks;

import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollSeccion implements Interaction {

	public static ScrollSeccion enLaNoticia() {

		return Tasks.instrumented(ScrollSeccion.class);
	}

	private void espera() {
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		final Target IMAGENES = Target.the("Selecciona la opción vuelos")
				.located(By.xpath("//*[@id=\"article-content\"]/div[@class='row']"));

		List<WebElementFacade> img = IMAGENES.resolveAllFor(actor);

		for (int i = 1; i <= img.size() - 1; i++) {

			final Target NOTICIA_1 = Target.the("Selecciona la opción vuelos")
					.located(By.xpath("//*[@id=\"article-content\"]/div[" + i + "]"));

			actor.attemptsTo(Scroll.to(NOTICIA_1));
			espera();

		}
	}

}