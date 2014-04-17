package com.kasalica.designPattern.Command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

  class ButtonHandler implements ActionListener {
	  
	JList<String> localList;
	JList<String> remoteList;
	
	public ButtonHandler(JList<String> localList, JList<String> remoteList){
		
		this.localList = localList;
		this.remoteList = remoteList;
		
	}
    public void actionPerformed(ActionEvent e) {
    	
      CommandInterface CommandObj = (CommandInterface) e.getSource();
      CommandObj.processEvent(localList, remoteList);
    }
  }