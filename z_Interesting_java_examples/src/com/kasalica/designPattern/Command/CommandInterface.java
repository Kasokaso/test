package com.kasalica.designPattern.Command;

import javax.swing.JList;

  interface CommandInterface {
	  
    public void processEvent(JList<String> localList, JList<String> remoteList);
  }