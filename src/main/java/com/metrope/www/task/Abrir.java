package com.metrope.www.task;

import com.metrope.www.userinterfaces.PaginaInicialMetrope;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		 actor.attemptsTo(Open.browserOn(new PaginaInicialMetrope()));
	    
	}
	
	public static Abrir laPagina() {
		return Tasks.instrumented(Abrir.class);
	}

}
