package com.kasalica.designPattern.Command;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Snippet {
	 public static void main(String[] args) throws Exception {
	
	    JFrame frame = new FTPGUI();
	    frame.addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0);
	      }
	    });
	
	    //frame.pack();
	    frame.setSize(450, 300);
	    frame.setVisible(true);
	  }
}

