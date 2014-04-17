package com.kasalica.designPattern.Mediator_Command;

import java.awt.event.ActionListener;

import javax.swing.JButton;

//A concrete colleague
class BtnSearch extends JButton implements Command {
 
  
	private static final long serialVersionUID = 1L;
	IMediator med;
 
    BtnSearch(ActionListener al, IMediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }
 
    public void execute() {
        med.search();
    }
 
}