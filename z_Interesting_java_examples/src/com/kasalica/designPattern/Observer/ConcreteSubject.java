package com.kasalica.designPattern.Observer;

class ConcreteSubject extends Subject {

	// Fields
	private String subjectState;

	// Properties
	public String getSubjectState() {

		return subjectState;
	}

	public void setSubjectState(String value) {

		subjectState = value;
	}
}