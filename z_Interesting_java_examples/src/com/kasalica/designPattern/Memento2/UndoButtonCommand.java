package com.kasalica.designPattern.Memento2;

import javax.swing.JButton;


public class UndoButtonCommand extends JButton implements CommandInterface {

	private static final long serialVersionUID = 1L;

	public UndoButtonCommand(String name) {
		super(name);
	}
	@Override
	public void processEvent(TestMemento test) {
		
		System.out.println("undo");
		if(test.getCurrentArticle() >= 1){
			
			// Decrement to the current article displayed
			
			test.setCurrentArticle(test.getCurrentArticle() - 1);
			
			// Get the older article saved and display it in JTextArea
		
			String textBoxString = test.getOriginator().restoreFromMemento(
					                test.getCaretaker().getMemento(test.getCurrentArticle()) );
			
			test.getTheArticle().setText(textBoxString);
			
			// Make Redo clickable
			
			test.getRedoBut().setEnabled(true);

	    }
		else {
			
			// Don't allow user to click Undo
			
			test.getUndoBut().setEnabled(false);
			
		}
    }
}

