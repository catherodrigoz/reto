package com.metrope.www.task;

import org.hamcrest.Matcher;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.metrope.www.userinterfaces.Registrar;

import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

public class Comprar implements Task{

	
	


	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue("Detergente Marsella Max Floral Bolsa 4 kg").into(Registrar.AREA_BUSQUEDA));
		actor.attemptsTo(Click.on(Registrar.BTN_AGREGAR));
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		actor.attemptsTo(Click.on(Registrar.BTN_CERRAR));
	}
	



	public static Comprar articulo( ) {
		return Tasks.instrumented(Comprar.class);
	}
}