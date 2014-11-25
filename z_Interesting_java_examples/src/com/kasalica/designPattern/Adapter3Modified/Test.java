package com.kasalica.designPattern.Adapter3Modified;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		list.add(new EmployeeImplementation("Tom"));
		list.add(new EmployeeImplementation("Jerry"));
		list.add(new ConsultantToEmployeeAdapter(new Consultant("Bruno"))); // consultant
																			// from
		// existing class
		showHappiness(list);
	}

	// *** Code below from the existing library does not need to be changed ***
	static void showHappiness(List<Employee> list) {

		for (Employee e : list) {
			e.showHappiness();
		}
	}
}
