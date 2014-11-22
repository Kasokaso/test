package test.chain.of.responsability;

public class Test {

	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new DefaultHandler();

		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		// Send requests to the chain
		h1.handleRequest(new Request(-1, "Negative Value "));
		h1.handleRequest(new Request(0, "Negative Value "));
		h1.handleRequest(new Request(1, "Negative Value "));
		h1.handleRequest(new Request(2, "Negative Value "));
		h1.handleRequest(new Request(-5, "Negative Value "));

	}

}
