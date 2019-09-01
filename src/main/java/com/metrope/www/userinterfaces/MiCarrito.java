package com.metrope.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class MiCarrito extends PageObject{

	
	public static final Target CLICK_BACKGROUND = Target.the("click para deshabilitar background").located(By.xpath("//*[@id=\"highlight-background\"]"));
	public static final Target BTN_CARRITO = Target.the("Boton para consultar el carrito").located(By.xpath("//*[@id=\"home-page\"]/div[18]/div[1]/button[2]"));

}