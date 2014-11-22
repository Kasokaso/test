package test.chain.of.responsability;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getValue() > 0) {
			System.out.println("Greater that zero");
		} else {
			getSuccessor().handleRequest(request);
		}

	}
}
