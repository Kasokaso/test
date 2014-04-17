package com.kasalica.designPattern.Memento2;

import javax.swing.JButton;

public class RedoButtonCommand extends JButton implements CommandInterface {

	private static final long serialVersionUID = 1L;

	public RedoButtonCommand (String name){
		super(name);
	}
	@Override
	public void processEvent(TestMemento test) {
		
		System.out.println("redo");
			
			if((test.getSaveFiles() - 1) > test.getCurrentArticle()){
				
				// Increment to the current article displayed
				
				test.setCurrentArticle(test.getCurrentArticle() + 1);
				
				// Get the newer article saved and display it in JTextArea
			
				String textBoxString = test.getOriginator().restoreFromMemento( 
						test.getCaretaker().getMemento(test.getCurrentArticle()) );
				
				test.getTheArticle().setText(textBoxString);
				
				
				// Make undo clickable
				
				test.getUndoBut().setEnabled(true);
			
			} else {
				
				// Don't allow user to click Redo
				
				test.getRedoBut().setEnabled(false);
				
			}
			
		}

	}


