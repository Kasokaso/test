package com.kasalica.designPattern.ChainOfResponsibility2;

public class ConcreteHandlerThree extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getValue() >= 0) { // if request is eligible handle it
			System.out
					.println("Zero values are handled by ConcreteHandlerThree:");
			System.out.println("\tConcreteHandlerThree.HandleRequest : "
					+ request.getDescription() + request.getValue());
		} else if (m_successor != null) {
			m_successor.handleRequest(request);
		}
	}
}
