package com.kasalica.designPattern.Command;

import javax.swing.JButton;
import javax.swing.JList;

  class ExitButton extends JButton implements CommandInterface {

	private static final long serialVersionUID = 1L;

	public void processEvent(JList<String> localList, JList<String> remoteList) {
      System.exit(1);
    }

    public ExitButton(String name) {
      super(name);
    }
  }
