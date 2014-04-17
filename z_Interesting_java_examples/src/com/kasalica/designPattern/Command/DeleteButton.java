package com.kasalica.designPattern.Command;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

  class DeleteButton extends JButton implements CommandInterface {
	  
	private static final long serialVersionUID = 1L;

	
    public void processEvent(JList<String> localList, JList<String> remoteList) {
      int index = localList.getSelectedIndex();
      if (index >= 0) {
        ((DefaultListModel<String>) localList.getModel()).remove(index);
      }

      index = remoteList.getSelectedIndex();
      if (index >= 0) {
        ((DefaultListModel<String>) remoteList.getModel()).remove(index);
      }
    }

    public DeleteButton(String name) {
      super(name);
   
    }
  }