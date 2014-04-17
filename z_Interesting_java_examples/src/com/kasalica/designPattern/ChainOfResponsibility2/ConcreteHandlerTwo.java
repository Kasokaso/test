package com.kasalica.designPattern.ChainOfResponsibility2;

public class ConcreteHandlerTwo extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getValue() == 0) { // if request is eligible handle it
			System.out
					.println("Positive values are handled by ConcreteHandlerTwo:");
			System.out.println("\tConcreteHandlerTwo.HandleRequest : "
					+ request.getDescription() + request.getValue());
		} else if (m_successor != null) {
			m_successor.handleRequest(request);
		}
	}
}
