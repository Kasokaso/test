package test.chain.of.responsability2;

/**
 * Creates chain and return first {@link Handler} in chain
 * 
 * @author Kaso
 * 
 */
public class Chain {

	public Handler createChain() {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new DefaultHandler();

		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		return h1;
	}
}
