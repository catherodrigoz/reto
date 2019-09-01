package com.metrope.www.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import com.metrope.www.questions.VerProductoEnCarrito;
import com.metrope.www.task.Abrir;
import com.metrope.www.task.Comprar;
import com.metrope.www.task.Notificacion;
import com.metrope.www.task.Ver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import  static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MetroStepDefinitions {

	@Managed(driver = "chrome", options = "--start-maximized")

	WebDriver browser;

	Actor Andrea = Actor.named("Andrea");
	
	@Given("^que Andrea ingresa a la pagina de metro$")
	public void queAndreaIngresaALaPaginaDeMetro() {
		Andrea.can(BrowseTheWeb.with(browser));
		Andrea.wasAbleTo(Abrir.laPagina());
	}

	@When("^Andrea selecciona el detergente marshella$")
	public void andreaSeleccionaElDetergenteMarshella() {
		Andrea.attemptsTo(Notificacion.nogracias());
		Andrea.attemptsTo(Comprar.articulo());
	}

	@Then("^el producto es agregado al carrito de compras$")
	public void elProductoEsAgregadoAlCarritoDeCompras( ) {
		Andrea.attemptsTo(Ver.carrito());
		Andrea.should(seeThat(VerProductoEnCarrito.agregado(),equalTo("Detergente Marsella Max Floral Bolsa 4 kg")));

	}
	

}