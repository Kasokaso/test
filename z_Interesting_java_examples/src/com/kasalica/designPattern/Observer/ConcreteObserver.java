package com.kasalica.designPattern.Observer;

class ConcreteObserver extends Observer {

	// Fields
	private final String name;
	private String observerState;
	private final ConcreteSubject subject;

	// Constructors
	public ConcreteObserver(ConcreteSubject subject, String name) {

		this.subject = subject;
		this.name = name;
		// subject.attach(this);
	}

	// Methods
	@Override
	public void update() {

		observerState = subject.getSubjectState();
		System.out.printf("Observer %s's new state is %s\n", name,
				observerState);
	}
}