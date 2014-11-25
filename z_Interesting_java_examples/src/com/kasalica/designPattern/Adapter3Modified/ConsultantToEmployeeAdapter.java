package com.kasalica.designPattern.Adapter3Modified;

public class ConsultantToEmployeeAdapter implements Employee {
	private Consultant consultant;

	public ConsultantToEmployeeAdapter(final Consultant consultant) {
		this.consultant = consultant;
	}

	@Override
	public void showHappiness() {
		consultant.showSmile();

	}

}
