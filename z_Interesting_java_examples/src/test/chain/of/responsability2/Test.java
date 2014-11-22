package test.chain.of.responsability2;

public class Test {

	public static void main(String[] args) {

		Handler handler = new Chain().createChain();

		// Send requests to the chain
		handler.handleRequest(new Request(-1, "Negative Value "));
		handler.handleRequest(new Request(0, "Negative Value "));
		handler.handleRequest(new Request(1, "Negative Value "));
		handler.handleRequest(new Request(2, "Negative Value "));
		handler.handleRequest(new Request(-5, "Negative Value "));

	}

}
