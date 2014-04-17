package com.kasalica.designPattern.Mediator2;

  // "Mediator" 
  abstract class Mediator
  {
    public abstract void send(String message, 
      Colleague colleague);
  }