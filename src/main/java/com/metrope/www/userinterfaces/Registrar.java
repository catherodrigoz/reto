package com.metrope.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class Registrar extends PageObject {

	

	public static final Target AREA_BUSQUEDA = Target.the("area de busqueda de productos").located(By.id("search-autocomplete-input"));
	public static final Target BTN_AGREGAR  = Target.the("botón para agregar al carrito").located(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/button"));
	public static final Target BTN_CERRAR  = Target.the("Boton para cerrar tipo de entrega").located(By.xpath("//*[@id=\"shipping-preference-metro\"]/div/button"));



}

