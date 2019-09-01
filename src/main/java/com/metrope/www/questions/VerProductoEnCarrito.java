package com.metrope.www.questions;

import com.metrope.www.userinterfaces.Leer;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerProductoEnCarrito implements Question<String> {

	public static VerProductoEnCarrito agregado() {
		return new VerProductoEnCarrito();
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(Leer.TXT_ARTICULO).viewedBy(actor).asString();
	}
	
	

}
