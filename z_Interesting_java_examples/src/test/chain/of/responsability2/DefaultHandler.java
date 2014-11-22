package test.chain.of.responsability2;

public class DefaultHandler extends Handler {

	@Override
	public boolean handleRequestImpl(Request request) {
		if (request.getValue() == 0) {
			System.out.println("Value is zero");
			return true;
		} else {
			System.out.println("Value is something else");
			return false;
		}

	}
}
