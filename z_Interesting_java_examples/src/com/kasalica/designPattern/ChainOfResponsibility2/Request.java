package com.kasalica.designPattern.ChainOfResponsibility2;

public class Request {

	private final int m_value;
	private final String m_description;

	public Request(String description, int value) {
		m_description = description;
		m_value = value;
	}

	public int getValue() {
		return m_value;
	}

	public String getDescription() {
		return m_description;
	}
}
