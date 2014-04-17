package com.kasalica.designPattern.Adapter3;

public class ConsultantToEmployeeAdapter extends Consultant implements Employee {

	public ConsultantToEmployeeAdapter(String name) {
		super(name);
	}

	@Override
	public void showHappiness() {
		super.showSmile();

	}

}
