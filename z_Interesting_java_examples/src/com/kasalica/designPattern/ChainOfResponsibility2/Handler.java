package com.kasalica.designPattern.ChainOfResponsibility2;

public abstract class Handler {

	protected Handler m_successor;

	public void setSuccessor(Handler successor) {
		m_successor = successor;
	}

	public abstract void handleRequest(Request request);
}
