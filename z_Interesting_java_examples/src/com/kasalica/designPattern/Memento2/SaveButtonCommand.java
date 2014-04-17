package com.kasalica.designPattern.Memento2;

import javax.swing.JButton;

public class SaveButtonCommand extends JButton implements CommandInterface{

	private static final long serialVersionUID = 1L;

	public SaveButtonCommand (String name) {
		super(name);
	}
	@Override
	public void processEvent(TestMemento test) {
		
		// Get text in JTextArea
		
		String textInTextArea = test.getTheArticle().getText();
		
		// Set the value for the current memento
		
		test.getOriginator().set(textInTextArea);
		
		// Add new article to the ArrayList
		
		test.getCaretaker().addMemento( test.getOriginator().storeInMemento() );
		
		// saveFiles monitors how many articles are saved
		// currentArticle monitors the current article displayed
		

		test.setSaveFiles(test.getSaveFiles() + 1);
		
		test.setCurrentArticle(test.getCurrentArticle() + 1);
		
		System.out.println("Save Files " + test.getSaveFiles());
		
		// Make undo clickable
		
		test.getUndoBut().setEnabled(true);

	}

}
