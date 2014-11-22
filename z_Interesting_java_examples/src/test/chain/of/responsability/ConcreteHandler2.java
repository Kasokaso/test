package test.chain.of.responsability;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getValue() < 0) {
			System.out.println("Value is less than zero");
		} else {
			getSuccessor().handleRequest(request);
		}

	}

}
