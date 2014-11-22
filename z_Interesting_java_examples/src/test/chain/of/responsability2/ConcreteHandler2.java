package test.chain.of.responsability2;

public class ConcreteHandler2 extends Handler {

	@Override
	public boolean handleRequestImpl(Request request) {
		if (request.getValue() < 0) {
			System.out.println("Value is less than zero");
			return true;
		} else {
			return false;
		}

	}

}
