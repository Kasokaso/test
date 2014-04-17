package com.kasalica.designPattern.Memento2;
// Memento Design Pattern Tutorial

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestMemento extends JFrame implements KeyListener{

private static final long serialVersionUID = 3008908601822815112L;

public static void main(String[] args) {
       
	   new TestMemento();
       
   }
   
   private SaveButtonCommand saveBut;
   private UndoButtonCommand undoBut;
   private  RedoButtonCommand redoBut;
   
   // JTextArea(rows, columns)
   
   private JTextArea theArticle = new JTextArea(40,60);
   
   
   // ---------------------------------------------
   
   // Create a caretaker that contains the ArrayList 
   // with all the articles in it. It can add and
   // retrieve articles from the ArrayList
   
   Caretaker caretaker = new Caretaker();

   // The originator sets the value for the article,
   // creates a new memento with a new article, and 
   // gets the article stored in the current memento
   
   Originator originator = new Originator();
   
   int saveFiles = 0, currentArticle = 0;
   
   // ---------------------------------------------
   
   public TestMemento(){
	   
	   
	   // Set basic information for the panel that will
	   // hold all the GUI elements
	   
	   this.setSize(750,780);
	   this.setTitle("Memento Design Pattern");
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   JPanel panel1 = new JPanel();
	   
	   // Add label to the panel
	   
	   panel1.add(new JLabel("Article"));
	   
	   // Add JTextArea to the panel
	   
	   panel1.add(theArticle);
	   
	   //Add key listener to text area
	   
	   theArticle.addKeyListener(this);
	   
	   // Add the buttons & ButtonListeners to the panel
	   
	   ButtonHandler buttonHandler = new ButtonHandler(this);
	   
	   saveBut = new SaveButtonCommand("Save");
	   saveBut.addActionListener(buttonHandler);
	   
	   undoBut = new UndoButtonCommand("Undo");
	   undoBut.addActionListener(buttonHandler);
	   
	   redoBut = new RedoButtonCommand("Redo");
	   redoBut.addActionListener(buttonHandler);
	   
	  // panel1.add(saveBut);
	   panel1.add(undoBut);
	   panel1.add(redoBut);
	   
	   // Add panel to the frame that shows on screen
	   
	   this.add(panel1);
	   
	   this.setVisible(true);
	   
   }

public SaveButtonCommand getSaveBut() {
	return saveBut;
}

public void setSaveBut(SaveButtonCommand saveBut) {
	this.saveBut = saveBut;
}

public UndoButtonCommand getUndoBut() {
	return undoBut;
}

public void setUndoBut(UndoButtonCommand undoBut) {
	this.undoBut = undoBut;
}

public RedoButtonCommand getRedoBut() {
	return redoBut;
}

public void setRedoBut(RedoButtonCommand redoBut) {
	this.redoBut = redoBut;
}

public JTextArea getTheArticle() {
	return theArticle;
}

public void setTheArticle(JTextArea theArticle) {
	this.theArticle = theArticle;
}

public Caretaker getCaretaker() {
	return caretaker;
}

public void setCaretaker(Caretaker caretaker) {
	this.caretaker = caretaker;
}

public Originator getOriginator() {
	return originator;
}

public void setOriginator(Originator originator) {
	this.originator = originator;
}

public int getSaveFiles() {
	return saveFiles;
}

public void setSaveFiles(int saveFiles) {
	this.saveFiles = saveFiles;
}

public int getCurrentArticle() {
	return currentArticle;
}

public void setCurrentArticle(int currentArticle) {
	this.currentArticle = currentArticle;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	getSaveBut().processEvent(this);
	
}

@Override
public void keyReleased(KeyEvent e) {
	
	
}
   
   
}