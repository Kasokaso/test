package com.kasalica.designPattern.ChainOfResponsibility2;

public class ConcreteHandlerOne extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getValue() < 0) { // if request is eligible handle it
			System.out
					.println("Negative values are handled by ConcreteHandlerOne:");
			System.out.println("\tConcreteHandlerOne.HandleRequest : "
					+ request.getDescription() + request.getValue());
		} else if (m_successor != null) {
			m_successor.handleRequest(request);
		}
	}
}
