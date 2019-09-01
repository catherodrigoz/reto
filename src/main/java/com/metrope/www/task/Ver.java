package com.metrope.www.task;

import org.openqa.selenium.support.ui.Wait;

import com.metrope.www.userinterfaces.MiCarrito;
import com.metrope.www.userinterfaces.Registrar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.statematchers.IsCurrentlyVisibleMatcher;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.pages.WebElementState;

public class Ver implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(MiCarrito.CLICK_BACKGROUND));
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		actor.attemptsTo(Click.on(MiCarrito.BTN_CARRITO));
		
	}

	public static Ver carrito() {
		return Tasks.instrumented(Ver.class);
	}
}
