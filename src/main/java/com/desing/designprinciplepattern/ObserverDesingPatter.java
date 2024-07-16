
package com.dilp.behavioural;
import java.util.ArrayList;
import java.util.List;

interface Subject {
	public void register(Observers obs);
	public void deregister(Observers obs);
	public void notifyObserver();
}

class DeliveryData implements Subject {
	private List<Observers> observer;
	private String location;

	DeliveryData() {
		observer = new ArrayList<Observers>();
	}

	@Override
	public void register(Observers obs) {
		// TODO Auto-generated method stub
		observer.add(obs);

	}

	@Override
	public void deregister(Observers obs) {
		// TODO Auto-generated method stub
		observer.remove(obs);

	}

	@Override
	public void notifyObserver() {
		for (Observers ob : observer) {
			ob.update(location);
		}

	}

}

interface Observers {
	public void update(String s);
}

class CustomerObserver implements Observers {
	@Override
	public void update(String s) {
		System.out.println("location changes"+s);
	}

}
public class ObserverDesingPatter {
	public static void main(String[] args) {
		DeliveryData d = new DeliveryData();
		CustomerObserver c=new CustomerObserver();
		d.register(c);
		c.update("dilip");

	}
}
