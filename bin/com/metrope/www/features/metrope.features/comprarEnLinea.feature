
@tag
Feature: comprar en productos de limpieza en linea
   Como usuario de metro
   Quiero ingresar a la pagina de metro
   Para comprar productos de limpieza
   

  @tag1
  Scenario: comprar detergente
    Given que Andrea ingresa a la pagina de metro
    When  Andrea selecciona el detergente marshella 
	  Then  el producto es agregado al carrito de compras

