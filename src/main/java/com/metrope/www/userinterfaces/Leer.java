package com.metrope.www.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import net.serenitybdd.screenplay.targets.Target;

public class Leer {

	public static final  Target TXT_ARTICULO   = Target.the("Texto producto").located(ByXPath.xpath("//*[@id=\"minicart-navigation\"]/div[2]/div[2]/div[3]/div/div/div[2]/a"));

	
}
