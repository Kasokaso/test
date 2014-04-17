package com.kasalica.designPattern.Observer;

import java.util.ArrayList;

abstract class Subject {

	// Fields
	private final ArrayList<Observer> observers = new ArrayList<Observer>();


	// Methods
	public void attach(Observer observer) {

		observers.add(observer);
	}


	public void detach(Observer observer) {

		observers.remove(observer);
	}


	public void notifyObservers() {

		for (Observer o : observers) {
			o.update();
		}
	}
}