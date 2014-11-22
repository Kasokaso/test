package test.chain.of.responsability2;

public class ConcreteHandler1 extends Handler {

	@Override
	public boolean handleRequestImpl(Request request) {
		if (request.getValue() > 0) {
			System.out.println("Greater that zero");
			return true;
		} else {
			return false;
		}

	}
}
