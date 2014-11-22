package test.chain.of.responsability;

public abstract class Handler {
	protected Handler m_successor;

	public void setSuccessor(Handler successor) {
		m_successor = successor;
	}

	public Handler getSuccessor() {
		return m_successor;
	}

	public abstract void handleRequest(Request request);

}
