package test.chain.of.responsability2;

public abstract class Handler {
	protected Handler m_successor;

	public void setSuccessor(Handler successor) {
		m_successor = successor;
	}

	public Handler getSuccessor() {
		return m_successor;
	}

	protected abstract boolean handleRequestImpl(Request request);

	public void handleRequest(Request request) {
		boolean handleByThisNode = handleRequestImpl(request);

		if (!handleByThisNode && m_successor != null) {
			getSuccessor().handleRequest(request);
		}

	}

}
