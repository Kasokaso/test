package com.kasalica.designPattern.Mediator2;

  // "ConcreteColleague1" 
  class ConcreteColleague2 extends Colleague{
    
    public ConcreteColleague2(Mediator mediator) {
       super(mediator);
  }

    public void send(String message){
      mediator.send(message, this);
    }

    public void notify(String message){
    	
      System.out.println("Colleague2 gets message: " 
        + message);
    }
  }