package com.kasalica.designPattern.Command;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

  class DownloadButton extends JButton implements CommandInterface {

	private static final long serialVersionUID = 1L;

	public void processEvent(JList<String> localList, JList<String> remoteList) {
      int index = remoteList.getSelectedIndex();
      String selectedItem = remoteList.getSelectedValue().toString();
      ((DefaultListModel<String>) remoteList.getModel()).remove(index);

      ((DefaultListModel<String>) localList.getModel()).addElement(selectedItem);
    }

    public DownloadButton(String name) {
      super(name);
    }
  }