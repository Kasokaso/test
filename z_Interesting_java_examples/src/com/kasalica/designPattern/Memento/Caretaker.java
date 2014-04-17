package com.kasalica.designPattern.Memento;

import java.util.ArrayList;

class Caretaker {

	private final ArrayList<Memento> savedStates = new ArrayList<Memento>();

	public void addMemento(Memento m) {
		savedStates.add(m);
	}

	public Memento getMemento(int index) {
		return savedStates.get(index);
	}
}
