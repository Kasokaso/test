package test.chain.of.responsability;

public class DefaultHandler extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getValue() == 0) {
			System.out.println("Value is zero");
		} else {
			System.out.println("Value is something else");
		}

	}

}
