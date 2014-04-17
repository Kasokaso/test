package com.kasalica.designPattern.Command;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

  class UploadButton extends JButton implements CommandInterface {

	private static final long serialVersionUID = 1L;
	
    public void processEvent(JList<String> localList, JList<String> remoteList) {
      int index = localList.getSelectedIndex();
      String selectedItem = localList.getSelectedValue().toString();
      ((DefaultListModel<String>) localList.getModel()).remove(index);

      ((DefaultListModel<String>) remoteList.getModel()).addElement(selectedItem);
    }

    public UploadButton(String name) {
      super(name);
    }
  }