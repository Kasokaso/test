package com.kasalica.example.allInOne.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * singleton factory
 */
public class CalculatorFactory {

	private static CalculatorFactory singleInstance = null;

	private CalculatorFactory() {
	}

	public static CalculatorFactory getInstance() {
		if (singleInstance == null) {
			singleInstance = new CalculatorFactory();
		}
		return singleInstance;
	}

	public Calculator getCalculator(boolean withLogging) {
		Calculator c = new CalculatorImpl();
		// use dynamic proxy if logging is required, which logs your method
		// calls
		if (withLogging) {
			// invoke the handler, which logs and invokes the target method on
			// the Calculator
			InvocationHandler handler = new LoggingHandler(c);
			// create a proxy
			c = (Calculator) Proxy.newProxyInstance(c.getClass()
					.getClassLoader(), c.getClass().getInterfaces(), handler);
		}
		return c;
	}
}
