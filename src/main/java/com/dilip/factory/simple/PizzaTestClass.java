package com.dilip.factory.simple;

public class PizzaTestClass {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		pizzaStore.orderPizza("cheese");
		

	}
}
