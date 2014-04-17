package com.kasalica.designPattern.Memento2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

	private TestMemento testMemento;
	
	public ButtonHandler(TestMemento test){
		testMemento = test;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 CommandInterface CommandObj = (CommandInterface) e.getSource();
	     CommandObj.processEvent(testMemento);
	}

}
