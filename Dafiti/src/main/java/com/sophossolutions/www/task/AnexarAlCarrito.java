package com.sophossolutions.www.task;

import com.sophossolutions.www.userinterfaces.DetalleProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;

public class AnexarAlCarrito implements Task{

public AnexarAlCarrito() {
	
}
public static AnexarAlCarrito anexar() {
	return Tasks.instrumented(AnexarAlCarrito.class);
}

@Override
public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Click.on(DetalleProducto.AÑADIR));
}
 
}
