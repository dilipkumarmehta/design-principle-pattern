package com.dilip.factory.simple;

public class SimplePizzaFactory {

	Pizza pizza = null;

	public Pizza createPizza(String pizzaType) {
		if (pizzaType.equals("cheese")) {
			return pizza = new CheesePizza();
		}
		if (pizzaType.equals("cheese")) {
			return pizza = new PepperoniPizza();
		}

		if (pizzaType.equals("cheese")) {
			return pizza = new ClamPizza();
		}
		if (pizzaType.equals("cheese")) {
			return pizza = new VeggiePizza();
		}
		return null;
	}

}
