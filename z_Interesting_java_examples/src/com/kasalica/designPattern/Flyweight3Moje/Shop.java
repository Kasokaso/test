package com.kasalica.designPattern.Flyweight3Moje;

public interface Shop {

	Shop takeOrder(String name, int tableNumber);

	void service();

	String report();

}
