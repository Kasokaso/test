package com.kasalica.designPattern.Mediator_Command;

import java.awt.Font;

import javax.swing.JLabel;

class LblDisplay extends JLabel {
 
	private static final long serialVersionUID = 1L;
	IMediator med;
 
    LblDisplay(IMediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }
 
}