package com.dilip.factory.simple;

public class PizzaStore {
	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String pizzaType) {
		Pizza Pizza;
		Pizza = factory.createPizza(pizzaType);
		Pizza.prepare();
		Pizza.bake();
		Pizza.cut();
		Pizza.bake();

		return Pizza;

	}

}
