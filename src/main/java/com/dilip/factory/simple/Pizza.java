package com.dilip.factory.simple;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	List<String> topping = new ArrayList<>();

	/*public String geName() {
		//return name;
	}*/

	public void prepare() {
		System.out.println("Peparing " + name);
	}

	public void bake() {
		System.out.println("Backing " + name);
	}

	public void cut() {
		System.out.println("Cuting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
	
	
}
