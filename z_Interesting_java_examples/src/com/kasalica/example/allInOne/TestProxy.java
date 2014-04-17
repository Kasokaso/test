package com.kasalica.example.allInOne;

import com.kasalica.example.allInOne.proxy.Calculator;
import com.kasalica.example.allInOne.proxy.CalculatorFactory;

public class TestProxy {

	public static void main(String[] args) {
		System.out.println("==============Without dynamic proxy=============");
		Calculator calc = CalculatorFactory.getInstance().getCalculator(false);
		calc.add(3, 2);
		System.out.println("===============With dynamic proxy================");
		calc = CalculatorFactory.getInstance().getCalculator(true);
		calc.add(3, 2);
	}
}