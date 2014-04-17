package com.kasalica.example.callBack;

public class Worker {
	
	public void doSomeWork(Callable myBoss){
		
		myBoss.callBackMethod();
		  // ERROR!  
        //myBoss.directMethod();
	}

}
