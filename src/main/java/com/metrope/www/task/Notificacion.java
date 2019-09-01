package com.metrope.www.task;

import com.metrope.www.userinterfaces.Mensaje;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Notificacion implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(Mensaje.NOTIFICACION));
					
		}
		
		
	public static Notificacion nogracias() {
		return Tasks.instrumented(Notificacion.class);
	}

}	





