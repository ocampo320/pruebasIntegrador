package com.sophossolutions.www.task;

import org.openqa.selenium.Keys;

import com.sophossolutions.www.userinterfaces.InicioDespegar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

public class BuscarVuelo implements Task {

	private String origen;
	private String destino;
	private String fechaIda;
	private String fechaRegreso;

	public BuscarVuelo(String origen, String destino, String fechaIda, String fechaRegreso) {

		this.origen = origen;
		this.destino = destino;
		this.fechaIda = fechaIda;
		this.fechaRegreso = fechaRegreso;
	}

	public static BuscarVuelo seleccionrVuelo(String origen, String destino,String fechaIda, String fechaRegreso) {
		return Tasks.instrumented(BuscarVuelo.class, origen, destino,fechaIda,fechaRegreso);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		String arreglo[] = fechaIda.split("/");
		String arreglo2[] = fechaRegreso.split("/");
		actor.attemptsTo(Click.on(InicioDespegar.VUELOS), Enter.theValue(origen).into(InicioDespegar.ORIGEN),
				Hit.the(Keys.ENTER).into(InicioDespegar.ORIGEN), Enter.theValue(destino).into(InicioDespegar.DESRTINO),
				Hit.the(Keys.ENTER).into(InicioDespegar.DESRTINO), Click.on(InicioDespegar.ORIGINDATE),
				Click.on(InicioDespegar.getFechaViaje(arreglo[1], arreglo[0])),
				Click.on(InicioDespegar.getFechaViaje(arreglo2[1], arreglo2[0])), Click.on(InicioDespegar.BUSCARVUELO));

	}

}
